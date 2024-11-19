package co.edu.uniquindio.poo;

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
