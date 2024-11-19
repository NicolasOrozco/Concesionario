package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Alquiler extends Transaccion {
    LocalDate fechaInicio, fechaLimite;
    public Alquiler(){
        super();
    }

    /**
     * Método para calcular el valor del alquiler
     */
    public double calcularValor() {
        return (vehiculo.getPrecio() / 250)*fechaInicio.until(fechaLimite).getDays();
    }

    /**
     * Método para obtener el tipo de transaccion
     */
    @Override
    public String obtenerTipoTransaccion() {
        return "Alquiler";
    }

    ///////////////////////////////////////////Gets Y Sets//////////////////////////
    /**
     * Métodos getts y sets de la clase aqluiler
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    
}
