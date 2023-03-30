package RevisaoRA1;

import java.util.Scanner;

public class Ex7 {  //ler dois valores informados pelo usuário e perguntar que operação deseja fazer: soma, subtração,
                    //divisão, multiplicação ou resto da divisão
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        float valor1 = input.nextFloat();
        System.out.print("Informe o segundo valor: ");
        float valor2 = input.nextFloat();
        System.out.println("\n\n");

        System.out.println("1- Soma \n2- Subtração");
        System.out.println("3- Divsão \n4- Multiplicação");
        System.out.println("5- Resto da divisão");
        System.out.print("Que operação gostaria de realizar: ");
        int op = input.nextInt();
        float resultado = 0;
        String operacao = "";
        System.out.println("\n\n");

        switch (op) {
            case 1:
                resultado = valor1 + valor2;
                operacao = "SOMA";
                break;
            case 2:
                resultado = valor1 - valor2;
                operacao = "SUBTRAÇÃO";
                break;
            case 3:
                resultado = valor1 / valor2;
                operacao = "DIVISÃO";
                break;
            case 4:
                resultado = valor1 * valor2;
                operacao = "MULTIPLICAÇÃO";
                break;
            case 5:
                resultado = valor1 % valor2;
                operacao = "RESTO DA DIVISÃO";
                break;
            default:
                System.out.println("Opção inválida.");
        }

        System.out.printf("A operação %s entre os valores %.2f e %.2f resulta em: %.2f", operacao,
                                                                                            valor1, valor2, resultado);
    }
}
