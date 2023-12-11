package sptech.school.User;

import org.springframework.jdbc.core.JdbcTemplate;
import sptech.school.Connection.Conexao;
import sptech.school.Interfaces.Cadastro;

public class UsuarioCadastro extends Usuario implements Cadastro {
    Conexao con = new Conexao();
    JdbcTemplate mysql = con.getConexaoDoBanco();
    private String senha;
    public UsuarioCadastro(String nome, String email,String senha) {
        super(nome, email);
        this.senha = senha;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void cadastrar() {
            mysql.update(" INSERT INTO tbUsuario(nome,email,senha) VALUES (?,?,?) ",
                    UsuarioCadastro.super.getNome(),UsuarioCadastro.super.getEmail(),UsuarioCadastro.this.getSenha());

    }
}
