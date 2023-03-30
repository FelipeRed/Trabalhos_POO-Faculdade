package RevisaoRA1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex4 {  //com base nos dados de nascimento fornecidos pelo usuário, determinar sua idade
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Em que dia você nasceu: ");
        int dia_nasc = input.nextInt();
        System.out.print("Em que mês você nasceu (número): ");
        int mes_nasc = input.nextInt() - 1;
        System.out.print("Em que ano você nasceu: ");
        int ano_nasc = input.nextInt();

        Date data_hoje = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data_hoje);
        int ano_atual = calendar.get(Calendar.YEAR);          //método pra pegar o ano atual
        int mes_atual = calendar.get(Calendar.MONTH);         //método pra pegar o ano atual
        int dia_atual = calendar.get(Calendar.DAY_OF_MONTH);  //método pra pegar o ano atual

        int idade = ano_atual - ano_nasc;
        if (mes_nasc > mes_atual) {
            System.out.println(idade - 1);
        } else if (mes_nasc == mes_atual) {
            if (dia_nasc > dia_atual) {
                System.out.println(idade - 1);
            } else {
                System.out.println(idade);
            }
        } else {
            System.out.println(idade);
        }
    }
}
