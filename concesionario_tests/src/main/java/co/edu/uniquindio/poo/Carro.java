package co.edu.uniquindio.poo;

public class Carro extends Vehiculo{
    private int numPuertas;
    private boolean tieneAireAcondicionado, tieneCamaraDeReversa, tieneControlCrucero, tieneBolsaDeAire, tieneABS, tieneSensoresColision, tieneSensoresTraficoCruzado, tieneAsistenciaPermanenciaDeCarril;

    public Carro(String id, String marca, String condicion, String modelo, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneControlCrucero, boolean tieneBolsaDeAire, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensoresTraficoCruzado, boolean tieneAsistenciaPermanenciaDeCarril, int precio) {
        super(id, marca, condicion, modelo, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, precio);
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
}
