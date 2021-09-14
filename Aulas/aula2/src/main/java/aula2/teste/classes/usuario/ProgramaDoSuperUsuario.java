package aula2.teste.classes.usuario;

public class ProgramaDoSuperUsuario {

    public static void main(String[] args) {
      final var superUsuario = new SuperUsuario("root","123456");

      superUsuario.getLogin();
      superUsuario.getSenha();
      String aa = superUsuario.nome;

    }


}
