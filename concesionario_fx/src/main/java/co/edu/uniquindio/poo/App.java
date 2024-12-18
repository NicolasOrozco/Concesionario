package co.edu.uniquindio.poo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.layout.AnchorPane;
import co.edu.uniquindio.poo.model.*;
import co.edu.uniquindio.poo.viewController.*;


/**
 * JavaFX App
 */
public class App extends Application {
    public static Concesionario concesionario = new Concesionario("tu carro uq");
    private Stage primaryStage;
    private static Scene scene;

     @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Inicio de sesion");
        openViewPrincipal();
    }
    

    public void openViewPrincipal() {
        inicializarData();
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
    
    public void openHomeCliente() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("HomeCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            HomeClienteViewController homeClienteViewController = loader.getController();
            homeClienteViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void openHomeEmpleado(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("HomeEmpleado.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            HomeEmpleadoViewController homeEmpleadoViewController = loader.getController();
            homeEmpleadoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }   
    public void openComprarVehiculo() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("ComprarVehiculo.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ComprarVehiculoViewController comprarVehiculoViewController = loader.getController();
            comprarVehiculoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    public void openAdministrarEmpleados(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("AdministrarEmpleados.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            AdministrarEmpleadosViewController administrarEmpleadosViewController = loader.getController();
            administrarEmpleadosViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }


    public void openComprarSuv(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("ComprarSuv.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ComprarSuvViewController comprarSuvViewController = loader.getController();
            comprarSuvViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void openComprarVan(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("ComprarVan.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ComprarVanViewController comprarVanViewController = loader.getController();
            comprarVanViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void openComprarBus(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("ComprarBus.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ComprarBusViewController comprarBusViewController = loader.getController();
            comprarBusViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void openComprarCamion(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("ComprarCamion.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ComprarCamionViewController viewController = loader.getController();
            viewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void openComprarDeportivo(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("ComprarDeportivo.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ComprarDeportivoViewController viewController = loader.getController();
            viewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }


    public void openViewAdministrador(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("HomeAdministrador.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            HomeAdministradorViewController homeAdministradorViewController = loader.getController();
            homeAdministradorViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void openCrearEmpleado(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrearEmpleado.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            CrearEmpleadoViewController crearEmpleadoViewController = loader.getController();
            crearEmpleadoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openCrearClientes(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrearCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            CrearClienteViewController crearClienteViewController = loader.getController();
            crearClienteViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openEditarEmpleado(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("EditarEmpleado.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            EditarEmpleadoViewController editarEmpleadoViewController = loader.getController();
            editarEmpleadoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openRealizarTransacciones(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RealizarTransaccion.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RealizarTransaccionViewController realizarTransaccionViewController = loader.getController();
            realizarTransaccionViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
     public void openViewTransacciones(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("HistorialTransacciones.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            HistorialTransaccionesViewController historialTransaccionesViewController = loader.getController();
            historialTransaccionesViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openAlquilar(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("Alquiler.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            AlquilarViewControler alquilarViewControler = loader.getController();
            alquilarViewControler.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openVender(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("Venta.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            VentaViewController ventaViewController = loader.getController();
            ventaViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     public void openRecuperarContrasenia(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RecuperarContrasenia.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RecuperarContraseniaViewController recuperarContraseniaViewController = loader.getController();
            recuperarContraseniaViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void inicializarData(){
        
        Cliente cliente0 = new Cliente("Andres", "cliente0", "clave0", "¿en que año nacio?", "2007");
        concesionario.agregarCliente(cliente0);
        Cliente cliente1 = new Cliente("Fernequi", "cliente1", "clave1", "¿cual es su color favorito?", "azul");
        concesionario.agregarCliente(cliente1);
        Empleado empleado0 = new Empleado("Raul", "empleado0", "contraseña0", "¿cual es el segundo nombre de su madre?", "ana");
        concesionario.agregarEmpleado(empleado0);
        Administrador administrador0 = new Administrador("Jose", "admin", "admin", "¿cual es el palindromo de su 2do apellido", "anipso");
        concesionario.agregarAdminsitrador(administrador0);
        Suv suv0 = new Suv("suv0", "Chevrolet", "Nuevo", "Tahoe",2024,Transmision.AUTOMATICO, 10, 5200, 180,  5, TipoCombustible.DIESEL, 4, true, true, true, true, true, true, true, true, 2, true, 350000000, Disponibilidad.DISPONIBLE);
        suv0.setAtributosCombustible(new AtributosCombustible());
        concesionario.agregarVehiculo(suv0);

        Suv suv1 = new Suv("suv1", "Toyota", "Nuevo", "Fortuner", 2023, Transmision.AUTOMATICO, 15, 4500, 175, 7, TipoCombustible.GASOLINA, 5, true, true, false, true, false, true, true, false, 2, true, 280000000, Disponibilidad.DISPONIBLE);
        suv1.setAtributosCombustible(new AtributosCombustible());
        concesionario.agregarVehiculo(suv1);

        Suv suv2 = new Suv("suv2", "Mazda", "Usado", "CX-5", 2020, Transmision.MANUAL, 25, 3800, 165, 5, TipoCombustible.GASOLINA, 4, true, false, false, true, true, false, true, true, 1, false, 190000000, Disponibilidad.DISPONIBLE);
        suv2.setAtributosCombustible(new AtributosCombustible());
        concesionario.agregarVehiculo(suv2);

        Suv suv3 = new Suv("suv3", "Hyundai", "Nuevo", "Santa Fe", 2024, Transmision.AUTOMATICO, 12, 4800, 170, 6, TipoCombustible.HIBRIDO, 4, true, true, true, true, true, true, true, true, 3, true, 330000000, Disponibilidad.DISPONIBLE);
        suv3.setAtributosCombustible(new AtributosCombustible());
        concesionario.agregarVehiculo(suv3);

        Deportivo deportivo1 = new Deportivo("deportivo1", "Ferrari", "Nuevo", "488 Pista", 2024, Transmision.AUTOMATICO, 7, 3902, 340, 2, TipoCombustible.GASOLINA, 2, true, true, true, true, true, true, true, true, 720, 2.85, 1200000000, Disponibilidad.DISPONIBLE); 
        concesionario.agregarVehiculo(deportivo1);


    }
    public static void main(String[] args) {
        launch();
    }

}