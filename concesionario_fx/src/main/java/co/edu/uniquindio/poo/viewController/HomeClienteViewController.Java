package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import java.net.URL;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import co.edu.uniquindio.poo.controller.HomeClienteController;

public class HomeClienteViewController {

    App app;
    @FXML
    private URL location;

    @FXML
    private Button btnVerDetalles;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Label lblTitulo;

    @FXML
    private ListView<String> listVehiculos;

    @FXML
    void onCerrarSesion(ActionEvent event) {

    }

    @FXML
    void onVerDetalles(ActionEvent event) {

    }

    public void setApp(App app) {
        this.app = app;
    }

   
}
