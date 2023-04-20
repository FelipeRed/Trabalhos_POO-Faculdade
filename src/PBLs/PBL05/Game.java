package PBLs.PBL05;

import java.util.HashSet;
import java.util.Scanner;

public class Game {
    private static HashSet<Jogador> jogadores = new HashSet<>();
    public static void main(String[] args) {
        criarColecaoJogadores(); //irá criar a coleção básica de jogadores
        int escolha = 0;
        while (escolha != 8) {
            escolha = escolherAcao(); //mostrar o menu de acões e retornar qual a escolha do usuário
            System.out.println();
            switch (escolha) {
                case 1 -> { //criar Principiante
                    criarPrincipiante(pedir_e_checar_Nome());
                    mensagem("Jogador criado com sucesso.");
                }
                case 2 -> { //criar Profissional
                    criarProfissional(pedir_e_checar_Nome());
                    mensagem("Jogador criado com sucesso.");
                }
                case 3 -> { //criar Senior
                    criarSenior(pedir_e_checar_Nome());
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
                    boolean sucesso = imprimirJogador();
                    mensagem(sucesso ? "" : "\nJogador não encontrado.");
                }
                case 7 -> { //imprimir os dados de todos os jogadores
                    boolean sucesso = imprimirDadosTodosJogadores();
                    mensagem(sucesso ? "" : "\nNão há Jogadores a serem impressos.");
                }
                default -> {
                    break;
                }
            }
        }
    }
    public static void criarColecaoJogadores() { //irá criar a coleção básica de jogadores
        String[] nomes = {"Breno", "Diogo", "Felipe", "Gabriel", "Gustavo", "João", "Molec", "Nicolas", "Vittorio"};
        for (int i = 0; i < nomes.length; i++) {
            if (i < 3) {
                criarPrincipiante(nomes[i]);
            } else if (i < 6) {
                criarProfissional(nomes[i]);
            } else {
                criarSenior(nomes[i]);
            }
        }
    }
    public static int escolherAcao() { //irá printar o menu de opções pro usuário e retornar o valor da sua escolha
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
    public static void criarPrincipiante(String nome) {
        //irá criar um objeto do tipo Principiante e adicionar a coleção de jogadores
        Principiante j = new Principiante(nome, 0, 0);
        jogadores.add(j);
    }
    public static void criarProfissional(String nome) {
        //irá criar um objeto do tipo Profissional e adicionar a coleção de jogadores
        Profissional j = new Profissional(nome, 0, 0);
        jogadores.add(j);
    }
    public static void criarSenior(String nome) {
        //irá criar um objeto do tipo Senior e adicionar a coleção de jogadores
        Senior j = new Senior(nome, 0, 0, 0);
        jogadores.add(j);
    }
    public static String pedirNome() { //irá pedir um nome e retornar a String dada
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInsira o nome do jogador: ");
        return scanner.nextLine();
    }
    public static String pedir_e_checar_Nome() {
        //enquanto o nome fornecido for vazio ("") ou igual a um nome já existente na coleção de jogadores a função
        //continuará pendindo um nome, ao final retornará a String nome validada
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
                for (Jogador j : jogadores) {
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
        for (Jogador j : jogadores) {
            if (j.getNome().equals(nome)) {
                return j;
            }
        }
        return null; //caso não seja encontrado nenhum jogador é retornado null
    }
    public static boolean jogador_1Ganhar_2Perder(int acao) { //tipos de acao: 1-Ganhar; 2-Perder;
        Scanner scanner = new Scanner(System.in);
        imprimirJogadoresDisponiveis();
        Jogador j = encontrarJogador();
        if (j == null) {
            return false; //se o jogador buscado não existir o método retorna false
        } else {
            System.out.print("Insira quantos pontos ele deve ganhar: ");
            int p = scanner.nextInt();
            if (j instanceof Principiante jogador) { //verifico o tipo de jogador e já faço o casting no próprio if
                if (acao == 1) {
                    jogador.ganhar(p); //chamo o método ganhar caso a ação desejada seja 1 (Ganhar)
                } else {
                    jogador.perder(p); //chamo o método perder caso a ação desejada seja 2 (Perder)
                }
            } else if (j instanceof Profissional jogador) {
                if (j instanceof Senior jog) {
                    if (acao == 1) {
                        jog.ganhar(p);
                    } else {
                        jog.perder(p);
                    }
                } else {
                    if (acao == 1) {
                        jogador.ganhar(p);
                    } else {
                        jogador.perder(p);
                    }
                }
            }
        }
        return true;
    }
    public static boolean imprimirJogador() { //irá chamar o método imprimir() do jogador desejado
        imprimirJogadoresDisponiveis();
        Jogador j = encontrarJogador();
        if (j == null) {
            return false; //se o jogador não existir o retorno é false
        } else {
            j.imprimir();
        }
        return true;
    }
    public static boolean imprimirDadosTodosJogadores() {
        if (jogadores.isEmpty()) {
            return false; //se a coleção de Jogadores estiver vazia o retorno é false
        }
        for (Jogador j : jogadores) {
            j.imprimir();
        }
        return true;
    }
    public static void imprimirJogadoresDisponiveis() { //irá mostrar os nomes dos Jogadores cadastrados
        System.out.println("Jogadores disponíveis: ");
        for (Jogador j : jogadores) {
            System.out.print(" " + j.getNome() + " |");
        }
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
