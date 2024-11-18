package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

import java.net.URL;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import co.edu.uniquindio.poo.controller.AlquilarController;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Transaccion;

import java.util.Collection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

public class AlquilarViewControler {
    AlquilarController alquilarController;
    ObservableList<Vehiculo> listVehiculos = FXCollections.observableArrayList();
    private App app;
    Vehiculo selectedVehiculo;
    @FXML
    private Button btnAlquilar;

    ObservableList<Empleado> listEmpleados = FXCollections.observableArrayList();
    Empleado selectedEmpleado;


    @FXML
    void onCerrarSesion(ActionEvent event) {
        app.openViewPrincipal();
    }

    @FXML
    private TableColumn<Vehiculo, String> tbcTipoVehiculo;

    @FXML
    private TableColumn<Vehiculo, String> tbcMarca;

    @FXML
    private Label lblDias;

    @FXML
    private Button btnVolver;

    @FXML
    private Label lblTitulo;

    @FXML
    private TableView<Vehiculo> tblVehiculos;

    @FXML
    private Label lblCedulaCliente;

    @FXML
    private TableColumn<Transaccion, Double> tbcPrecio;

    @FXML
    private TextField txfDias;

    @FXML
    private Label lblCedulaEmpleado;

    @FXML
    private TableColumn<Vehiculo, String> tbcTipoCombustible;

    @FXML
    private TableColumn<Vehiculo, String> tbcModelo;

    @FXML
    private TextField txfCedulaEmpleado;

   @FXML
   private TextField txfCedulaCliente; 

   

    @FXML
    void onAlquilar(ActionEvent event) {
        alquilarController.alquilar(selectedVehiculo, txfCedulaCliente.getText(), txfCedulaEmpleado.getText(),Integer.parseInt(txfDias.getText()));
    }
    @FXML 
    void onVolver(ActionEvent event){
        app.openRealizarTransacciones();
    }
    @FXML
    void initialize() {
        alquilarController = new AlquilarController(app.concesionario);
        initView();
    }

    

    private void initView() {
    initDataBinding();
    cargarVehiculos(); // Llenar la tabla con los datos
    tblVehiculos.setItems(listVehiculos);
    listenerSelection();
    }

    private void listenerSelection() {
        tblVehiculos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVehiculo = newSelection;
        });
    }

    private void initDataBinding() {
        tbcTipoVehiculo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().obtenerTipoVehiculo()));
        tbcMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbcModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tbcTipoCombustible.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipoCombustible().toString()));
        tbcPrecio.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getValor()/250));

    }


    private void cargarVehiculos() {
    Collection<Vehiculo> vehiculos = alquilarController.ObtenerVehiculos();
    listVehiculos.setAll(vehiculos);
}

    public void setApp(App app) {
        this.app = app;
    }

}
