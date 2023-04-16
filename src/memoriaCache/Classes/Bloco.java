package memoriaCache.Classes;

public class Bloco {
    private LinhaDeMemoria[] bloco = new LinhaDeMemoria[2];
    private boolean dirty_bit; //atributo que irá dizer se foi modificado algum valor ou não dentro do bloco
    private boolean lru; //atributo que irá mostrar se o bloco tem o LRU

    public Bloco(String endereco, MemoriaPrincipal mp) {
        /* o construtor do bloco recebrá em seu parâmetro qual o endereço de memória que se deseja trazer para a cache,
        em seguida irá varrer a memória principal buscando as duas linhas que tenham os três primeiros bits iguais
        aos do endereço desejado
        substring(0,2) captura os 3 primeiros caracteres da String */
        int x = 0;
        for (LinhaDeMemoria enderecoMP : mp.getMemoriaPrincipal()) {
            String primeiros3Bits = enderecoMP.getEndereco().substring(0, 2);
            if (endereco.substring(0, 2).equals(primeiros3Bits)) {
                bloco[x] = enderecoMP;
                x++;
            }
        }
    }
    public void alterarValor(String endereco, int valor) {
        for (LinhaDeMemoria linha : bloco) {
            if (linha.getEndereco().equals(endereco)) {
                linha.setDado(valor);
            }
        }
        dirty_bit = true;
    }
}
