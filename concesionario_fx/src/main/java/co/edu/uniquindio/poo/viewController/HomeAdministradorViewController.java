package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.HomeAdministradorController;
import java.net.URL;
import javafx.fxml.FXML;
import java.net.URL;


public class HomeAdministradorViewController {

    App app;
    @FXML
    private URL location;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblPregunta;

    @FXML
    private ImageView imgConcesionario;

    @FXML
    private Button btnAdministrarEmpleados;

    @FXML
    private Label lblBienvenida;

    @FXML
    private Button btnHistorialTransacciones;

    @FXML
    void onAdministrarEmpleados(ActionEvent event) {
        app.openCrearEmpleado();
    }

    @FXML
    void onHistorialTransacciones(ActionEvent event) {
        app.openViewTransacciones();
    }

    public void setApp(App app) {
        this.app = app;
    }

}
