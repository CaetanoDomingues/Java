package sptech.school;


import sptech.school.Menu.EntradaUser;
import sptech.school.Menu.EntradaComp;

public class Main {
    public static void main(String[] args) {
        EntradaUser entrada = new EntradaUser();
        entrada.menuCadastro();
        entrada.menuLogin();

    }
}
