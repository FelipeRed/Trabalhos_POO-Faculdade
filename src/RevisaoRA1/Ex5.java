package RevisaoRA1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {  //ler um ano informado pelo usuário e determinar se é bissexto ou não
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Que ano gostaria de verificar se é bissexto: ");
        float ano = input.nextFloat();

        float teste1 = ano % 400;
        float teste2 = ano % 4;

        if ((teste1 == 0) || (teste2 == 0)) {
            System.out.println("O ano " + new DecimalFormat("0").format(ano) + " é bissexto.");
        } else {
            System.out.println("O ano " + new DecimalFormat("0").format(ano) + " não é bissexto.");
        }
    }
}
