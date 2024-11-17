package co.edu.uniquindio.poo;

public class Compra extends Transaccion{

    @Override
    public double calcularValor() {
        return vehiculo.getPrecio();
    }
    
}
