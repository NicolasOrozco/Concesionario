package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private int numEjes;
    private boolean tieneFrenoDeAire;
    private  String tipoCamion;

    public Camion(String id, String marca, String condicion, String modelo, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numEjes, boolean tieneFrenoDeAire, String tipoCamion, int precio) {
        super(id, marca, condicion, modelo, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, precio);
        this.numEjes = numEjes;
        this.tieneFrenoDeAire = tieneFrenoDeAire;
        this.tipoCamion = tipoCamion;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public boolean isTieneFrenoDeAire() {
        return tieneFrenoDeAire;
    }

    public void setTieneFrenoDeAire(boolean tieneFrenoDeAire) {
        this.tieneFrenoDeAire = tieneFrenoDeAire;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
}