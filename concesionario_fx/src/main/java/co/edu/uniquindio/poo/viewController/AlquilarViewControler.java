package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.controller.AlquilarController;
import co.edu.uniquindio.poo.model.Vehiculo;
import java.util.Collection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleObjectProperty;

public class AlquilarViewControler {
    private AlquilarController alquilarController;
    private ObservableList<Vehiculo> listVehiculos = FXCollections.observableArrayList();
    private Vehiculo selectedVehiculo;
    private App app;

    @FXML
    private TableView<Vehiculo> tblVehiculos;

    @FXML
    private TableColumn<Vehiculo, String> tbcTipoVehiculo;

    @FXML
    private TableColumn<Vehiculo, String> tbcMarca;

    @FXML
    private TableColumn<Vehiculo, String> tbcModelo;

    @FXML
    private TableColumn<Vehiculo, String> tbcTipoCombustible;

    @FXML
    private TableColumn<Vehiculo, Double> tbcPrecio;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblCedulaCliente;

    @FXML
    private Label lblCedulaEmpleado;

    @FXML
    private Label lblDias;

    @FXML
    private TextField txfCedulaCliente;

    @FXML
    private TextField txfCedulaEmpleado;

    @FXML
    private TextField txfDias;

    @FXML
    private Button btnAlquilar;

    @FXML
    private Button btnVolver;


    @FXML
    void onCerrarSesion(ActionEvent event) {
        app.openViewPrincipal();
    }

    @FXML
    void onAlquilar(ActionEvent event) {
        alquilarController.alquilar(selectedVehiculo, txfCedulaCliente.getText(), txfCedulaEmpleado.getText(),Integer.parseInt(txfDias.getText()));
        initDataBinding();
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
        tbcPrecio.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getPrecio()/250.0));

    }


    private void cargarVehiculos() {
    Collection<Vehiculo> vehiculos = alquilarController.ObtenerVehiculos();
    listVehiculos.setAll(vehiculos);
}

    public void setApp(App app) {
        this.app = app;
    }

}
