package co.edu.uniquindio.poo;

public class Venta extends Transaccion {
    public Venta(Vehiculo vehiculo, Empleado empleado, Cliente cliente){
        super(vehiculo, empleado, cliente);
    }
    @Override
    public double calcularValor() {
        return vehiculo.getPrecio();
    }
    
}
