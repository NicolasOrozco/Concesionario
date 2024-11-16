package co.edu.uniquindio.poo.model;

public class Deportivo extends Carro{
    private double numeroCaballosDeFuerza, tiempo0a100kmph;

    public Deportivo(String id, String marca, String condicion, String modelo, int año, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneControlCrucero, boolean tieneBolsaDeAire, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensoresTraficoCruzado, boolean tieneAsistenciaPermanenciaDeCarril, double numeroCaballosDeFuerza, double tiempo0a100kmph, int precio) {
        super(id, marca, condicion, modelo, año, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, numPuertas, tieneAireAcondicionado, tieneCamaraDeReversa, tieneControlCrucero, tieneBolsaDeAire, tieneABS, tieneSensoresColision, tieneSensoresTraficoCruzado, tieneAsistenciaPermanenciaDeCarril, precio);
        this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
        this.tiempo0a100kmph = tiempo0a100kmph;
    }

    public double getNumeroCaballosDeFuerza() {
        return numeroCaballosDeFuerza;
    }

    public void setNumeroCaballosDeFuerza(double numeroCaballosDeFuerza) {
        this.numeroCaballosDeFuerza = numeroCaballosDeFuerza;
    }

    public double getTiempo0a100kmph() {
        return tiempo0a100kmph;
    }

    public void setTiempo0a100kmph(double tiempo0a100kmph) {
        this.tiempo0a100kmph = tiempo0a100kmph;
    }
}
