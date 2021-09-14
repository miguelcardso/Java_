package aula2.teste.classes.pessoa;

public class Pessoa {
    private Integer idade;
    private Float peso;
    private String name;

    public Pessoa(){

    }

    public Pessoa(Integer idade, Float peso,String name) {
        this.idade = idade;
        this.peso = peso;
        this.name = name;

    }

    public Integer getIdade() {
        return idade;
    }

    public Float getPeso() {
        return peso;
    }

    public String getName() {
        return name;
    }

    protected String print(){
        return String.format("Seu nome :%s Tem %d anos, pesa %f kg",name,idade,peso);
    }
}
