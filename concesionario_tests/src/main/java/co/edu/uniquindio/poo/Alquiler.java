package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Alquiler extends Transaccion {
    LocalDate fechaInicio, fechaLimite;
    public Alquiler(Vehiculo vehiculo, Empleado empleado, Cliente cliente, LocalDate fechaInicio, LocalDate fechaLimite){
        super(vehiculo, empleado, cliente);
        this.fechaInicio = fechaInicio;
        this.fechaLimite = fechaLimite;
    }
    public double calcularValor() {
        return (vehiculo.getPrecio() / 250)*fechaInicio.until(fechaLimite).getDays();
    }
}
