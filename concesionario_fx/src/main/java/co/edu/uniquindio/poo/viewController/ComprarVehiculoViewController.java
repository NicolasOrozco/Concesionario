package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.*;
import javafx.event.ActionEvent;

public class ComprarVehiculoViewController {
    ComprarVehiculoController comprarVehiculoController;
    App app;

    @FXML
    private Button btnDeportivo;

    @FXML
    private Button btnCamion;

    @FXML
    private Button btnVolver;

    @FXML
    private Button btnBus;

    @FXML
    private Button btnContinuar;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblPregunta;

    @FXML
    private Button btnVan;

    @FXML
    private Button btnSuv;

    @FXML
    private Button btnPickUp;

    @FXML
    private Button btnMoto;

    @FXML
    private Button btnSedan;

    @FXML
    void onVolver(ActionEvent event) {
        app.openComprarVehiculo();
    }

    @FXML
    void onBus(ActionEvent event) {
        app.openComprarBus();
    }

    @FXML
    void onContinuar(ActionEvent event) {

    }

    @FXML
    void onCamion(ActionEvent event) {
        app.openComprarBus();
    }

    @FXML
    void onDeportivo(ActionEvent event) {

    }

    @FXML
    void onMoto(ActionEvent event) {

    }

    @FXML
    void onPickUp(ActionEvent event) {

    }

    @FXML
    void onSedan(ActionEvent event) {

    }

    @FXML
    void onSuv(ActionEvent event) {
        app.openComprarSuv();
    }

    @FXML
    void onVan(ActionEvent event) {
        app.openComprarVan();
    }

    @FXML
    void initialize() {
        comprarVehiculoController = new ComprarVehiculoController(app.concesionario);
        //initView();
    }


    public void setApp(App app) {
        this.app = app;
    }

}
