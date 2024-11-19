package co.edu.uniquindio.poo.model;
/**
 * Clase abstracta Vehiculo que implementa la interfaz Autonomia.
 * Representa un vehículo con diversas propiedades como marca, modelo,
 * año, tipo de combustible, y más.
 */
public abstract class Vehiculo implements Autonomia {

    // Atributos de la clase
    private String id, marca, condicion, modelo;
    private Transmision transmision;
    private int año, cambios, cilindraje, VelMaxima, numeroPasajeros, precio;
    private TipoCombustible tipoCombustible;
    private AtributosCombustible atributosCombustible;
    private Disponibilidad disponibilidad;

    /**
     * Constructor de la clase Vehiculo.
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
     * @param precio Precio del vehículo.
     * @param disponibilidad Disponibilidad del vehículo (en venta, reservado, etc.).
     */
    public Vehiculo(String id, String marca, String condicion, String modelo, int año, Transmision transmision, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int precio, Disponibilidad disponibilidad) {
        this.marca = marca;
        this.condicion = condicion;
        this.modelo = modelo;
        this.año = año;
        this.transmision = transmision;
        this.cambios = cambios;
        this.cilindraje = cilindraje;
        this.VelMaxima = velMaxima;
        this.numeroPasajeros = numeroPasajeros;
        this.precio = precio;
        this.id = id;
        this.tipoCombustible = tipoCombustible;
        this.atributosCombustible = crearAtributosCombustible(tipoCombustible);
        disponibilidad = disponibilidad.DISPONIBLE;
    }

    /**
     * Crea y retorna los atributos específicos del combustible según su tipo.
     *
     * @param tipo Tipo de combustible del vehículo.
     * @return Atributos específicos del combustible.
     */
    private AtributosCombustible crearAtributosCombustible(TipoCombustible tipo) {
        switch (tipo) {
            case ELECTRICO:
                return new AtributosElectrico();
            case HIBRIDO:
                return new AtributosHibridos();
            default:
                return new AtributosCombustible();
        }
    }

    /**
     * Calcula y retorna la autonomía del vehículo según su tipo de combustible.
     *
     * @return Autonomía estimada del vehículo.
     */
    public int calcularAutonomia() {
        int autonomia = 0;
        if (tipoCombustible == TipoCombustible.DIESEL) {
            autonomia = cilindraje / 100;
        }
        if (tipoCombustible == TipoCombustible.HIBRIDO) {
            autonomia = cilindraje / 100;
        }
        return autonomia;
    }

    /**
     * Método abstracto que retorna el tipo específico de vehículo.
     *
     * @return Tipo del vehículo.
     */
    public abstract String obtenerTipoVehiculo();

    // Métodos getter y setter para los atributos

    /**
     * Obtiene la marca del vehículo.
     *
     * @return Marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     *
     * @param marca Marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene la condición del vehículo.
     *
     * @return Condición del vehículo.
     */
    public String getCondicion() {
        return condicion;
    }

    /**
     * Establece la condición del vehículo.
     *
     * @param condicion Condición del vehículo.
     */
    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    /**
     * Obtiene el modelo del vehículo.
     *
     * @return Modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     *
     * @param modelo Modelo del vehículo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el número de cambios de la transmisión.
     *
     * @return Número de cambios.
     */
    public int getCambios() {
        return cambios;
    }

    /**
     * Establece el número de cambios de la transmisión.
     *
     * @param cambios Número de cambios.
     */
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    /**
     * Obtiene el cilindraje del motor del vehículo.
     *
     * @return Cilindraje del motor.
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * Establece el cilindraje del motor del vehículo.
     *
     * @param cilindraje Cilindraje del motor.
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * Obtiene la velocidad máxima del vehículo.
     *
     * @return Velocidad máxima.
     */
    public int getVelMaxima() {
        return VelMaxima;
    }

    /**
     * Establece la velocidad máxima del vehículo.
     *
     * @param velMaxima Velocidad máxima.
     */
    public void setVelMaxima(int velMaxima) {
        VelMaxima = velMaxima;
    }

    /**
     * Obtiene el número de pasajeros que soporta el vehículo.
     *
     * @return Número de pasajeros.
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * Establece el número de pasajeros que soporta el vehículo.
     *
     * @param numeroPasajeros Número de pasajeros.
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /**
     * Obtiene el precio del vehículo.
     *
     * @return Precio del vehículo.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del vehículo.
     *
     * @param precio Precio del vehículo.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el identificador único del vehículo.
     *
     * @return Identificador del vehículo.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador único del vehículo.
     *
     * @param id Identificador del vehículo.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el tipo de combustible del vehículo.
     *
     * @return Tipo de combustible.
     */
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    /**
     * Establece el tipo de combustible del vehículo.
     *
     * @param tipoCombustible Tipo de combustible.
     */
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    /**
     * Obtiene los atributos específicos del combustible.
     *
     * @return Atributos del combustible.
     */
    public AtributosCombustible getAtributosCombustible() {
        return atributosCombustible;
    }

    /**
     * Establece los atributos específicos del combustible.
     *
     * @param atributosCombustible Atributos del combustible.
     */
    public void setAtributosCombustible(AtributosCombustible atributosCombustible) {
        this.atributosCombustible = atributosCombustible;
    }

    /**
     * Obtiene el año de fabricación del vehículo.
     *
     * @return Año de fabricación.
     */
    public int getAño() {
        return año;
    }

    /**
     * Establece el año de fabricación del vehículo.
     *
     * @param año Año de fabricación.
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Representación en cadena de texto de los atributos del vehículo.
     *
     * @return Cadena con los valores de los atributos.
     */
    @Override
    public String toString() {
        return "id=" + id + ", marca=" + marca + ", condicion=" + condicion + ", modelo=" + modelo + ", año="
                + año + ", transimision=" + transmision.name() + ", cambios=" + cambios + ", cilindraje=" + cilindraje + ", VelMaxima=" + VelMaxima
                + ", numeroPasajeros=" + numeroPasajeros + ", precio=" + precio + ", tipoCombustible=" + tipoCombustible
                + ", atributosCombustible=" + atributosCombustible.toString() + ", ";
    }

    /**
     * Representación compacta del vehículo en cadena de texto.
     *
     * @return Cadena resumida con los valores clave del vehículo.
     */
    public String toStringChiquito() {
        return "marca: " + marca + ", modelo" + modelo + ", Precio= " + precio;
    }

    /**
     * Obtiene el tipo de transmisión del vehículo.
     *
     * @return Transmisión del vehículo.
     */
    public Transmision getTransmision() {
        return transmision;
    }

    /**
     * Establece el tipo de transmisión del vehículo.
     *
     * @param transmision Transmisión del vehículo.
     */
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    /**
     * Obtiene la disponibilidad del vehículo.
     *
     * @return Disponibilidad del vehículo.
     */
    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Establece la disponibilidad del vehículo.
     *
     * @param disponibilidad Disponibilidad del vehículo.
     */
    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
