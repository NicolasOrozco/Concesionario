package co.edu.uniquindio.poo;

public abstract class Transaccion {
     Vehiculo vehiculo;
     Empleado empleado;
     Cliente cliente;
     Double valor;

    public Transaccion() {
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
