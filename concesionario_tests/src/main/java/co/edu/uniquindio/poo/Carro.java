package co.edu.uniquindio.poo;

public class Carro extends Vehiculo{
    private int numPuertas;
    private boolean tieneAireAcondicionado, tieneCamaraDeReversa, tieneControlCrucero, tieneBolsaDeAire, tieneABS, tieneSensoresColision, tieneSensoresTraficoCruzado, tieneAsistenciaPermanenciaDeCarril;

    public Carro(String id, String marca, String condicion, String modelo, int año, Transmision transmision, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneControlCrucero, boolean tieneBolsaDeAire, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensoresTraficoCruzado, boolean tieneAsistenciaPermanenciaDeCarril, int precio, Disponibilidad disponibilidad) {
        super(id, marca, condicion, modelo, año, transmision, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, precio, disponibilidad);
        this.numPuertas = numPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
        this.tieneControlCrucero = tieneControlCrucero;
        this.tieneBolsaDeAire = tieneBolsaDeAire;
        this.tieneABS = tieneABS;
        this.tieneSensoresColision = tieneSensoresColision;
        this.tieneSensoresTraficoCruzado = tieneSensoresTraficoCruzado;
        this.tieneAsistenciaPermanenciaDeCarril = tieneAsistenciaPermanenciaDeCarril;
    }

    public String obtenerTipoVehiculo(){
        return "Carro";
    }
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public boolean isTieneCamaraDeReversa() {
        return tieneCamaraDeReversa;
    }

    public void setTieneCamaraDeReversa(boolean tieneCamaraDeReversa) {
        this.tieneCamaraDeReversa = tieneCamaraDeReversa;
    }

    public boolean isTieneControlCrucero() {
        return tieneControlCrucero;
    }

    public void setTieneControlCrucero(boolean tieneControlCrucero) {
        this.tieneControlCrucero = tieneControlCrucero;
    }

    public boolean isTieneBolsaDeAire() {
        return tieneBolsaDeAire;
    }

    public void setTieneBolsaDeAire(boolean tieneBolsaDeAire) {
        this.tieneBolsaDeAire = tieneBolsaDeAire;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public boolean isTieneSensoresColision() {
        return tieneSensoresColision;
    }

    public void setTieneSensoresColision(boolean tieneSensoresColision) {
        this.tieneSensoresColision = tieneSensoresColision;
    }

    public boolean isTieneSensoresTraficoCruzado() {
        return tieneSensoresTraficoCruzado;
    }

    public void setTieneSensoresTraficoCruzado(boolean tieneSensoresTraficoCruzado) {
        this.tieneSensoresTraficoCruzado = tieneSensoresTraficoCruzado;
    }

    public boolean isTieneAsistenciaPermanenciaDeCarril() {
        return tieneAsistenciaPermanenciaDeCarril;
    }

    public void setTieneAsistenciaPermanenciaDeCarril(boolean tieneAsistenciaPermanenciaDeCarril) {
        this.tieneAsistenciaPermanenciaDeCarril = tieneAsistenciaPermanenciaDeCarril;
    }

    @Override
    public String toString() {
        return super.toString()+ "numPuertas=" + numPuertas + ", tieneAireAcondicionado=" + tieneAireAcondicionado
                + ", tieneCamaraDeReversa=" + tieneCamaraDeReversa + ", tieneControlCrucero=" + tieneControlCrucero
                + ", tieneBolsaDeAire=" + tieneBolsaDeAire + ", tieneABS=" + tieneABS + ", tieneSensoresColision="
                + tieneSensoresColision + ", tieneSensoresTraficoCruzado=" + tieneSensoresTraficoCruzado
                + ", tieneAsistenciaPermanenciaDeCarril=" + tieneAsistenciaPermanenciaDeCarril + ", " ;
    }
    public String toStringChiquito(){
        return "carro: " + super.toStringChiquito();
    }
    
}
