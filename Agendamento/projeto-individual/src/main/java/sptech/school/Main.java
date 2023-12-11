package sptech.school;

import sptech.school.User.UsuarioCadastro;

public class Main {
    public static void main(String[] args) {
        UsuarioCadastro usuarioCadastro = new UsuarioCadastro("Caetano","caetano@example.org","12345");
        usuarioCadastro.cadastrar();
    }
}
