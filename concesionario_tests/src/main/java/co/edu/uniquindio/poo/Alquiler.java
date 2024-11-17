package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Alquiler extends Transaccion {
    LocalDate fechaInicio, fechaLimite;
    public double calcularValor() {
        return (vehiculo.getPrecio() / 250)*fechaInicio.until(fechaLimite).getDays();
    }
}
