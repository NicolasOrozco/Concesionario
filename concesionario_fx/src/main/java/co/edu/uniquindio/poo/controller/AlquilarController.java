package co.edu.uniquindio.poo.controller;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.*;
import java.util.Collection;

public class AlquilarController {
    Concesionario concesionario;
    public AlquilarController(Concesionario concesionario){
        this.concesionario = concesionario;
    }
    public Collection<Vehiculo> ObtenerVehiculos(){
        return concesionario.getVehiculos();
    }
}
