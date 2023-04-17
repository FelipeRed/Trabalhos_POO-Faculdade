package PBLs.PBL05;

public class Principiante extends Jogador {
    private double bonus;

    public Principiante(String nome, int score, double bonus) {
        super(nome, score); //chama o construtor da classe pai (Jogador)
        this.bonus = bonus;
    }
    public void imprimir() {
        super.imprimir(); //chama o método imprimir() da classe pai (Jogador)
        System.out.println("Bonus: " + bonus);
    }
    public void ganhar(int p) {
        bonus += 0.1 * p;
        p += getScore();
        setScore(p);
    }
    public void perder(int p) {
        bonus -= 0.1 * p;
        p = getScore() - p;
        setScore(p);
    }
}
