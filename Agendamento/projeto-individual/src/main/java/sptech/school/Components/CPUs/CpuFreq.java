package sptech.school.Components.CPUs;

import sptech.school.Interfaces.Registro;

public class CpuFreq extends CPU implements Registro {
    protected Double frequencia;
    @Override
    public void registrar() {
        frequencia = super.looca.getProcessador().getFrequencia().doubleValue();
    }

    public CpuFreq() {
        super();
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

    public Double getFrequencia() {
        return frequencia;
    }
}
