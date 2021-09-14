package aula2.teste.finals;

public class CasualGamer extends Gamer {
    @Override
    public String keyboard() {
        return "Simple Keyboard....";
    }

    public String play(final String game){
        return String.format("Jogando: %s",game);
    }
}
