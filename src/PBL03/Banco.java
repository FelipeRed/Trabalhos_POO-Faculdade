package PBL03;

public class Banco {
    public static void main(String[] args) {
        //criará os objetos da classe Cliente passando como parâmetro seus nomes e saldos
        Cliente jandira = new Cliente("Jandira Silva", 2500);
        Cliente sandra = new Cliente("Sandra Rodrigues", 1800);
        Cliente luciana = new Cliente("Luciana Teixeira", 5000);

        //irá utilizar o método toString() da classe Cliente em cada objeto criado previamente para imprimir seus dados
        System.out.println(jandira);
        System.out.println(sandra);
        System.out.println(luciana);
        System.out.println();

        //irá retirar mil reais da conta da Cliente Jandira e depois imprimir seus dados
        jandira.retirar(1000);
        System.out.println(jandira);
        System.out.println();

        sandra.retirar(2000);   //tentar retirar 2000 reais da conta da Cliente Sandra
        sandra.depositar(500); //depositará 500 reais na conta da Sandra
        System.out.println(sandra);  //imprimirá seus dados
        sandra.retirar(2000);  //denovo irá tentar retirar 2000 reais da sua conta
        System.out.println(sandra);  //imprimirá seus dados novamente
        System.out.println();

        //irá depositar 1000 reais na conta de Luciana e imprimir seus dados
        luciana.depositar(1000);
        System.out.println(luciana);
    }
}
