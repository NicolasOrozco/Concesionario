package co.edu.uniquindio.poo.controller;
import co.edu.uniquindio.poo.model.*;
import java.util.Collection;

public class VentaController {
    Concesionario concesionario;

    public VentaController(Concesionario concesionario){
        this.concesionario = concesionario;
    }

    public Collection<Vehiculo> ObtenerVehiculos(){
        return concesionario.getVehiculos();
    }

    public void vender(Vehiculo vehiculo, String idEmpleado, String idCliente){
        Venta venta = new Venta();
        venta.setVehiculo(vehiculo);
        venta.calcularValor();
        venta.setCliente(concesionario.buscarCliente(idCliente));
        venta.setEmpleado(concesionario.buscarEmpleado(idEmpleado));
        concesionario.transacciones.add(venta);
        
    }

}
