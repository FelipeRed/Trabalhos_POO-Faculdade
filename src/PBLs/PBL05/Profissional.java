package PBLs.PBL05;

import PBLs.PBL05.Jogador;

public class Profissional extends Jogador {
    private double capital;
    public Profissional(String nome, int score, double capital) {
        super(nome, score); //chama o construtor da classe pai (Jogador)
        this.capital = capital;
    }
    public void imprimir() { //sobrescrita do método imprimir() da classe pai
        System.out.println("\nNome   : " + super.getNome());
        System.out.println("Score  : " + super.getScore());
        System.out.println("Capital: " + capital);
    }
    public void ganhar(int p) { //sobrescrita do método ganhar() da classe pai
        capital += p * 4;
        setScore(p);
    }
    public void perder(int p) { //sobrescrita do método perder() da classe pai
        capital -= p * 4;
        p = getScore() - p;
        setScore(p);
    }
    public double getCapital() {
        return capital;
    }
}
