package PBL01;

import java.util.Scanner;

public class PBL01 {
    public static void main(String[] args) {
        //criando o objeto teclado da classe Scanner para poder ler inputs do usuário
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro termo da PA: ");
        double a_1 = teclado.nextDouble();  //captura o valor que o usuário colocar no input
        System.out.println("Digite a razão da PA: ");
        double r = teclado.nextDouble();
        System.out.println("Digite o número de termos da PA: ");
        int n = teclado.nextInt();

        //cálculos para determinar o último termo da PA e a soma de todos os seus termos
        double a_n = a_1 + (n - 1) * r;
        double s_n = (a_1 + a_n) * n / 2;

        System.out.println("O último termo da PA: " + a_n);
        System.out.println("A soma dos termos da PA: " + s_n);

    }
}
