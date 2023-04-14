package PBLs.CasaProp;

public class Endereco {
    private String nome_rua;
    private int num_rua;
    private String cep;
    private String bairro;
    private String estado;
    private String cidade;
    private String complemento;

    public Endereco(String nome_rua, int num_rua, String cep, String bairro, String estado, String cidade, String complemento) {
        this.nome_rua = nome_rua;
        this.num_rua = num_rua;
        this.cep = cep;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.complemento = complemento;
    }

    // Métodos getters e setters
    public String getNome_rua() {
        return nome_rua;
    }

    public void setNome_rua(String nome_rua) {
        this.nome_rua = nome_rua;
    }

    public int getNum_rua() {
        return num_rua;
    }

    public void setNum_rua(int num_rua) {
        this.num_rua = num_rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
