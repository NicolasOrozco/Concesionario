package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.model.Transaccion;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.HistorialTransaccionesController;
import java.net.URL;

public class HistorialTransaccionesViewController {

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
    private TableColumn<Transaccion, Integer> tbcValor;

    @FXML
    private TableColumn<Transaccion, String> tbcFecha;

    @FXML
    private TableColumn<Transaccion, String> tbcEmpleado;

    @FXML
    void onVolver() {
        app.openViewAdministrador();
    }
    
    public void setApp(App app) {
        this.app = app;
    }

}
