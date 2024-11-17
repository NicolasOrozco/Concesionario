package co.edu.uniquindio.poo.model;

public class Van extends Carro {
    private  String tipoDeVan;

    public Van(String id, String marca, String condicion, String modelo, int año,int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneControlCrucero, boolean tieneBolsaDeAire, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensoresTraficoCruzado, boolean tieneAsistenciaPermanenciaDeCarril, String tipoDeVan, int precio) {
        super(id, marca, condicion, modelo, año, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, numPuertas, tieneAireAcondicionado, tieneCamaraDeReversa, tieneControlCrucero, tieneBolsaDeAire, tieneABS, tieneSensoresColision, tieneSensoresTraficoCruzado, tieneAsistenciaPermanenciaDeCarril, precio);
        this.tipoDeVan = tipoDeVan;
    }

    public String getTipoDeVan() {
        return tipoDeVan;
    }

    public void setTipoDeVan(String tipoDeVan) {
        this.tipoDeVan = tipoDeVan;
    }

    @Override
    public String toString() {
        return "Van: "+ super.toString() + "tipoDeVan=" + tipoDeVan;
    }
    
    
}
