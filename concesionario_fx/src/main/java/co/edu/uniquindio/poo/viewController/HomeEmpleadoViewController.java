package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.HomeEmpleadoController;
import java.net.URL;

public class HomeEmpleadoViewController {

    HomeEmpleadoController homeEmpleadoController;
    App app;
    @FXML
    private URL location;
    
    @FXML
    private Button btnRealizarTransaccion;

    @FXML
    private Label lblPregunta;

    @FXML
    private Label lblTitulo;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private ImageView imgConcesionario;

    @FXML
    private Label lblBienvenida;

    @FXML
    private Button btnComprarVehiculos;

    @FXML
    private Button btnAgregarClientes;

    @FXML
    void initialize() {
        homeEmpleadoController = new HomeEmpleadoController(app.concesionario);
    }

    @FXML
    void onRealizarTransaccion(ActionEvent event) {
        app.openRealizarTransacciones();
    }

    @FXML
    void onComprarVehiculos(ActionEvent event) {
        app.openComprarVehiculo();
    }

    @FXML
    void onAgregarClientes(ActionEvent event) {
        app.openCrearClientes();
    }

    @FXML
    void onCerrarSesion(ActionEvent event) {
        app.openViewPrincipal();
    }

    public void setApp(App app) {
        this.app = app;
    }



    
}
