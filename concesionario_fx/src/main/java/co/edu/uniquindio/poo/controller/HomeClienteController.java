package co.edu.uniquindio.poo.controller;
import co.edu.uniquindio.poo.model.*;
import java.util.Collection;

public class HomeClienteController {
     Concesionario concesionario;

    public HomeClienteController(Concesionario concesionario){
        this.concesionario = concesionario;
    }

    public Collection<Vehiculo> ObtenerVehiculos(){
        return concesionario.getVehiculos();
    }


}
