package PBLs.PBL05;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static HashSet<Jogador> all_jogadores = new HashSet<>();
    public static void main(String[] args) {
        criarColecaoJogadores();
        int escolha = 0;
        while (escolha != 8) {
            escolha = escolherAcao(); //mostrar o menu de acões e retornar qual a escolha do usuário
            System.out.println();
            switch (escolha) {
                case 1 -> { //criar Principiante
                    criarPrincipiante(pedir_e_checar_Nome(), false);
                    mensagem("Jogador criado com sucesso.");
                }
                case 2 -> { //criar Profissional
                    criarProfissional(pedir_e_checar_Nome(), false);
                    mensagem("Jogador criado com sucesso.");
                }
                case 3 -> { //criar Senior
                    criarSenior(pedir_e_checar_Nome(), false);
                    mensagem("Jogador criado com sucesso.");
                }
                case 4 -> { //fazer um jogador perder pontos
                    boolean sucesso = jogador_1Ganhar_2Perder(1);
                    mensagem(sucesso ? "\nOperação realizada com sucesso." : "\nJogador não encontrado.");
                }
                case 5 -> { //fazer um jogador ganhar pontos
                    boolean sucesso = jogador_1Ganhar_2Perder(2);
                    mensagem(sucesso ? "\nOperação realizada com sucesso." : "\nJogador não encontrado.");
                }
                case 6 -> { //imprimir os dados de um jogador
                    boolean sucesso = MetodosDeImpressao.imprimirJogador(all_jogadores);
                    mensagem(sucesso ? "" : "\nJogador não encontrado.");
                }
                case 7 -> { //imprimir os dados de todos os jogadores
                    boolean sucesso = MetodosDeImpressao.imprimirDadosTodosJogadores(all_jogadores);
                    mensagem(sucesso ? "" : "\nNão há Jogadores a serem impressos.");
                }
                default -> {}
            }
        }
    }
    public static void criarColecaoJogadores() { //irá criar uma coleção de jogadores para a aplicação
        String[] nomes = {"Breno S.", "Diogo B.", "Felipe V.", "Gabriel M.", "Gustavo F.", "João P.", "Molec N.",
                          "Nicolas P.", "Vittorio C."};
        for (int i = 0; i < nomes.length; i++) {
            if (i < 3) {
                criarPrincipiante(nomes[i], true);
            } else if (i < 6) {
                criarProfissional(nomes[i], true);
            } else {
                criarSenior(nomes[i], true);
            }
        }
    }
    public static int escolherAcao() { //irá printar o menu de opções pro usuário e retornar qual acao ele escolheu
        Scanner scanner = new Scanner(System.in);
        limparTela();
        System.out.println("""
                1- Criar um objeto Principiante
                2- Criar um Profissional
                3- Criar um Senior
                4- Fazer um jogador GANHAR pontos
                5- Fazer um jogador PERDER pontos
                6- Imprimir os dados de um jogador
                7- Imprimir os dados de todos os jogadores
                8- Encerrar programa""");
        System.out.print("Que ação gostaria de executar: ");
        return scanner.nextInt();
    }
    public static void criarPrincipiante(String nome, boolean dados_randomicos) {
        //cria um objeto Principiante e adiciona a coleção jogadores
        if (dados_randomicos) {
            Random rdn = new Random();
            int score = rdn.nextInt(100);
            double bonus = 0.1 * score;
            Principiante j = new Principiante(nome, score, bonus);
            all_jogadores.add(j);
        } else {
            Principiante j = new Principiante(nome, 0, 0);
            all_jogadores.add(j);
        }
    }
    public static void criarProfissional(String nome, boolean dados_randomicos) {
        //cria um objeto Profissional e adiciona a coleção jogadores
        if (dados_randomicos) {
            Random rdn = new Random();
            int score = rdn.nextInt(100);
            double capital = score * 4;
            Profissional j = new Profissional(nome, score, capital);
            all_jogadores.add(j);
        } else {
            Profissional j = new Profissional(nome, 0, 0);
            all_jogadores.add(j);
        }
    }
    public static void criarSenior(String nome, boolean dados_randomicos) {
        //cria um objeto Senior e adiciona a coleção jogadores
        if (dados_randomicos) {
            Random rdn = new Random();
            int score = rdn.nextInt(100);
            double capital = score * 4;
            Senior j = new Senior(nome, score, capital, 10);
            all_jogadores.add(j);
        } else {
            Senior j = new Senior(nome, 0, 0, 10);
            all_jogadores.add(j);
        }
    }
    public static String pedirNome() { //irá pedir um nome e retornar o input do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInsira o nome do jogador: ");
        return scanner.nextLine();
    }
    public static String pedir_e_checar_Nome() {
        /* ALGORITMO
            1- irá pedir um nome para o usuário
            2- enquanto esse nome fornecido for vazio ("") ou igual a um nome já existente na coleção de jogadores
               a função pedirá um nome novamente
            3- ao final a função retornará um nome válido e que não foi usado ainda
        */
        String nome = "";
        int condicao = 3;
        while (condicao != 0) {
            if (condicao == 1) {
                System.out.println("Não pode ser um nome vazio.");
            } else if (condicao == 2) {
                System.out.println("Este nome já foi utilizado por outro jogador.");
            }
            nome = pedirNome();
            condicao = 0;
            if (nome.equals("")) {
                condicao = 1;
            } else {
                for (Jogador j : all_jogadores) {
                    String n = j.getNome();
                    if (nome.equals(n)) {
                        condicao = 2;
                        break;
                    }
                }
            }
        }
        return nome;
    }
    public static Jogador encontrarJogador() { //irá procurar um jogador na coleção de jogadores e retornar ele
        String nome = pedirNome();
        for (Jogador j : all_jogadores) {
            if (j.getNome().equals(nome)) {
                return j;
            }
        }
        return null; //caso esse jogador não seja encontrado é retornado null
    }
    public static boolean jogador_1Ganhar_2Perder(int acao) { //tipos de acao: 1-Ganhar; 2-Perder;
        Scanner scanner = new Scanner(System.in);
        MetodosDeImpressao.imprimirJogadoresDisponiveis(all_jogadores);
        Jogador j = encontrarJogador();
        if (j == null) {
            return false; //se o jogador buscado não existir o método retorna false
        } else {
            String s = (acao == 1) ? "ganhar" : "perder";
            System.out.print("Insira quantos pontos ele deve " + s + ": ");
            int pontos = scanner.nextInt();
            if (j instanceof Principiante jogador) {
                if (acao == 1) {
                    jogador.ganhar(pontos); //chama o método ganhar caso o parâmetro da função receba 1 (Ganhar)
                } else {
                    jogador.perder(pontos); //chama o método perder caso o parâmetro da função receba 1 (Perder)
                }
            }
            if (j instanceof Profissional jogador && !(j instanceof Senior)) {
                if (acao == 1) {
                    jogador.ganhar(pontos); //chama o método ganhar caso o parâmetro da função receba 1 (Ganhar)
                } else {
                    jogador.perder(pontos); //chama o método perder caso o parâmetro da função receba 1 (Perder)
                }
            }
            if (j instanceof Senior jogador) {
                if (acao == 1) {
                    jogador.ganhar(pontos); //chama o método ganhar caso o parâmetro da função receba 1 (Ganhar)
                } else {
                    jogador.perder(pontos); //chama o método perder caso o parâmetro da função receba 1 (Perder)
                }
            }
        }
        return true;
    }
    public static void limparTela() { //método para limpar a tela do terminal
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public static void mensagem(String mensagem) { //método que pausa a aplicação e se necessário mostra uma mensagem
        Scanner scanner = new Scanner(System.in);
        if (!mensagem.equals("")) {
            System.out.println(mensagem);
        }
        System.out.print("Pressione ENTER para continuar: ");
        scanner.nextLine();
    }
}
