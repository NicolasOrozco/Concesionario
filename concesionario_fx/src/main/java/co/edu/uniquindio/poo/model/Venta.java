package co.edu.uniquindio.poo.model;

public class Venta extends Transaccion {

    public Venta(){};
    @Override
    public double calcularValor() {
        return vehiculo.getPrecio();
    }

    @Override
    public String obtenerTipoTransaccion() {
        return "Venta";
    }


    
    

}
