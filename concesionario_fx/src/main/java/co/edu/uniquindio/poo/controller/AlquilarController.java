package co.edu.uniquindio.poo.controller;
import co.edu.uniquindio.poo.model.*;
import java.util.Collection;
import java.time.LocalDate;

public class AlquilarController {
    Concesionario concesionario;
    public AlquilarController(Concesionario concesionario){
        this.concesionario = concesionario;
    }
    public Collection<Vehiculo> ObtenerVehiculos(){
        return concesionario.getVehiculos();
    }
    public void alquilar(Vehiculo vehiculo, String idCliente, String idEmpleado, int dias){
        Alquiler alquiler = new Alquiler();
        alquiler.setCliente(concesionario.buscarCliente(idCliente));
        alquiler.setVehiculo(vehiculo);
        alquiler.setEmpleado(concesionario.buscarEmpleado(idEmpleado));
        alquiler.setFechaInicio(LocalDate.now());
        alquiler.setFechaLimite(LocalDate.now().plusDays(dias));
        concesionario.agregarTransaccion(alquiler);
    }
}
