package PBLs.CasaProp;

public class Casa {
    private int area;
    private int num_andares;
    private int num_quartos;
    private int num_banheiros;
    private int num_vagas_garagem;
    private Endereco endereco;
    private Proprietario proprietario;

    public Casa(int area, int num_andares, int num_quartos, int num_banheiros, int num_vagas_garagem,
                Endereco endereco, Proprietario proprietario) {
        this.area = area;
        this.num_andares = num_andares;
        this.num_quartos = num_quartos;
        this.num_banheiros = num_banheiros;
        this.num_vagas_garagem = num_vagas_garagem;
        this.endereco = endereco;
        this.proprietario = proprietario;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNum_andares() {
        return num_andares;
    }

    public void setNum_andares(int num_andares) {
        this.num_andares = num_andares;
    }

    public int getNum_quartos() {
        return num_quartos;
    }

    public void setNum_quartos(int num_quartos) {
        this.num_quartos = num_quartos;
    }

    public int getNum_banheiros() {
        return num_banheiros;
    }

    public void setNum_banheiros(int num_banheiros) {
        this.num_banheiros = num_banheiros;
    }

    public int getNum_vagas_garagem() {
        return num_vagas_garagem;
    }

    public void setNum_vagas_garagem(int num_vagas_garagem) {
        this.num_vagas_garagem = num_vagas_garagem;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}