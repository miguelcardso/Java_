package aula2.teste.statics;

public class Programa {
    public static void main(String[] args){
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "bipede";

        final Cachorro viralata = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viralata.zoologia);
        Cachorro.late();
    }

}
