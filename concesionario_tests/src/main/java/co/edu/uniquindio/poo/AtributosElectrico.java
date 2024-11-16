package co.edu.uniquindio.poo.model;

public class AtributosElectrico extends AtributosCombustible{
    private int autonomia, tiempoDeCarga;

    public AtributosElectrico(int autonomia, int tiempoDeCarga){
        this.autonomia = autonomia;
        this.tiempoDeCarga = tiempoDeCarga;
    }
    public AtributosElectrico(){}

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getTiempoDeCarga() {
        return tiempoDeCarga;
    }

    public void setTiempoDeCarga(int tiempoDeCarga) {
        this.tiempoDeCarga = tiempoDeCarga;
    }

    
}
