package co.edu.uniquindio.poo.model;

public class AtributosElectrico extends AtributosCombustible{
    private  int tiempoDeCarga, capacadadBateria, autonomiaElectrica;
   

    public AtributosElectrico(String autonomia, int tiempoDeCarga, int capacadadBateria){
        super(autonomia);
        this.tiempoDeCarga = tiempoDeCarga;
        this.capacadadBateria = capacadadBateria;
        autonomiaElectrica = capacadadBateria / 100;
    }
    public AtributosElectrico(){}

    public int getTiempoDeCarga() {
        return tiempoDeCarga;
    }

    public void setTiempoDeCarga(int tiempoDeCarga) {
        this.tiempoDeCarga = tiempoDeCarga;
    }
    public int getCapacadadBateria() {
        return capacadadBateria;
    }
    public void setCapacadadBateria(int capacadadBateria) {
        this.capacadadBateria = capacadadBateria;
    }
    public int getAutonomiaElectrica() {
        return autonomiaElectrica;
    }
    public void setAutonomiaElectrica(int autonomiaElectrica) {
        this.autonomiaElectrica = autonomiaElectrica;
    }
    
    
}
