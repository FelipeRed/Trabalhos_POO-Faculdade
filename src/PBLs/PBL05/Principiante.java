package PBLs.PBL05;

public class Principiante extends Jogador {
    private double bonus;

    public Principiante(String nome, int score, double bonus) {
        super(nome, score); //chama o construtor da classe pai (Jogador)
        this.bonus = bonus;
    }
    public void imprimir() { //sobrescrita do método imprimir() da classe pai
        System.out.println("\nNome : " + super.getNome());
        System.out.println("Score: " + super.getScore());
        System.out.println("Bonus: " + bonus);
    }
    public void ganhar(int p) { //sobrescrita do método ganhar() da classe pai
        bonus += 0.1 * p;
        p += getScore();
        setScore(p);
    }
    public void perder(int p) { //sobrescrita do método perder() da classe pai
        bonus -= 0.1 * p;
        p = getScore() - p;
        setScore(p);
    }
    public double getBonus() {
        return bonus;
    }
}
