package RevisaoRA1;

import java.util.*;

public class Ex14 {  //mesma proposta do exercício 13 porém usando ArrayList
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rdn = new Random();
        System.out.print("Informe o tamanho da lista que deseja criar: ");
        int n = input.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            lista.add(rdn.nextInt(0,100));
        }

        int sum = 0;
        for (int elemento : lista) {
            sum += elemento;
        }

        int media = sum / lista.size();

        System.out.print("\nArray: ");
        for (int elemento : lista) {
            System.out.print("| " + elemento + " ");
        }
        System.out.println("\nSoma da lista: " + sum);
        System.out.println("Média da lista: " + media);
        System.out.println("Valor mínimo da lista: " + Collections.min(lista));
        System.out.println("Valor máximo da lista: " + Collections.max(lista));
    }
}
