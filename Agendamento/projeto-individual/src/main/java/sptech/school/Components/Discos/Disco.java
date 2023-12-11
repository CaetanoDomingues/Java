package sptech.school.Components.Discos;

import sptech.school.Components.Componente;

public abstract class Disco extends Componente {
    protected Double tamanhoTotal = super.looca.getGrupoDeDiscos().getTamanhoTotal().doubleValue();

    public Disco(){}

    public Double getTamanhoTotal() {
        return tamanhoTotal;
    }
}
