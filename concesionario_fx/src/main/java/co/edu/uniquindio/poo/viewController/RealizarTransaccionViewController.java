package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.*;
import co.edu.uniquindio.poo.controller.RealizarTransaccionController;
import java.net.URL;


public class RealizarTransaccionViewController {
    RealizarTransaccionController realizarTransaccionController;

    private App app;
    @FXML
    private URL location;

    @FXML
    private Button btnAlquilar;

    @FXML
    private Button btnVender;

    @FXML
    private Label lblTitulo;

    @FXML
    private ImageView imgConcesionario;

    @FXML
    private Label lblSeleccionarOpcion;

    @FXML
    void onAlquilar(ActionEvent event) {
        app.openAlquilar();
    }

    @FXML
    void onVender(ActionEvent event) {
        app.openVender();
    }

    @FXML
    void initialize() {
        realizarTransaccionController = new RealizarTransaccionController(app.concesionario);
    }

    public void setApp(App app){
        this.app = app;
    }
}
