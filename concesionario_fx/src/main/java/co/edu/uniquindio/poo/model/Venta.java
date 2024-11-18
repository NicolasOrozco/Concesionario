package co.edu.uniquindio.poo.model;

public class Venta extends Transaccion {

    @Override
    public double calcularValor() {
        return vehiculo.getPrecio();
    }

    @Override
    public String obtenerTipoTransaccion() {
        return "Venta";
    }
    
    

}
