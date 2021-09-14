package aula2.teste.celular;

public class Modelo1 extends Celular{
    public Modelo1(final String nome, final String modelo, final Integer ano){
        super(nome, modelo, ano);
    }
    public static Integer numero(){
        return 16788;
    }

    @Override
    public String toString() {
        return "Modelo1{" +
                "Nome='" + nome + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Ano=" + ano +
                ", Numero=" + numero() +
                '}';
    }
}
