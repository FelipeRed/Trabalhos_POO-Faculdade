import Classes.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate data_nasc = LocalDate.of(1999, 9, 5);

        Proprietario felipe = new Proprietario("Felipe", "Vermelho", data_nasc);
        Carro carro1 = new Carro("Chevrolet", "Onix 2019", felipe);
        Endereco endereco1 = new Endereco("Padre Ildefonso", 250, "80240-160", "Batel", "Paraná", "Curitiba", "ap 802");
        Casa casa1 = new Casa(200, 1, 3, 3, 2, endereco1, felipe); //casa com 200m2, 1 andar, 3 quartos, 3 banheiros e 2 vagas na garagem

        Proprietario p = casa1.getProprietario(); //pega a referencia do objeto proprietário da casa
        System.out.println(p.toString()); //imprime o proprietário
        p.setNome("Ana Luiza"); //altera o nome do proprietário

        p = carro1.getProprietario(); //pega a referencia do proprietário do carro (que é para ser o mesmo da casa)
        System.out.println(p.toString()); //imprime o proprietário para ver se a alteração do nome aconteceu em nas duas classes
    }
}
