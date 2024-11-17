package co.edu.uniquindio.poo.model;

public class Sedan extends Carro{
    private double capacidadMaletero;

    public Sedan(String id, String marca, String condicion, String modelo, int año, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneControlCrucero, boolean tieneBolsaDeAire, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensoresTraficoCruzado, boolean tieneAsistenciaPermanenciaDeCarril, double capacidadMaletero, int precio) {
        super(id, marca, condicion, modelo, año, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, numPuertas, tieneAireAcondicionado, tieneCamaraDeReversa, tieneControlCrucero, tieneBolsaDeAire, tieneABS, tieneSensoresColision, tieneSensoresTraficoCruzado, tieneAsistenciaPermanenciaDeCarril, precio);
        this.capacidadMaletero = capacidadMaletero;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Sedan: " + super.toString() + "capacidadMaletero=" + capacidadMaletero;
    }
    
}
