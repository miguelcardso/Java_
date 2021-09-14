package aula2.teste.abstracts;

public class Programa {
    public static void main(String[] args){
        final FormaGeometrica Programa = new Quadrado("Quadrado",10.0);

        System.out.println(Programa);

        System.out.println(Programa.desenha(12,34));
        System.out.println(Programa.nome());
        System.out.println(Programa.area());

    }

}
