package PBLs.PBL05;

public class Jogador {
    private String nome;
    protected int score;

    public Jogador(String nome, int score) {
        this.nome = nome;
        this.score = score;
    }
    public void imprimir() {
        System.out.println("\nNome: " + nome);
        System.out.println("Score: " + score);
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getNome() {
        return nome;
    }
}
