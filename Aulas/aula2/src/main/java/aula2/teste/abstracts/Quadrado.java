package aula2.teste.abstracts;

public class Quadrado extends FormaGeometrica{
    public String nome;
    public Double area;

    public Quadrado(String nome, Double area) {
        this.nome = nome;
        this.area = area;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double area() {
        return area;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "nome='" + nome + '\'' +
                ", area=" + area +
                '}';
    }
}
