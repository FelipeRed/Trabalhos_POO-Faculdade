package RevisaoRA1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex13 {  //criar um array do tamanho que o usuário pedir e retornar: a soma dos elementos, a média, o valor
                     //mínimo e o valor máximo do array
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rdn = new Random();
        System.out.print("Informe o tamanho do array que deseja criar: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rdn.nextInt(0,100);
        }

        int sum = 0;
        for (int elemento : array) {
            sum += elemento;
        }
        Arrays.sort(array);

        int media = sum / array.length;

        System.out.print("\nArray: ");
        for (int elemento : array) {
            System.out.print("| " + elemento + " ");
        }
        System.out.println("\nSoma do array: " + sum);
        System.out.println("Média do array: " + media);
        System.out.println("Valor mínimo do array: " + array[0]);
        System.out.println("Valor máximo do array: " + array[array.length - 1]);
    }
}
