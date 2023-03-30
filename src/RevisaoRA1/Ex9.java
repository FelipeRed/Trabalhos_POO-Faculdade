package RevisaoRA1;

import java.util.ArrayList;

public class Ex9 {  //identificar todos os números entre 1000 e 1999 que quando divididos por 11 resultam em resto = 5
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1000; i < 2000; i++) {
            if (i % 11 == 5) {
                lista.add(i);
            }
        }

        System.out.println("Valores entre 1000 e 2000 que quando divididos por 11 restam 5.");
        for (int item : lista) {
            System.out.println(item);
        }
    }
}
