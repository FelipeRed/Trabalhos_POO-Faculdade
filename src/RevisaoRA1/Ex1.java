package RevisaoRA1;;

import java.util.Scanner;

public class Ex1 {  //ler a velocidade de um carro e determinar se foi multado ou não
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a velocidade do carro: ");
        float v_maxima = input.nextFloat();
        System.out.print("Qual a velocidade máxima da via: ");
        float v_permitida = input.nextFloat();

        float calc = v_maxima - v_permitida;

        if (calc <= 0) {
            System.out.println("Você não foi multado.");
        } else if (calc <= 10) {
            System.out.println();
            System.out.println("Você foi multado em R$100,00.");

        } else if (calc <= 30) {
            System.out.println();
            System.out.println("Você foi multado em R$183,00.");
        } else {
            System.out.println();
            System.out.println("Você foi multado em R$347,00.");
        }
    }
}
