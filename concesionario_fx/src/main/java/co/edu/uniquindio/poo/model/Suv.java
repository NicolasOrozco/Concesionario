package co.edu.uniquindio.poo.model;

/**
 * Clase Suv que hereda de Carro.
 * Representa un vehículo tipo SUV con características específicas como capacidad de maletero y tracción 4x4.
 */
public class Suv extends Carro {
    // Capacidad del maletero del SUV en litros.
    private double capacidadMaletero;
    
    // Indica si el SUV tiene tracción 4x4.
    private boolean es4x4;

    /**
     * Constructor de la clase Suv.
     *
     * @param id Identificador único del vehículo.
     * @param marca Marca del vehículo.
     * @param condicion Condición del vehículo (nuevo, usado, etc.).
     * @param modelo Modelo del vehículo.
     * @param año Año de fabricación del vehículo.
     * @param transmision Tipo de transmisión del vehículo.
     * @param cambios Número de cambios de la transmisión.
     * @param cilindraje Cilindraje del motor del vehículo.
     * @param velMaxima Velocidad máxima del vehículo.
     * @param numeroPasajeros Número de pasajeros que soporta el vehículo.
     * @param tipoCombustible Tipo de combustible utilizado por el vehículo.
     * @param numPuertas Número de puertas del vehículo.
     * @param tieneAireAcondicionado Indica si el vehículo tiene aire acondicionado.
     * @param tieneCamaraDeReversa Indica si el vehículo tiene cámara de reversa.
     * @param tieneControlCrucero Indica si el vehículo tiene control crucero.
     * @param tieneBolsaDeAire Indica si el vehículo tiene bolsas de aire.
     * @param tieneABS Indica si el vehículo tiene sistema de frenos ABS.
     * @param tieneSensoresColision Indica si el vehículo tiene sensores de colisión.
     * @param tieneSensoresTraficoCruzado Indica si el vehículo tiene sensores de tráfico cruzado.
     * @param tieneAsistenciaPermanenciaDeCarril Indica si el vehículo tiene asistencia para permanencia en el carril.
     * @param capacidadMaletero Capacidad del maletero del vehículo en litros.
     * @param es4x4 Indica si el vehículo tiene tracción 4x4.
     * @param precio Precio del vehículo.
     * @param disponibilidad Disponibilidad del vehículo (en venta, reservado, etc.).
     */
    public Suv(String id, String marca, String condicion, String modelo, int año, Transmision transmision, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneControlCrucero, boolean tieneBolsaDeAire, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensoresTraficoCruzado, boolean tieneAsistenciaPermanenciaDeCarril, double capacidadMaletero, boolean es4x4, int precio, Disponibilidad disponibilidad) {
        super(id, marca, condicion, modelo, año, transmision, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, numPuertas, tieneAireAcondicionado, tieneCamaraDeReversa, tieneControlCrucero, tieneBolsaDeAire, tieneABS, tieneSensoresColision, tieneSensoresTraficoCruzado, tieneAsistenciaPermanenciaDeCarril, precio, disponibilidad);
        this.capacidadMaletero = capacidadMaletero;
        this.es4x4 = es4x4;
    }

    /**
     * Obtiene el tipo de vehículo.
     *
     * @return Una cadena que representa el tipo de vehículo ("Suv").
     */
    @Override
    public String obtenerTipoVehiculo() {
        return "Suv";
    }

    /**
     * Obtiene la capacidad del maletero del SUV.
     *
     * @return Capacidad del maletero en litros.
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * Establece la capacidad del maletero del SUV.
     *
     * @param capacidadMaletero Capacidad del maletero en litros.
     */
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Indica si el SUV tiene tracción 4x4.
     *
     * @return True si el SUV tiene tracción 4x4, de lo contrario False.
     */
    public boolean isEs4x4() {
        return es4x4;
    }

    /**
     * Establece si el SUV tiene tracción 4x4.
     *
     * @param es4x4 True si el SUV tiene tracción 4x4, de lo contrario False.
     */
    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }

    /**
     * Representación en cadena de texto de los atributos del SUV.
     *
     * @return Cadena con los valores de los atributos.
     */
    @Override
    public String toString() {
        return "Suv: " + super.toString() + "capacidadMaletero=" + capacidadMaletero + ", es4x4=" + es4x4 + "]";
    }

    /**
     * Representación compacta del SUV en cadena de texto.
     *
     * @return Cadena resumida con los valores clave del SUV.
     */
    public String toStringChiquito() {
        return "Suv " + super.toStringChiquito();
    }
}
