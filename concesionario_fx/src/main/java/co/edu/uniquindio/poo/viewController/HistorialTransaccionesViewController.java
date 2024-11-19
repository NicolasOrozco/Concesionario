package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.model.Transaccion;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.HistorialTransaccionesController;
import java.util.Collection;
import javafx.beans.property.SimpleObjectProperty;

public class HistorialTransaccionesViewController {

    ObservableList<Transaccion> listTransacciones = FXCollections.observableArrayList();
    Transaccion selectedTransaccion;


    HistorialTransaccionesController historialTransaccionesController;
    private App app;

    @FXML
    private TableView<Transaccion> tblTransacciones;

    @FXML
    private Button btnVolver;

    @FXML
    private Label lblTitulo;

    @FXML
    private TableColumn<Transaccion, String> tbcTransaccion;

    @FXML
    private TableColumn<Transaccion, String> tbcCliente;

    @FXML
    private TableColumn<Transaccion, Double> tbcValor;

    @FXML
    private TableColumn<Transaccion, String> tbcFecha;

    @FXML
    private TableColumn<Transaccion, String> tbcEmpleado;

    @FXML
    void onVolver() {
        app.openViewAdministrador();
    }

    @FXML
    void initialize() {
        historialTransaccionesController = new HistorialTransaccionesController(app.concesionario);
        initView();
    }

    private void cargarTransacciones() {
    Collection<Transaccion> transacciones = historialTransaccionesController.obtenerListTransaccions();
    listTransacciones.setAll(transacciones);
    }
    

    public void initView(){
        initDataBinding();
        cargarTransacciones();
        tblTransacciones.setItems(listTransacciones);
        listenerSelection();
    }
    private void listenerSelection(){
        tblTransacciones.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {selectedTransaccion = newSelection;});
    }

    private void initDataBinding() {
        tbcFecha.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFecha().toString()));
        tbcTransaccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().obtenerTipoTransaccion()));
        tbcEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmpleado().getNombre()));
        tbcCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCliente().getNombre()));
        tbcValor.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getValor()));
    }
    
    public void setApp(App app) {
        this.app = app;
    }

}
