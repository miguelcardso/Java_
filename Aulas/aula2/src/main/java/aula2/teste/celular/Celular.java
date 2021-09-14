package aula2.teste.celular;

public class Celular {

    public String nome;
    public String modelo;
    protected Integer ano;

    public Celular (String nome, String modelo, Integer ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public static String marca(){
        return "Iphone";
    }
}
