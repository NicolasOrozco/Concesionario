package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import java.time.Year;

import co.edu.uniquindio.poo.model.*;

import co.edu.uniquindio.poo.viewController.*;

/**
 * JavaFX App
 */
public class App extends Application {
    private Stage primaryStage;
    private static Scene scene;

     @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Inicio de sesion");
        openViewPrincipal();
    }



    public void openViewPrincipal() {
        //inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("inicioSesion.fxml"));
            Parent root = loader.load();

            InicioSesionViewController inicioSesionViewController = loader.getController();
            inicioSesionViewController.setApp(this);

            Scene scene = new Scene(root);
            primaryStage.setScene(scene); // Usar el primaryStage aquí
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openViewCliente() {
        /*try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("HomeCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ClienteViewController clienteViewController = loader.getController();
            clienteViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */
    }

    public void openViewEmpleado(){

    }

    public void openViewAdministrador(){

    }

    public void inicializarData(){
        Cliente cliente0 = new Cliente("Andres", "cliente0", "clave0");

        Cliente cliente1 = new Cliente("Fernequi", "cliente1", "clave1");

        Empleado empleado0 = new Empleado("Raul", "empleado0", "contraseña0");

        Administrador administrador0 = new Administrador("Jose", "admin", "admin");

        Suv suv0 = new Suv("suv0", "Chevrolet", "Nuevo", "Tahoe",2024, 10, 5200, 180, 5, TipoCombustible.DIESEL, 4, true, true, true, true, true, true, true, true,   )
    }


    public static void main(String[] args) {
        launch();
    }

}