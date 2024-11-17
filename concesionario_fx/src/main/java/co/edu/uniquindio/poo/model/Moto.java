package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo{
    public Moto(String id, String marca, String condicion, String modelo, int año,Transmision transmision, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int precio) {
        super(id, marca, condicion, modelo, año,transmision, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, precio);
    }

    public String obtenerTipoVehiculo(){
        return "moto";
    }
    @Override
    public String toString() {
        return "Moto: " + super.toString();
    }
    public String toStringChiquito(){
        return "Moto: " + super.toStringChiquito();
    }
}
