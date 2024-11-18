package co.edu.uniquindio.poo.viewController;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.CrearClienteController;
import co.edu.uniquindio.poo.model.Cliente;

import java.net.URL;

public class CrearClienteViewController {
    CrearClienteController crearClienteController;
    private App app;
    @FXML
    private URL location;

    
    
    @FXML
    private Label lblNombre;

    @FXML
    private Label lblContrasenia;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblRespuesta;

    @FXML
    private Button btnVolver;

    @FXML
    private TextField txfContrasenia;

    @FXML
    private Label lblPregunta;

    @FXML
    private Label lblCedula;

    @FXML
    private TextField txfCdeula;

    @FXML
    private Button btnCrearCliente;

    @FXML
    private TextField txfRespuesta;

    @FXML
    private TextField txfPregunta;

    @FXML
    private TextField txfNombre;

    @FXML
    void onCrearCliente(ActionEvent event) {
        crearClienteController.crearCliente(new Cliente(txfNombre.getText(), txfCdeula.getText(), txfContrasenia.getText(), txfPregunta.getText(), txfRespuesta.getText()));
        app.openHomeEmpleado();;
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.openHomeEmpleado();
    }

    @FXML
    void initialize() {
        crearClienteController = new CrearClienteController(app.concesionario);
    }

    public void setApp(App app) {
        this.app = app;
    }

}
