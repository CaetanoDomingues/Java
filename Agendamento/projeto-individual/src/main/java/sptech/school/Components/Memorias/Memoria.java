package sptech.school.Components.Memorias;

import sptech.school.Components.Componente;

public abstract class Memoria extends Componente {
    protected Double memoriaTotal = super.looca.getMemoria().getTotal().doubleValue();

    public Memoria(){}

    public Double getMemoriaTotal() {
        return memoriaTotal;
    }
}
