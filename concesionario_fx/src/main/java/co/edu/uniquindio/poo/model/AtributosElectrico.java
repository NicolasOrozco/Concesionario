package co.edu.uniquindio.poo.model;

public class AtributosElectrico extends AtributosCombustible{
    private  int tiempoDeCarga, capacadadBateria, autonomiaElectrica;
   
    /**
     * Método constructor de la clase AtributosElectrico
     * @param autonomia
     * @param ptiempoDeCarga
     * @param capacidadBateria
     */
    public AtributosElectrico(String autonomia, int tiempoDeCarga, int capacadadBateria){
        super(autonomia);
        this.tiempoDeCarga = tiempoDeCarga;
        this.capacadadBateria = capacadadBateria;
        autonomiaElectrica = capacadadBateria / 100;
    }
    public AtributosElectrico(){}

    ///////////////////////// Gets y Sets de la clase//////////////
    /**
     * Métodos gets y métodos sets de la clase
     */
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

    /**
     * Método toString de la clase
     */
    @Override
    public String toString() {
        return super.toString() + "tiempoDeCarga=" + tiempoDeCarga + ", capacadadBateria=" + capacadadBateria
                + ", autonomiaElectrica=" + autonomiaElectrica;
    }
    
    
}
