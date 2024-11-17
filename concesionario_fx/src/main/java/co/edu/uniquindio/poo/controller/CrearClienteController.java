package co.edu.uniquindio.poo.controller;
import java.util.Collection;
import co.edu.uniquindio.poo.model.*;

public class CrearClienteController {
    
    Concesionario concesionario;
    public CrearClienteController(Concesionario concesionario){
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


}
