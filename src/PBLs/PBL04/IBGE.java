package PBLs.PBL04;

import java.util.HashSet;
import java.util.Set;

public class IBGE {
    public static void main(String args[])
    {
        //realizará a criação dos objetos da classe Municipio (parâmetros: população, area)
        Municipio curitiba = new Municipio(2400, 400);
        Municipio guarapuava = new Municipio( 200, 100);
        Municipio londrina = new Municipio( 800, 300);
        Municipio maringa = new Municipio( 600, 200);
        //criará um conjunto de Municipios (escolhi usar conjunto porque não se pode repetir municipios em um Estado)
        Set<Municipio> pr_municipios = new HashSet<>();
        pr_municipios.add(curitiba);
        pr_municipios.add(guarapuava);
        pr_municipios.add(londrina);
        pr_municipios.add(maringa);
        //cria-se o estado do Paraná passando como parmâmetro seu conjunto de municípios
        Estado parana = new Estado(pr_municipios);

        //aqui será repetido o mesmo processo do bloco de códigos acima só que para o estado da Bahia
        Municipio salvador = new Municipio(3000, 400);
        Municipio juazeiro = new Municipio( 400, 100);
        Municipio ilheus = new Municipio(280, 200);
        Municipio itabuna = new Municipio( 320, 300);
        Set<Municipio> ba_municipios = new HashSet<>();
        ba_municipios.add(salvador);
        ba_municipios.add(juazeiro);
        ba_municipios.add(ilheus);
        ba_municipios.add(itabuna);
        Estado bahia = new Estado(ba_municipios);

        //cria se o objeto vazio (sem parâmetros e seu construtor irá criar um conjunto vazio no seu atributo estados)
        Pais brasil = new Pais();
        //adiciona-se os estados no conjunto do atribuuto do Brasil
        brasil.addEstados(parana);
        brasil.addEstados(bahia);

        System.out.println( curitiba.densidade() ); // quadro 1
        System.out.println( parana.densidade() ); // quadro 3
        System.out.println( bahia.area() ); // quadro 2
        System.out.println( brasil.populacao() ); // quadro 4
        System.out.println( brasil.densidade() ); // quadro 5
    }
}
