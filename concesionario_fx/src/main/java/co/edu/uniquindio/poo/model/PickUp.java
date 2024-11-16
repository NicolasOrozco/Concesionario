package co.edu.uniquindio.poo.model;

public class PickUp extends Carro{
    private double capacidadCaja;
    private boolean es4x4;

    public PickUp(String id, String marca, String condicion, String modelo, int año, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneControlCrucero, boolean tieneBolsaDeAire, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensoresTraficoCruzado, boolean tieneAsistenciaPermanenciaDeCarril, double capacidadCaja, boolean es4x4, int precio) {
        super(id, marca, condicion, modelo, año, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, numPuertas, tieneAireAcondicionado, tieneCamaraDeReversa, tieneControlCrucero, tieneBolsaDeAire, tieneABS, tieneSensoresColision, tieneSensoresTraficoCruzado, tieneAsistenciaPermanenciaDeCarril, precio);
        this.capacidadCaja = capacidadCaja;
        this.es4x4 = es4x4;
    }

    public double getCapacidadCaja() {
        return capacidadCaja;
    }

    public void setCapacidadCaja(double capacidadCaja) {
        this.capacidadCaja = capacidadCaja;
    }

    public boolean isEs4x4() {
        return es4x4;
    }

    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }
}
