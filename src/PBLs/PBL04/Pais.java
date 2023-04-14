package PBLs.PBL04;

import java.util.HashSet;
import java.util.Set;

public class Pais {
    private Set<Estado> estados;
    public Pais() {
        Set<Estado> estados = new HashSet<>();
        this.estados = estados;
    }

    int populacao() {
        int soma = 0;
        //este laço for irá pegar cada estado do atributo estados, chamar o método população() da classe Estado nele,
        for (Estado item : estados) {  //somar o resultado a variável soma e no final retorna a soma
            soma += item.populacao();  //mesma lógica para o método área()
        }
        return soma;
    }
    double area() {
        double soma = 0;
        for (Estado item : estados) {
            soma += item.area();
        }
        return soma;
    }
    double densidade() { return populacao() / area(); }

    public void addEstados(Estado estado) { estados.add(estado); }
}
