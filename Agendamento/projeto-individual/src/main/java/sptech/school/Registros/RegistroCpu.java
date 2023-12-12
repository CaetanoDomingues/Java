package sptech.school.Registros;

import org.springframework.jdbc.core.JdbcTemplate;
import sptech.school.Components.CPUs.CpuFreq;
import sptech.school.Connection.Conexao;

import java.util.Timer;
import java.util.TimerTask;

public class RegistroCpu implements Runnable{
    Conexao con = new Conexao();
    JdbcTemplate mysql = con.getConexaoDoBanco();
    @Override
    public void run() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

            }
        };
        Timer timer = new Timer();
    }


}
