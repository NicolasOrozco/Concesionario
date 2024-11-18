package co.edu.uniquindio.poo.controller;
import co.edu.uniquindio.poo.model.*;
import java.util.Collection;
import javafx.scene.control.Dialog;
import javafx.util.Pair;



public class HomeClienteController {
     Concesionario concesionario;

    public HomeClienteController(Concesionario concesionario){
        this.concesionario = concesionario;
    }

    public Collection<Vehiculo> ObtenerVehiculos(){
        return concesionario.getVehiculos();
    }

    

    public void mostrarDetallesVehiculo(Vehiculo vehiculo){
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Tu Carro UQ");
        dialog.setHeaderText(vehiculo.toString());

    }

}
