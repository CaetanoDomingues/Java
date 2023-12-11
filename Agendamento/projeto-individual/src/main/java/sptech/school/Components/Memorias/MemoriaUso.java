package sptech.school.Components.Memorias;

import sptech.school.Interfaces.Registro;

public class MemoriaUso extends Memoria implements Registro {
    protected Double uso;
    public MemoriaUso(){
        super();
    }

    @Override
    public void registrar() {
        uso = super.looca.getMemoria().getEmUso().doubleValue();
    }

    public Double getUso() {
        return uso;
    }
}
