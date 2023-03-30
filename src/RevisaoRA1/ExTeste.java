package RevisaoRA1;

import java.util.Random;

public class ExTeste {  //trocar o conteúdo de duas variáveis sem criar uma terceira variável de apoio
    public static void main(String[] args) {
        Random rdn = new Random();
        int x = rdn.nextInt(0,100);
        int y = rdn.nextInt(0,100);

        System.out.println("Valores inicias de X e Y : " + x + " | " + y);
        x += y;
        y = x - y;
        x = x - y;
        System.out.println("Valores finais de X e Y  : " + x + " | " + y);
    }
}
