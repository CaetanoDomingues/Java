package sptech.school;


import org.springframework.jdbc.core.JdbcTemplate;
import sptech.school.Connection.Conexao;

public class Main {
    public static void main(String[] args) {
    Conexao con = new Conexao();
    JdbcTemplate mysql = con.getConexaoDoBanco();

    }
}
