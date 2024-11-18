package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.CrearClienteController;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import co.edu.uniquindio.poo.controller.RecuperarContraseniaController;

import java.net.URL;
import javafx.fxml.FXML;

public class RecuperarContraseniaViewController {
    RecuperarContraseniaController recuperarContraseniaController;

    
    App app;
    @FXML
    private URL location;

    @FXML
    private Button btnVolver;

    @FXML
    private Button btnAceptar;

    @FXML
    private Label lblPreguntaSeguridad;

    @FXML
    private Label lblNuevaContrasenia;

    @FXML
    private Label lblTitulo;

    @FXML
    private ImageView imgConcesionario;

    @FXML
    private TextField txfNuevaContrasenia;

    @FXML
    private TextField txfRespuesta;

    @FXML
    void onAceptar(ActionEvent event) {
        recuperarContraseniaController.recuperarContrasenia(txfNuevaContrasenia.getText(), "", txfRespuesta.getText());
    }
    @FXML
    void initialize() {
        recuperarContraseniaController = new RecuperarContraseniaController(app.concesionario);
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.openViewPrincipal();
    }

    public void setApp(App app){
        this.app = app;
    }

}
