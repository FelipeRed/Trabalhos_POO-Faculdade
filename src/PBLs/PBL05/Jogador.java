package PBLs.PBL05;

public abstract class Jogador {
    private String nome;
    private int score;

    public Jogador(String nome, int score) {
        this.nome = nome;
        this.score = score;
    }
    public abstract void imprimir();
    public abstract void ganhar(int p);
    public abstract void perder(int p);
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
