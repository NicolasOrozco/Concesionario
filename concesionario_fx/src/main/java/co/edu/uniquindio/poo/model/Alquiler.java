package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Alquiler extends Transaccion {
    LocalDate fechaInicio, fechaLimite;
    public Alquiler(){
        super();
    }
    public double calcularValor() {
        return (vehiculo.getPrecio() / 250)*fechaInicio.until(fechaLimite).getDays();
    }
    @Override
    public String obtenerTipoTransaccion() {
        return "Alquiler";
    }
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
