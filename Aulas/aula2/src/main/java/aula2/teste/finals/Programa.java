package aula2.teste.finals;

public class Programa {
    public static void main(String[] args){
        final Hardcore hardcoregamer = new Hardcore();

        final Gamer gamer = new Gamer();

        final CasualGamer casualgamer = new CasualGamer();

        final var game = "PUBG"; // Essa variavel não muda.

        System.out.println(casualgamer.play(game));
    }
}
