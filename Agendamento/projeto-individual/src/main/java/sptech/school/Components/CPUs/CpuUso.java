package sptech.school.Components.CPUs;

import sptech.school.Interfaces.Registro;

public class CpuUso extends CPU implements Registro {
    protected Double uso;

    public CpuUso() {
        super();
    }
    @Override
    public void registrar() {
        uso = super.looca.getProcessador().getUso().doubleValue();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public Integer getNucleoFisico() {
        return super.getNucleoFisico();
    }

    @Override
    public Integer getNucleoLogico() {
        return super.getNucleoLogico();
    }

    public Double getUso() {
        return uso;
    }
}
