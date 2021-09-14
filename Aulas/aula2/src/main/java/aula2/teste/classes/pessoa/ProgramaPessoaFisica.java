package aula2.teste.classes.pessoa;

public class ProgramaPessoaFisica {
    public static void main(String[] args){
        final var pessoaFisica= new PessoaFisica(12,56,"miguel");
        System.out.println(pessoaFisica.print());
    }
}
