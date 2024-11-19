package co.edu.uniquindio.poo.controller;
import co.edu.uniquindio.poo.model.*;
import java.util.Collection;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;



public class HomeClienteController {
     Concesionario concesionario;

    public HomeClienteController(Concesionario concesionario){
        this.concesionario = concesionario;
    }

    public Collection<Vehiculo> ObtenerVehiculos(){
        return concesionario.getVehiculos();
    }

    

    public void mostrarDetallesVehiculo(Vehiculo vehiculo){
        Alert dialog = new Alert(AlertType.INFORMATION);
        dialog.setTitle("Tu Carro UQ");
        dialog.setHeaderText("Informacion: ");

        dialog.setContentText(vehiculo.toString());  

        dialog.showAndWait(); 

    }

}
