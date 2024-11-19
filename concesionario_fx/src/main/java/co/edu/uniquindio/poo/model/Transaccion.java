package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

/**
 * Clase abstracta Transaccion.
 * Representa una transacción genérica que involucra un vehículo, empleado, cliente y valor.
 */
public abstract class Transaccion {
    // Fecha en la que se realiza la transacción.
    LocalDate fecha; 
    
    // Vehículo involucrado en la transacción.
    Vehiculo vehiculo;
    
    // Empleado asociado a la transacción.
    Empleado empleado;
    
    // Cliente asociado a la transacción.
    Cliente cliente;
    
    // Valor de la transacción.
    Double valor;

    /**
     * Constructor por defecto de la clase Transaccion.
     * Inicializa la fecha con la fecha actual y el valor en 0.0.
     */
    public Transaccion() {
        fecha = LocalDate.now();
        valor = 0.0;
    }

    /**
     * Método abstracto para calcular el valor de la transacción.
     * Debe ser implementado en las clases derivadas.
     *
     * @return Valor calculado de la transacción.
     */
    public abstract double calcularValor();

    /**
     * Obtiene el vehículo asociado a la transacción.
     *
     * @return Vehículo asociado.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo asociado a la transacción.
     *
     * @param vehiculo Vehículo a asociar.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el empleado asociado a la transacción.
     *
     * @return Empleado asociado.
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Establece el empleado asociado a la transacción.
     *
     * @param empleado Empleado a asociar.
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Obtiene el valor de la transacción.
     *
     * @return Valor de la transacción.
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Establece el valor de la transacción.
     *
     * @param valor Valor de la transacción.
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * Obtiene la fecha de la transacción.
     *
     * @return Fecha de la transacción.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la transacción.
     *
     * @param fecha Fecha de la transacción.
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el cliente asociado a la transacción.
     *
     * @return Cliente asociado.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente asociado a la transacción.
     *
     * @param cliente Cliente a asociar.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Método abstracto para obtener el tipo de transacción.
     * Debe ser implementado en las clases derivadas.
     *
     * @return Tipo de transacción como cadena de texto.
     */
    public abstract String obtenerTipoTransaccion();
}
