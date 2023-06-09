package PBLs.PBL05;

public class Senior extends Profissional {
    private double premio;

    public Senior(String nome, int score, double capital, double premio) {
        super(nome, score, capital); //chama o construtor da classe pai (Profissional)
        this.premio = premio;
    }
    public void imprimir() { //sobrescrita do método imprimir() da classe pai
        super.imprimir(); //chama o método imprimir() da classe pai (Profissional)
        System.out.println("Prêmio : " + premio);
    }
    public void ganhar(int p) { //sobrescrita do método ganhar() da classe pai
        super.ganhar(p); //chama o método ganhar() da classe pai (Profissional)
        premio *= 2;
    }
    public void perder(int p) { //sobrescrita do método perder() da classe pai
        super.perder(p); //chama o método perder() da classe pai (Profissional)
        premio /= 2;
    }
    public double getPremio() {
        return premio;
    }
}
