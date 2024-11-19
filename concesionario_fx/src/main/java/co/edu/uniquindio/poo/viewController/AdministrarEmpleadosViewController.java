package co.edu.uniquindio.poo.viewController;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AdministrarEmpleadosController;
import javafx.beans.property.SimpleStringProperty;
import java.util.Collection;

public class AdministrarEmpleadosViewController {

    private App app;
    AdministrarEmpleadosController administrarEmpleadosController;
    ObservableList<Empleado> listEmpleados = FXCollections.observableArrayList();
    Empleado selectedEmpleado;

    @FXML
    private TableColumn<Empleado, String> tbcId;

    @FXML
    private TableView<Empleado> tblEmpleados;

    @FXML
    private Button btnVolver;

    @FXML
    private Label lblTitulo;

    @FXML
    private TableColumn<Empleado, String> tbcNombre;

    @FXML
    private Button btnCrear;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnDesactivar;

    @FXML
    void onVolver() {
        app.openViewAdministrador();
    }

    @FXML
    void onEditar() {
        app.openEditarEmpleado();
    }

    @FXML
    void onCrear() {
        app.openCrearEmpleado();
    }

    @FXML
    void initialize() {
        administrarEmpleadosController = new AdministrarEmpleadosController(app.concesionario);
        initView();
    }

    @FXML
    void onDesactivar() {
        administrarEmpleadosController.banearEmpleado(selectedEmpleado.getId());
    }
    
    private void cargarEmpleados() {
    Collection<Empleado> empleados = administrarEmpleadosController.obtenerListaEmpleados();
    listEmpleados.setAll(empleados);
    }
    

    public void initView(){
        initDataBinding();
        cargarEmpleados();
        tblEmpleados.setItems(listEmpleados);
        listenerSelection();
    }
    private void listenerSelection(){
        tblEmpleados.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedEmpleado = newSelection;
        });
    }

    private void initDataBinding() {
        tbcId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        tbcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
    }

    public void setApp(App app) {
        this.app = app;
    }

}
