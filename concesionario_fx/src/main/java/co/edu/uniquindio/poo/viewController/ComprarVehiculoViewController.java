package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.*;

public class ComprarVehiculoViewController {
    App app;
    @FXML
    private ListView<String> listaVehiculos;

    @FXML
    private Button btnComprar;

    @FXML
    private TextField txtIdVehiculo;

    @FXML
    private Label lblResultado;

    private ComprarVehiculoController comprarVehiculoController;

    public void initialize() {
        comprarVehiculoController = new ComprarVehiculoController(app.concesionario);
        cargarVehiculos();
    }

    private void cargarVehiculos() {
        listaVehiculos.getItems().clear();
        for (Vehiculo vehiculo : comprarVehiculoController.obtenerVehiculosDisponibles()) {
            listaVehiculos.getItems().add(vehiculo.toStringChiquito());
        }
    }

    @FXML
    public void comprarVehiculo() {
        String idVehiculo = txtIdVehiculo.getText();
        boolean exito = comprarVehiculoController.comprarVehiculo(idVehiculo);
        if (exito) {
            lblResultado.setText("Vehículo comprado con éxito.");
            cargarVehiculos();
        } else {
            lblResultado.setText("Error: Vehículo no encontrado o no disponible.");
        }
    }

     public void setApp(App app){
        this.app = app;
    }
}
