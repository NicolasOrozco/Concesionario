package co.edu.uniquindio.poo;

public class Bus extends Carro{
    private  int numEjes, numSalidasDeEmergencia;

    public Bus(String id,String marca, String condicion, String modelo, int año,Transmision transmision,  int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneControlCrucero, boolean tieneBolsaDeAire, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensoresTraficoCruzado, boolean tieneAsistenciaPermanenciaDeCarril, int numEjes, int numSalidasDeEmergencia, int precio, Disponibilidad disponibilidad) {
        super(id, marca, condicion, modelo, año,transmision, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, numPuertas, tieneAireAcondicionado, tieneCamaraDeReversa, tieneControlCrucero, tieneBolsaDeAire, tieneABS, tieneSensoresColision, tieneSensoresTraficoCruzado, tieneAsistenciaPermanenciaDeCarril, precio, disponibilidad);
        this.numEjes = numEjes;
        this.numSalidasDeEmergencia = numSalidasDeEmergencia;
    }
    
    public String obtenerTipoVehiculo(){
        return "Camion";
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
