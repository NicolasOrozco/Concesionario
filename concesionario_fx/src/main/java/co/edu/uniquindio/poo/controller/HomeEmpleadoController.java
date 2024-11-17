package co.edu.uniquindio.poo.controller;
import java.util.Collection;
import co.edu.uniquindio.poo.model.*;


public class HomeEmpleadoController {
    Concesionario concesionario;
    public HomeEmpleadoController(Concesionario concesionario){
        this.concesionario = concesionario;
    }

    public Collection<Cliente> obtenerListaClientes() {
        return concesionario.getClientes();
    }

    public void crearCliente(Cliente cliente) {
        concesionario.agregarCliente(cliente);
    }

    public void eliminarCliente(String id) {
       concesionario.eliminarCliente(id);
    }

    public void crearVehiculo(Vehiculo vehiculo){
        concesionario.agregarVehiculo(vehiculo);
    }

    public void obtenerVehiculos(){
        concesionario.getVehiculos();
    }
}
