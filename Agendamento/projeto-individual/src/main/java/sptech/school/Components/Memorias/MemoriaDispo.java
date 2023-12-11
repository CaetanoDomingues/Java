package sptech.school.Components.Memorias;

import sptech.school.Interfaces.Registro;

public class MemoriaDispo extends Memoria implements Registro {
    protected Double disponivel;

    public MemoriaDispo() {
        super();
    }

    @Override
    public void registrar() {
        disponivel = super.looca.getMemoria().getDisponivel().doubleValue();
    }

    public Double getDisponivel() {
        return disponivel;
    }
}
