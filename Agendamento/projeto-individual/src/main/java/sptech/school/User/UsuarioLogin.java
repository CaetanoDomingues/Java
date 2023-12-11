package sptech.school.User;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sptech.school.Connection.Conexao;
import sptech.school.Interfaces.Login;

import java.util.List;

public class UsuarioLogin extends Usuario implements Login {
    private String senha;
    Conexao con = new Conexao();
    JdbcTemplate mysql = con.getConexaoDoBanco();
    public UsuarioLogin(String nome, String email,String senha) {
        super(nome, email);
        this.senha = senha;
    }

    public UsuarioLogin() {
        super();
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
    public void logar() {
        List<UsuarioLogin> usuariosDoBanco = mysql.query("""
            SELECT * FROM tbUsuario WHERE senha = ? AND email = ?""",new BeanPropertyRowMapper<>(UsuarioLogin.class),UsuarioLogin.this.getSenha(),UsuarioLogin.this.getEmail());
            System.out.println(usuariosDoBanco);

    }
}
