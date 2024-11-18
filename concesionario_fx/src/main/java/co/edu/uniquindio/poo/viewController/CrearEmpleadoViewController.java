package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.CrearEmpleadoController;
import java.net.URL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import co.edu.uniquindio.poo.model.*;

public class CrearEmpleadoViewController {
    CrearEmpleadoController crearEmpleadoController;
    ObservableList<Empleado> listEmpleados = FXCollections.observableArrayList();
    Empleado selectedEmpleado;
    private App app;

    @FXML
    private URL location;


    @FXML
    private Button btnCrearEmpleado;

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
    private TextField txfRespuesta;

    @FXML
    private TextField txfPregunta;

    @FXML
    private TextField txfNombre;

    @FXML
    void onCrearEmpleado(ActionEvent event) {
        agregarEmpleado();
        app.openAdministrarEmpleados();
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.openViewAdministrador();
    }
    @FXML
    void initialize() {
        crearEmpleadoController = new CrearEmpleadoController(app.concesionario);
    }
    
    public void setApp(App app) {
        this.app = app;
    }

    private void obtenerEmpleados() {
        listEmpleados.addAll(crearEmpleadoController.obtenerListaEmpleados());
    }


    private void agregarEmpleado() {
        Empleado empleado = buildEmpleado();
        crearEmpleadoController.crearEmpleado(empleado);
        listEmpleados.add(empleado);
    
        
    }
    private Empleado buildEmpleado(){
        Empleado empleado = new Empleado(txfNombre.getText(), txfCdeula.getText(), txfContrasenia.getText(),txfPregunta.getText(), txfRespuesta.getText());
        return empleado;
        
    }

}