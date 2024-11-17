package co.edu.uniquindio.poo.model;

public class AtributosCombustible{
    private String autonomia; 
    public AtributosCombustible(String autonomia){
        this.autonomia = autonomia;
    }
    public AtributosCombustible(){
    }
    public String getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }
    @Override
    public String toString() {
        return "autonomia=" + autonomia + ", ";
    }
    

    
    
}
