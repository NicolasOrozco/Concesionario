package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public abstract class Transaccion {
    LocalDate fecha; 
    Vehiculo vehiculo;
     Empleado empleado;
     Cliente cliente;
     Double valor;

    public Transaccion() {
        fecha = LocalDate.now();
    }
    public abstract double calcularValor();

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
