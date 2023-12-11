package sptech.school.Components.CPUs;

import sptech.school.Components.Componente;

public abstract class CPU extends Componente{
    protected final String nome = super.looca.getProcessador().getNome();
    protected Integer nucleoFisico = super.looca.getProcessador().getNumeroCpusFisicas();
    protected Integer nucleoLogico = super.looca.getProcessador().getNumeroCpusLogicas();

    public CPU() {}

    public String getNome() {
        return nome;
    }

    public Integer getNucleoFisico() {
        return nucleoFisico;
    }

    public Integer getNucleoLogico() {
        return nucleoLogico;
    }
}
