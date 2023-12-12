package sptech.school.Menu;

import sptech.school.User.UsuarioCadastro;
import sptech.school.User.UsuarioLogin;

import java.util.Scanner;

public class EntradaUser {
    protected String nome,email,senha;
    protected Scanner scanner;
    public EntradaUser(){
        this.scanner = new Scanner(System.in);
    }
    public void menuCadastro(){
        System.out.println("""
                Digite seu nome,email e senha:""");
        nome = scanner.nextLine();
        email = scanner.nextLine();
        senha = scanner.nextLine();
        if(nome.isEmpty() || email.isEmpty() || senha.isEmpty()){
            System.out.println("Dados inválidos");
        }else if(nome.isBlank() || email.isBlank() || senha.isBlank()){
            System.out.println("Dados inválidos");
        }else{
            UsuarioCadastro usuarioCadastro = new UsuarioCadastro(nome,email,senha);
            usuarioCadastro.cadastrar();
            System.out.println("Usuário cadastrado, redirecionando para o login");
        }
    }
    public void menuLogin(){
        System.out.println("""
                Digite seu email e senha:""");
        email = scanner.nextLine();
        senha = scanner.nextLine();
        if(email.isEmpty() || senha.isEmpty()){
            System.out.println("Dados inválidos");
        }else if(email.isBlank() || senha.isBlank()){
            System.out.println("Dados inválidos");
        }else{
            UsuarioLogin usuarioLogin = new UsuarioLogin(nome,email,senha);
            usuarioLogin.logar();
            System.out.println("Login efetuado com sucesso");
        }
    }
}
