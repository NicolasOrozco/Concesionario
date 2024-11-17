package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import java.net.URL;
import javafx.fxml.FXML;


public class InicioSesionViewController {

    App app;
    @FXML
    private URL location;

    private InicioSesionController inicioSesionController;

    
    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRecuperarContrasenia;

    @FXML
    private TextField txfContraseña;

    @FXML
    private Label lblTitulo;

    @FXML
    private ImageView imgConcesionario;

    @FXML
    private Label lblBienvenida;

    @FXML
    private TextField txfUsuario;

    @FXML
    void onRecuperarContrasenia(ActionEvent event){

    }

    // Método manejador para el botón
    @FXML
    private void onIniciarSesion() {
        // Obtener texto de los campos
        String usuario = txfUsuario.getText();
        String contraseña = txfContraseña.getText();
        String sesion =inicioSesionController.inicioSesion(usuario, contraseña);
        switch ( sesion) {
            case "cliente":
                app.openViewCliente();
                break;
        
            case "empleado":
                app.openViewEmpleado();
                break;
            
            case "administrador":
                app.openViewAdministrador();
                break;
        }
        
        
    }
    //elegirSesion()

    public void setApp(App app) {
        this.app = app;
    }

}


