package PBLs.PBL05;

import java.util.HashSet;

import static PBLs.PBL05.Game.encontrarJogador;

public class MetodosDeImpressao {
    //classe que conterá métodos utilizados para imprimir todos os jogadores em uma tabela
    //com os itens devidamente centralizados nas colunas
    public static void imprimirJogadoresDisponiveis(HashSet<Jogador> all_jogadores) {
        //irá imprimir quais jogadores estão disponíveis na aplicação
        System.out.println("Jogadores disponíveis:");
        for (Jogador j : all_jogadores) {
            System.out.print(" " + j.getNome() + " |");
        }
    }
    public static boolean imprimirJogador(HashSet<Jogador> all_jogadores) { //irá chamar o método imprimir() do jogador desejado
        imprimirJogadoresDisponiveis(all_jogadores);
        Jogador j = encontrarJogador();
        if (j == null) {
            return false; //se o jogador não existir o retorno é false
        } else {
            j.imprimir();
        }
        return true;
    }
    public static boolean imprimirDadosTodosJogadores(HashSet<Jogador> all_jogadores) { //imprimirá todos os jogadores (por tipo) e os seus atributos
        if (all_jogadores.isEmpty()) {
            return false; //se a coleção de Jogadores estiver vazia o retorno é false
        }
        imprimir_Todos_Os("PRINCIPIANTES", all_jogadores);
        imprimir_Todos_Os("PROFISSIONAIS", all_jogadores);
        imprimir_Todos_Os("SENIORS", all_jogadores);
        return true;
    }
    public static void imprimir_Todos_Os(String tipoJogadores, HashSet<Jogador> all_jogadores) {
        switch (tipoJogadores) {
            case "PRINCIPIANTES" -> {
                System.out.println("PRINCIPIANTES");
                //1a linha: nomes dos jogadores Principiantes
                //2a linha: o score de cada um dos jogadores
                //3a linha: o bonus de cada um dos jogadores
                for (int i = 0; i < 3; i++) { //a variável i indicará qual a linha da tabela está sendo impressa
                    if (i == 0) System.out.print("Nome  |");
                    if (i == 1) System.out.print("\nScore |");
                    if (i == 2) System.out.print("\nBonus |");
                    for (Jogador j : all_jogadores) {
                        if (j instanceof Principiante jogador) {
                            if (i == 0) System.out.print(" " + jogador.getNome() + " |");
                            if (i == 1) imprimir_Score_Centralizado(jogador);
                            if (i == 2) imprimir_Bonus_Centralizado(jogador);
                        }
                    }
                }
                System.out.println("\n");
            }
            case "PROFISSIONAIS" -> {
                System.out.println("PROFISSIONAIS");
                for (int i = 0; i < 3; i++) {
                    if (i == 0) System.out.print("Nome    |");
                    if (i == 1) System.out.print("\nScore   |");
                    if (i == 2) System.out.print("\nCapital |");
                    for (Jogador j : all_jogadores) {
                        if (j instanceof Profissional jogador) {
                            if (i == 0) System.out.print(" " + jogador.getNome() + " |");
                            if (i == 1) imprimir_Score_Centralizado(jogador);
                            if (i == 2) imprimir_Capital_Centralizado(jogador);
                        }
                    }
                }
                System.out.println("\n");
            }
            case "SENIORS" -> {
                System.out.println("SENIORS");
                for (int i = 0; i < 3; i++) {
                    if (i == 0) System.out.print("Nome   |");
                    if (i == 1) System.out.print("\nScore  |");
                    if (i == 2) System.out.print("\nPrêmio |");
                    for (Jogador j : all_jogadores) {
                        if (j instanceof Senior jogador) {
                            if (i == 0) System.out.print(" " + jogador.getNome() + " |");
                            if (i == 1) imprimir_Score_Centralizado(jogador);
                            if (i == 2) imprimir_Premio_Centralizado(jogador);
                        }
                    }
                }
                System.out.println("\n");
            }
        }
    }
    public static void imprimir_Score_Centralizado(Jogador j) {
        int nomeLengh = j.getNome().length();
        int scoreLengh = String.valueOf(j.getScore()).length(); //para capturar a lengh de um número
        System.out.print(" " + j.getScore());
        for (int k = 0; k < nomeLengh - scoreLengh; k++) { //irá adicionar espaços vazios ao lado do score para que
            System.out.print(" ");                         //ele fique com a mesma lengh do nome
        }                                                  //exemplo:  nome = Felipe   -> lengh = 6
                                                           //         score = "10    " -> lengh = 6
        System.out.print(" |");
    }
    public static void imprimir_Bonus_Centralizado(Principiante j) {
        int nomeLengh = j.getNome().length();
        double bonus = Math.round(j.getBonus() * 10.0) / 10.0; //irá pegar o bonus com apenas uma casa depois da vírgula
        int bonusLengh = String.valueOf(bonus).length(); //captura a lengh do bonus
        System.out.print(" " + bonus);
        for (int k = 0; k < nomeLengh - bonusLengh; k++) { //mesma lógica do for explicado no método acima
            System.out.print(" ");
        }
        System.out.print(" |");
    }
    public static void imprimir_Capital_Centralizado(Profissional j) { //as próximas funções têm a mesma lógica
        int nomeLengh = j.getNome().length();                          //explicada anteriormente
        double capital = Math.round(j.getCapital() * 10.0) / 10.0;
        int capitalLengh = String.valueOf(capital).length();
        System.out.print(" " + capital);
        for (int k = 0; k < nomeLengh - capitalLengh; k++) {
            System.out.print(" ");
        }
        System.out.print(" |");
    }
    public static void imprimir_Premio_Centralizado(Senior j) {
        int nomeLengh = j.getNome().length();
        double premio = Math.round(j.getPremio() * 10.0) / 10.0;
        int premioLengh = String.valueOf(premio).length();
        System.out.print(" " + premio);
        for (int k = 0; k < nomeLengh - premioLengh; k++) {
            System.out.print(" ");
        }
        System.out.print(" |");
    }
}
