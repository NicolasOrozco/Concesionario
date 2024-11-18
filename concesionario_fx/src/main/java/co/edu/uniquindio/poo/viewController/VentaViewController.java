package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

import java.net.URL;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import co.edu.uniquindio.poo.controller.VentaController;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;

import java.util.Collection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class VentaViewController {
    VentaController ventaController;
    ObservableList<Vehiculo> listVehiculos = FXCollections.observableArrayList();
    private App app;
    Vehiculo selectedVehiculo;

    
    @FXML
    private URL location;


    @FXML
    private TableColumn<Vehiculo, String> tbcTipoVehiculo;

    @FXML
    private TableColumn<Vehiculo, String> tbcMarca;

    @FXML
    private Button btnVender;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Label lblTitulo;

    @FXML
    private TableView<Vehiculo> tblVehiculos;

    @FXML
    private Label lblCedulaCliente;

    @FXML
    private TableColumn<Vehiculo, Integer> tbcPrecio;

    @FXML
    private Label lblCedulaEmpleado;

    @FXML
    private TableColumn<Vehiculo, String> tbcTipoCombustible;

    @FXML
    private TableColumn<Vehiculo, String> tbcModelo;

    @FXML
    private TextField btnCedulaCliente;

    @FXML
    private TextField btnCedulaEmpleado;


    @FXML
    void onVender(ActionEvent event) {
        
    }

    @FXML
    void initialize() {
        ventaController = new VentaController(app.concesionario);
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
        tbcPrecio.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getPrecio()).asObject());

    }

    // tbcCedula.setCellValueFactory(cellData -> new
    // SimpleStringProperty(cellData.getValue().getCedula()));


    private void cargarVehiculos() {
    Collection<Vehiculo> vehiculos = ventaController.ObtenerVehiculos();
    listVehiculos.setAll(vehiculos);
    }

    @FXML
    void onCerrarSesion(ActionEvent event) {
        app.openHomeEmpleado();
    }

    @FXML
    void onVerDetalles(ActionEvent event) {
        
    }


    public void setApp(App app) {
        this.app = app;
    }


}
