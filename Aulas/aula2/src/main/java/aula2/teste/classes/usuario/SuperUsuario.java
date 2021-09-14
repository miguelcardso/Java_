package aula2.teste.classes.usuario;

public class SuperUsuario {
    String nome; //atributos

    public SuperUsuario(final String login, final String senha) { // FICA ACESSIVEL. // Construtor
        // NÃO FICA ACESSIVEL ATRAVÉS DE UMA NOVA INSTACIA.
        //NÃO FICA ACESSIVEL ATRAVÉS DE UMA NOVA INSTACIA.
    }

    public void getLogin() { // FICA ACESSIVEL. // METODOS
    }

    public void getSenha() {
    }

    // protected está em outro pacote (pasta) é não acessivel.
}
