package co.edu.uniquindio.poo.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.App;


public class ComprarMotoViewController {
    App app;
     @FXML
    private TextField txfCombustible;

    @FXML
    private TextField txfCapacidadBateria;

    @FXML
    private TextField txfAnio;

    @FXML
    private TextField txfCondicion;

    @FXML
    private Label lblAttsElectrico;

    @FXML
    private Label lblAnio;

    @FXML
    private Label lblCambios;

    @FXML
    private Label lblTitulo;

    @FXML
    private CheckBox checkSiHibridoLigero;

    @FXML
    private TextField txfVelMaxima;

    @FXML
    private Label lblEnchufable;

    @FXML
    private TextField txfPrecio;

    @FXML
    private TextField txfTiempoCarga;

    @FXML
    private Label lblCombustible;


    @FXML
    private TextField txfModelo;

    @FXML
    private Button btnVolver;

    @FXML
    private TextField txfMarca;


    @FXML
    private TextField txfPlaca;

    @FXML
    private Label lblModelo;

    @FXML
    private Label lblPasajeros;

    @FXML
    private TextField txfCilindraje;

    @FXML
    private Label lblVelMaxima;

    @FXML
    private CheckBox checkSiEnchufable;

    @FXML
    private Label lblTransmision;

    @FXML
    private Label lblPlaca;

    @FXML
    private Label lblTiempoCarga;

    @FXML
    private Label lblAttsHibrido;

    @FXML
    private TextField txfCambios;

    @FXML
    private Label lblPrecio;

    @FXML
    private Label lblMarca;

    @FXML
    private Button btnCrearVehiculo;

    @FXML
    private Label lblHibridoLigero;

    @FXML
    private Label lblCapacidadBateria;

    @FXML
    private TextField txfPasajeros;

    @FXML
    private Label lblCondicion;

    @FXML
    private TextField txfTransmision;

    @FXML
    private Label lblCilindraje;

    @FXML
    private Label lblCedulaCliente;

    @FXML
    private Label lblCedulaEmpleado;

    @FXML
    private TextField txfCedulaCliente;

    @FXML
    private TextField txfCedulaEmpleado;

    @FXML
    void onVolver(ActionEvent event) {
        app.openComprarVehiculo();
    }

    @FXML
    void onCrearVehiculo(ActionEvent event) {

    }

    public void setApp(App app) {
        this.app = app;
    }
    

}
