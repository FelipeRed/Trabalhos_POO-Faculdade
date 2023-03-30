package RevisaoRA1;

import java.util.Scanner;

public class Ex6 {  //ler o produto que o usuário irá comprar, o preço e a quantidade. Aplicar um desconto de acordo
                    //com a quantidade comprada
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o nome do produto: ");
        String nome = input.nextLine();
        System.out.print("Insira preço do produto: ");
        float preco = input.nextFloat();
        System.out.print("Insira a quantidade que irá comprar: ");
        int qtde = input.nextInt();

        preco *= qtde;
        int desconto = 0;

        if (qtde > 50) {
            preco *= 0.75;
            desconto = 25;
        } else if (qtde > 20) {
            preco *= 0.8;
            desconto = 20;
        } else if (qtde > 10) {
            preco *= 0.9;
            desconto = 10;
        }

        if (desconto > 0) {
            System.out.println("\nParabéns, você acaba de ganhar um desconto de " + desconto + "%!");
        }
        System.out.printf("Você está comprando %s %s, o valor a pagar ficou R$%.2f.", qtde, nome, preco);
    }
}
