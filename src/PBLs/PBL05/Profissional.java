package PBLs.PBL05;

public class Profissional extends Jogador{
    private double capital;
    public Profissional(String nome, int score, double capital) {
        super(nome, score); //chama o construtor da classe pai (Jogador)
        this.capital = capital;
    }
    public void imprimir() {
        super.imprimir(); //chama o método imprimir() da classe pai (Jogador)
        System.out.println("Capital: " + capital);
    }
    public void ganhar(int p) {
        capital += p * 4;
        setScore(p);
    }
    public void perder(int p) {
        capital -= p * 4;
        p = getScore() - p;
        setScore(p);
    }
}
