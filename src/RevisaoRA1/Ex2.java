package RevisaoRA1;

import java.util.Scanner;

public class Ex2 {  //calcular o IMC de uma pessoa
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a sua altura: ");
        float altura = input.nextFloat();
        System.out.print("Qual o seu peso: ");
        float peso = input.nextFloat();

        float imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Você está abaixo do peso normal.");
        } else if (imc <= 25) {
            System.out.println("Você está com o peso normal.");
        } else if (imc <= 30) {
            System.out.println("Você está acima do peso normal.");
        } else {
            System.out.println("Você está na faixa de obesidade.");
        }
    }
}

