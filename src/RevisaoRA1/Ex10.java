package RevisaoRA1;

import java.util.Scanner;

public class Ex10 {  //programa para calcular o fatorial de um valor informado pelo usuário
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indique o número que gostaria de saber seu fatorial: ");
        int n = input.nextInt();
        int num = n;
        int result = n;

        while (num > 1) {
            result = result * (num - 1);
            num -= 1;
        }

        System.out.printf("O resultado de %s fatorial é: %s", n, result);
    }
}
