package co.edu.uniquindio.poo.model;

public class Compra extends Transaccion{

    public Compra(){}
    @Override
    public double calcularValor() {
        return vehiculo.getPrecio();
    }

    @Override
    public String obtenerTipoTransaccion() {
        return "Compra";
    }


}
