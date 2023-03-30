package RevisaoRA1;

import java.util.Scanner;

public class Ex12 {  //ordenar um vetor sem utilizar o método Arrays.sort(vetor)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] vetor = new float[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            float n = input.nextFloat();
            vetor[i] = n;
        }

        System.out.print("\nVetor inicial: ");
        printVetor(vetor);

        int execucoes = 0;
        boolean emOrdem = verificarSeOrdenado(vetor);
        while (!emOrdem) {
            vetor = ordenarVetor(vetor);
            emOrdem = verificarSeOrdenado(vetor);
            execucoes += 1;
        }

        System.out.print("\nVetor final:   ");
        printVetor(vetor);
        System.out.println("\nNúmero de execuções: " + execucoes);
    }

    public static boolean verificarSeOrdenado(float[] vetor) {
        boolean ordenado = false;
        for (int j = 0; j < vetor.length-1; j++) {
            if (vetor[j] > vetor[j+1]) {
                ordenado = false;
                break;
            } else {
                ordenado = true;
            }
        }
        return ordenado;
    }
    public static float[] ordenarVetor(float[] vetor) {
        //verificará se pode trocar o vetor[k] com seu próximo número (vetor[k+1])
        for (int k = 0; k < vetor.length-1; k++) {
            float var_apoio;
            if (vetor[k] > vetor[k+1]) {
                var_apoio = vetor[k];
                vetor[k] = vetor[k+1];
                vetor[k+1] = var_apoio;
            }
            //verificará se também pode trocar o vetor[k] com seu número anterior (vetor[k-1])
            if (k > 0) {
                if (vetor[k] < vetor[k-1]) {
                    var_apoio = vetor[k-1];
                    vetor[k-1] = vetor[k];
                    vetor[k] = var_apoio;
                }
            }
            System.out.println();
            printVetor(vetor);
        }
        return vetor;
    }
    public static void printVetor(float[] vetor) {
        for (float item : vetor) {
            System.out.print("| " + item + " ");
        }
    }
}
