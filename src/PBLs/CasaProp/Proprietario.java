package PBLs.CasaProp;

import java.time.LocalDate;
public class Proprietario {
    private String nome;
    private String sobrenome;
    private LocalDate data_nasc;

    public Proprietario(String nome, String sobrenome, LocalDate data_nasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data_nasc = data_nasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", data_nasc=" + data_nasc +
                '}';
    }
}
