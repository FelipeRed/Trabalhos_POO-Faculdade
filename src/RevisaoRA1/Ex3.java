package RevisaoRA1;

import java.util.Scanner;

public class Ex3 {  //conversor de graus celsius
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a temperatura em graus celsius no momento: ");
        double temp = input.nextFloat();

        double farenheit = temp * 1.8 + 32;
        double kelvin = temp + 273.15;
        double reaumur = temp * 0.8;
        double rankine = temp * 1.8 + 32 + 459.67;

        System.out.printf("%.2f graus celsius em: ", temp);
        System.out.printf("\nFarenheit - %.2f", farenheit);
        System.out.printf("\nKelvin - %.2f", kelvin);
        System.out.printf("\nRéamur - %.2f", reaumur);
        System.out.printf("\nRankine - %.2f", rankine);
    }
}
