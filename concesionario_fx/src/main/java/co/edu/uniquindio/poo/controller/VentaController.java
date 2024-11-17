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

}
