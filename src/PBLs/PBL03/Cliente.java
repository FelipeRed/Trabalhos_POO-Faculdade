package PBLs.PBL03;

public class Cliente {
    private String nome;
    private double saldo;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void retirar(double valor) {
        if (saldo > valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Seu saldo atual é de " + saldo + " reais, logo, você não pode retirar o valor " +
                               "solicitado de " + valor + " reais.");
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "  |  Saldo: " + saldo;
    }
}
