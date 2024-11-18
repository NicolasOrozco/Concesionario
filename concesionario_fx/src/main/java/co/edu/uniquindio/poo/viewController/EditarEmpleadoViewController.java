package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.controller.EditarEmpleadoController;

public class EditarEmpleadoViewController {
    
    EditarEmpleadoController editarEmpleadoController;
    App app;

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
        Empleado actualizado = new Empleado(txfNombre.getText(), txfCdeula.getText(), txfContrasenia.getText(), txfPregunta.getText(), txfRespuesta.getText());
        editarEmpleadoController.editarEmpleado(txfCdeula.getText(), actualizado);
        app.openAdministrarEmpleados();
        
    }

    @FXML
    void onVolver(ActionEvent event) {
        app.openAdministrarEmpleados();
    }

    public void setApp(App app) {
        this.app = app;
    }

}
