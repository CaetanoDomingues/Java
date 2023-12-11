package sptech.school.Components.Discos;

import com.github.britooo.looca.api.group.discos.Volume;
import sptech.school.Interfaces.Registro;

import java.util.ArrayList;
import java.util.List;

public class DiscoVolume extends Disco implements Registro {
    protected List<Volume> volumes;
    protected Double volumeDisponivel;
    protected Double volumeTotal;

    public DiscoVolume() {
        super();
        this.volumes = new ArrayList<>();
    }

    @Override
    public void registrar() {
        volumes = super.looca.getGrupoDeDiscos().getVolumes();
    }
    public Double volumeDisponivel(){
        if(volumes.size() > 0.0){
            for (Volume volume : volumes) {
                volumeDisponivel = volume.getDisponivel().doubleValue();
            }
        }else{
            return null;
        }
        return volumeDisponivel;
    }
    public Double volumeTotal(){
        if(volumes.size() > 0.0){
            for (Volume volume : volumes) {
                volumeTotal = volume.getTotal().doubleValue();
            }
        }else{
            return null;
        }
        return volumeTotal;
    }

    public List<Volume> getVolumes() {
        return volumes;
    }
}
