package RevisaoRA1;

import java.util.Scanner;

public class Ex8 {  //calcular a média de um aluno conforme suas notas
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe sua nota do RA1 (de 0 a 10): ");
        float ra1 = input.nextFloat();
        System.out.print("Informe sua nota do RA2 (de 0 a 10): ");
        float ra2 = input.nextFloat();
        System.out.print("Informe sua nota do RA3 (de 0 a 10): ");
        float ra3 = input.nextFloat();
        System.out.println("\n\n");

        double media = (0.3 * ra1) + (0.3 * ra2) + (0.4 * ra3);

        if (media > 6) {
            System.out.println("Resultado: APROVADO");
        } else if (media > 4) {
            System.out.println("Resultado: VERIFICAÇÃO SUPLEMENTAR");
        } else {
            System.out.println("Resultado: REPROVADO");
        }
    }
}
