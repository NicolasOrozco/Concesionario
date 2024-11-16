package co.edu.uniquindio.poo;

public class Compra extends Transaccion{
    
    
    public Compra(Vehiculo vehiculo, Empleado empleado, Cliente cliente){
        super(vehiculo, empleado, cliente);
    }
    @Override
    public double calcularValor() {
        return vehiculo.getPrecio();
    }
    
}
