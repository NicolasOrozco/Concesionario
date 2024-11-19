package co.edu.uniquindio.poo.model;

/**
 * Clase Van que hereda de Carro.
 * Representa un vehículo tipo Van con características específicas.
 */
public class Van extends Carro {
    // Atributo específico para el tipo de Van
    private String tipoDeVan;

    /**
     * Constructor de la clase Van.
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
     * @param tipoDeVan Tipo de Van específico.
     * @param precio Precio del vehículo.
     * @param disponibilidad Disponibilidad del vehículo (en venta, reservado, etc.).
     */
    public Van(String id, String marca, String condicion, String modelo, int año, Transmision transmision, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int numPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraDeReversa, boolean tieneControlCrucero, boolean tieneBolsaDeAire, boolean tieneABS, boolean tieneSensoresColision, boolean tieneSensoresTraficoCruzado, boolean tieneAsistenciaPermanenciaDeCarril, String tipoDeVan, int precio, Disponibilidad disponibilidad) {
        super(id, marca, condicion, modelo, año, transmision, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, numPuertas, tieneAireAcondicionado, tieneCamaraDeReversa, tieneControlCrucero, tieneBolsaDeAire, tieneABS, tieneSensoresColision, tieneSensoresTraficoCruzado, tieneAsistenciaPermanenciaDeCarril, precio, disponibilidad);
        this.tipoDeVan = tipoDeVan;
    }

    /**
     * Obtiene el tipo de vehículo.
     *
     * @return Una cadena que representa el tipo de vehículo ("Van").
     */
    public String obtenerTipo() {
        return "Van";
    }

    /**
     * Obtiene el tipo específico de Van.
     *
     * @return Tipo de Van.
     */
    public String getTipoDeVan() {
        return tipoDeVan;
    }

    /**
     * Establece el tipo específico de Van.
     *
     * @param tipoDeVan Tipo de Van.
     */
    public void setTipoDeVan(String tipoDeVan) {
        this.tipoDeVan = tipoDeVan;
    }

    /**
     * Representación en cadena de texto de los atributos de la Van.
     *
     * @return Cadena con los valores de los atributos.
     */
    @Override
    public String toString() {
        return "Van: " + super.toString() + "tipoDeVan=" + tipoDeVan;
    }

    /**
     * Representación compacta de la Van en cadena de texto.
     *
     * @return Cadena resumida con los valores clave de la Van.
     */
    public String toStringChiquito() {
        return "Van " + super.toStringChiquito();
    }
}
