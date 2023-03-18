package Classes;

import Classes.Proprietario;

public class Carro {
    private String marca;
    private String modelo;
    private Proprietario proprietario;

    public Carro(String marca, String modelo, Proprietario proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}