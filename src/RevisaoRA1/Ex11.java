package RevisaoRA1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex11 {  //sortear um número de 0 a 1000 e pedir para o usuário encontrar qual é esse número (dando dicas
                     //caso seu palpite esteja MAIOR ou MENOR que o número sorteado
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rdn = new Random();
        int num = rdn.nextInt(0,1000);
        ArrayList<Integer> tentativas = new ArrayList<>();
        System.out.println("Tente adivinhar o número sorteado entre 0 e 1000.");

        System.out.print("Digite seu palpite: ");
        int palpite = input.nextInt();

        while (palpite != num) {
            tentativas.add(palpite);

            if (palpite > num) {
                System.out.println("\n\nSeu palpite é MAIOR que o número sorteado.");
            } else {
                System.out.println("\n\nSeu palpite é MENOR que o número sorteado.");
            }

            System.out.print("Tentativas erradas: ");
            printLista(tentativas);
            System.out.print("\nDigite seu palpite: ");
            palpite = input.nextInt();
        }

        System.out.println("Parabéns você encontrou o número sorteado: " + num);
    }
    public static void printLista(ArrayList<Integer> lista) {
        for (int item : lista) {
            System.out.print("| " + item + " ");
        }
    }
}
