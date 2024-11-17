package co.edu.uniquindio.poo;

public class Venta extends Transaccion {

    @Override
    public double calcularValor() {
        return vehiculo.getPrecio();
    }
    
}
