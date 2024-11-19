package co.edu.uniquindio.poo.model;

public class AtributosCombustible{
    private String autonomia;

    /**
     * Constructor de la clase AtributosCombustible
     * @param autonomia
     */
    public AtributosCombustible(String autonomia){
        this.autonomia = autonomia;
    }

    public AtributosCombustible(){
    }
    /**
     * Método get de autonomia
     */
    public String getAutonomia() {
        return autonomia;
    }
    /**
     * Método set de Autonomia
     * @param autonomia
     */
    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "autonomia=" + autonomia + ", ";
    }
    

    
    
}
