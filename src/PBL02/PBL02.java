package PBL02;

import java.util.Scanner;

public class PBL02 {
    public static void main(String[] args) {
        //criando o objeto teclado da classe Scanner para poder ler inputs do usuário
        Scanner teclado = new Scanner(System.in);

        //será feito a leitura dos valores para os pontos A e B e também do número de trapézios a serem calculados (n)
        System.out.println("Digite o valor para o ponto A: ");
        double a = teclado.nextDouble();
        System.out.println("Digite o valor para o ponto B: ");
        double b = teclado.nextDouble();
        System.out.println("Digite o número de trapézios: ");
        double n = teclado.nextDouble();

        if (a <= b) {     //não é possível realizar o cálculo da integral se o valor do ponto A for maior que o ponto B
            if (n > 0) {  //ou se o número de trapézios for menor ou igual a 0
                double area_total = 0;
                double altura = (b - a) / n;
                double y1 = f(a);  //cálculo para a base menor do trapézio, calculada pela função f() -> final da main
                int i = 0;
                while (i < n) {
                    a = a + altura;
                    double y2 = f(a);  //cálculo para a base maior do trapézio
                    double area_trapezio = ((y1 + y2) / 2) * altura;
                    area_total += area_trapezio;  //a área total é dada pela soma de todas as áreas dos n trapézios
                    y1 = y2;
                    i += 1;
                }
                System.out.println(area_total);
            } else {
                System.out.println("Erro: o número de trapézios deve ser maior que zero.");
            }
        } else {
            System.out.println("O valor do ponto A deve ser menor ou igual ao valor do ponto B.");
        }
    }

    public static double f(double x) {  //função para calcular a integral
        double y = (2 * Math.sin(x)) + (Math.cos(x) / 3);
        return y;
    }
}
