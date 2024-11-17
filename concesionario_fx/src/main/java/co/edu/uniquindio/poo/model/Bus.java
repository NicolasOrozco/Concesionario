package co.edu.uniquindio.poo.model;

public class Bus extends Carro{
    private  int numEjes, numSalidasDeEmergencia;

    public Bus(String id,String marca, String condicion, String modelo, int año,  int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneControlCrucero, boolean tieneBolsaDeAire, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensoresTraficoCruzado, boolean tieneAsistenciaPermanenciaDeCarril, int numEjes, int numSalidasDeEmergencia, int precio) {
        super(id, marca, condicion, modelo, año, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, numPuertas, tieneAireAcondicionado, tieneCamaraDeReversa, tieneControlCrucero, tieneBolsaDeAire, tieneABS, tieneSensoresColision, tieneSensoresTraficoCruzado, tieneAsistenciaPermanenciaDeCarril, precio);
        this.numEjes = numEjes;
        this.numSalidasDeEmergencia = numSalidasDeEmergencia;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getNumSalidasDeEmergencia() {
        return numSalidasDeEmergencia;
    }

    public void setNumSalidasDeEmergencia(int numSalidasDeEmergencia) {
        this.numSalidasDeEmergencia = numSalidasDeEmergencia;
    }

    @Override
    public String toString() {
        return "Bus: " + super.toString() + "numEjes=" + numEjes + ", numSalidasDeEmergencia=" + numSalidasDeEmergencia ;
    }
    
}
