package RevisaoRA1;

import java.util.Random;
import java.util.Scanner;

public class Ex15 {  //criar duas matrizes com o número de linhas e colunas que o usuário pedir e depois retorar a soma
                     //dessas duas matrizes
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indique o número de linhas das matrizes: ");
        int linhas = input.nextInt();
        System.out.print("Indique o número de colunas das matrizes: ");
        int colunas = input.nextInt();

        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];

        preencherMatriz(matriz1);
        preencherMatriz(matriz2);

        int[][] matrizSum = somarMatrizes(matriz1, matriz2);

        System.out.println("Matriz 1:");
        printarMatriz(matriz1);
        System.out.println("Matriz 2:");
        printarMatriz(matriz2);
        System.out.println("Matriz Soma:");
        printarMatriz(matrizSum);
    }
    public static void preencherMatriz(int[][] matriz) {
        Random rdn = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rdn.nextInt(0, 10);
            }
        }
    }
    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int l = matriz1.length;
        int c = matriz1[0].length;
        int[][] matriz3 = new int[l][c];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                int num = matriz1[i][j] + matriz2[i][j];
                matriz3[i][j] = num;
            }
        }
        return matriz3;
    }
    public static void printarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("| " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
