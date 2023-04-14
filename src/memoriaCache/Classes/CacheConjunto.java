package memoriaCache.Classes;

import java.util.HashMap;

public class CacheConjunto {
    private int tamanho_conjunto; // Atributo que será passado pelo usuario para definir o tamanho da cache.
    private HashMap<Integer, HashMap<Integer, Integer>> cache = new HashMap<>(); // Atributo que representará o conjunto, que guardará dentro dele um HashMap de inteiros que será o bloco.
    private HashMap<Integer, Integer> bloco = new HashMap<>(); // Atributo bloco que será armazenado nos conjuntos da cache.

    public CacheConjunto(int tamanho_conjunto){
        this.tamanho_conjunto = tamanho_conjunto;
        for (int i = 0; i < 2; i++) {
            bloco.put(i, -1);
        }
        for (int i = 0; i < tamanho_conjunto; i++) {
            cache.put(i, bloco);
        }
    }
    public void printarCache() {
        System.out.println("C | E | D"); // Explicando qual valor é qual (C = Conjunto, E = Endereco, D = Dado)
        for (int conjunto = 0; conjunto < 2; conjunto++){ // A "cache" terá 2 conjuntos (0 e 1) onde serão aramazenados 2 endereços em cada.
            HashMap cache_conjunto = cache.get(conjunto); // Será acessado o hashmap que guarda os dois endereços (0 e 1) dos conjuntos (0 e 1).
            for (int endereco = 0; endereco < 2; endereco++){ // É passado entre os dois endereços presentes nos conjuntos.
                int dado = (int) cache_conjunto.get(endereco); // O valor guardado nesses 2 endereços serão guardados na variável "cache_endereco".
                System.out.printf("%d | %d | %d%n", conjunto, endereco, dado); // O conjunto e valor do endereco serão printados na tela do usuario.
            }
        }
    }
}
