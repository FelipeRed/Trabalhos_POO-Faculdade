package PBLs.PBL04;

import java.util.Set;

public class Estado {
    private Set<Municipio> municipios;
    public Estado(Set<Municipio> municipios) {
        this.municipios = municipios;
    }
    public int populacao() {
        int soma = 0;
        //este laço for irá pegar cada municipio do atributo municipios, chamar o método população() da classe Municipio
        for (Municipio item : municipios) {  //nele, somar o resultado a variável soma e no final retorna a soma
            soma += item.populacao();        //mesma lógica para o método área()
        }
        return soma;
    }
    public double area() {
        double soma = 0;
        for (Municipio item : municipios) {
            soma += item.area();
        }
        return soma;
    }
    double densidade() { return populacao() / area(); }
}
