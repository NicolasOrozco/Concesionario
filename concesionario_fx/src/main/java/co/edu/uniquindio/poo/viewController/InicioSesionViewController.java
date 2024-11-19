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


public class InicioSesionViewController {
    InicioSesionController inicioSesionController;

    private App app;
    @FXML
    private URL location;


    
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
        app.openRecuperarContrasenia();
    }

    @FXML
    void initialize() {
        inicioSesionController = new InicioSesionController(app.concesionario);
    }

    // Método manejador para el botón
    @FXML
    private void onIniciarSesion() {
        // Obtener texto de los campos
        String usuario = txfUsuario.getText();
        String contraseña = txfContraseña.getText();
        String sesion =inicioSesionController.inicioSesion(usuario, contraseña);
        switch (sesion) {
            case "cliente":
                app.openHomeCliente();
                break;
        
            case "empleado":
                app.openHomeEmpleado();
                break;
            
            case "administrador":
                app.openViewAdministrador();
                break;
        }
        
    
    }
   

    public void setApp(App app) {
        this.app = app;
    }

}