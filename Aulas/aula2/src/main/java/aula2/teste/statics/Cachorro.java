package aula2.teste.statics;

public class Cachorro {
    public static String zoologia = "Quadrupede"; // Se mudar a variavel irá mudar todas as instacias.

    public static String getZoologia() {
        return zoologia;
    }

    public static String late(){
        return "Au Au";
    }
}
