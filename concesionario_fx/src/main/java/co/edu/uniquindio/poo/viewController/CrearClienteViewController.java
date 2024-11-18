package co.edu.uniquindio.poo.viewController;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import co.edu.uniquindio.poo.controller.CrearClienteController;
import co.edu.uniquindio.poo.model.Cliente;
import java.util.Collection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;


import java.net.URL;

public class CrearClienteViewController {
    CrearClienteController crearClienteController;
    ObservableList<Cliente> listClientes = FXCollections.observableArrayList();
    Cliente selectedCliente;
    private App app;
    @FXML
    private URL location;

    @FXML
    private TableColumn<Cliente, String> tbcNombreCliente;

    @FXML
    private TableColumn<Cliente, String> tbcCedulaCliente;

    @FXML
    private TableView<Cliente> tblClientes;
    
    @FXML
    private Label lblNombre;

    @FXML
    private Label lblContrasenia;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblRespuesta;

    @FXML
    private Button btnVolver;

    @FXML
    private TextField txfContrasenia;

    @FXML
    private Label lblPregunta;

    @FXML
    private Label lblCedula;

    @FXML
    private TextField txfCdeula;

    @FXML
    private Button btnCrearCliente;

    @FXML
    private TextField txfRespuesta;

    @FXML
    private TextField txfPregunta;

    @FXML
    private TextField txfNombre;

    @FXML
    void onCrearCliente(ActionEvent event) {
        crearClienteController.crearCliente(new Cliente(txfNombre.getText(), txfCdeula.getText(), txfContrasenia.getText(), txfPregunta.getText(), txfRespuesta.getText()));
        app.openHomeEmpleado();
    }

    private void initView() {
    initDataBinding();
    CargarClientes(); // Llenar la tabla con los datos
    tblClientes.setItems(listClientes);
    listenerSelection();
    }
    
    private void CargarClientes() {
    Collection<Cliente> clientes = crearClienteController.obtenerListaClientes();
    listClientes.setAll(clientes);
    }

    private void listenerSelection() {
        tblClientes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCliente = newSelection;
        });
    }

    private void initDataBinding() {
        tbcNombreCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbcCedulaCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        

    }

    @FXML
    void onVolver(ActionEvent event) {
        app.openHomeEmpleado();
    }

    @FXML
    void initialize() {
        crearClienteController = new CrearClienteController(app.concesionario);
        initView();
    }

    public void setApp(App app) {
        this.app = app;
    }


}