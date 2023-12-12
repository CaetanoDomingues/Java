package sptech.school.Menu;

import org.springframework.jdbc.core.JdbcTemplate;
import sptech.school.Connection.Conexao;

import java.util.Scanner;

public class EntradaComp {
    String tipoComp;
    Conexao con = new Conexao();
    JdbcTemplate mysql = con.getConexaoDoBanco();
    Scanner scanner;
    public EntradaComp(){
        this.scanner = new Scanner(System.in);
        this.tipoComp = tipoComp;
    }
    public void inserirComponente(){
        System.out.println("""
                Qual componente deseja inserir:""");
        tipoComp = scanner.nextLine();
        if(tipoComp.isBlank() || tipoComp.isEmpty()){
            System.out.println("Dados inválidos");
        }else{
            mysql.update("INSERT INTO tbComponente (tipo) VALUES (?)",getTipoComp());
            System.out.println("Componente inserido corretamente");
        }
    }
    public void selecionarComponente(){
        System.out.println("""
                Qual o componente que deseja fazer a leitura:""");
        String tipoEscolhido = scanner.nextLine();
        if(tipoEscolhido.isEmpty() || tipoEscolhido.isBlank()){
            System.out.println("Dados inválidos");
        }else{
            mysql.update("SELECT * FROM tbComponente WHERE tipo = ?",tipoEscolhido);
            System.out.println("O componente foi selecionado");
        }
    }

    public String getTipoComp() {
        return tipoComp;
    }
}
