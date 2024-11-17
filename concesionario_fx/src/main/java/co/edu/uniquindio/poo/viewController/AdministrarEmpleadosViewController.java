package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import co.edu.uniquindio.poo.App;
import java.net.URL;

public class AdministrarEmpleadosViewController {

    App app;
    @FXML
    private URL location;

    @FXML
    private Label lblTitulo;

    @FXML
    private Button btnCrear;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnDesactivar;

    @FXML
    void onEditar(ActionEvent event) {

    }

    @FXML
    void onCrear(ActionEvent event) {

    }

    @FXML
    void onDesactivar(ActionEvent event) {

    }

    public void setApp(App app) {
        this.app = app;
    }
    
}
