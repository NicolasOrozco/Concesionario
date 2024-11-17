package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

import java.net.URL;
import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import co.edu.uniquindio.poo.controller.HomeClienteController;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Concesionario;
import java.util.Collection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class AlquilarViewControler {
        @FXML
    private Button btnAlquilar;

    @FXML
    private TableColumn<?, ?> tbcTipoVehiculo;

    @FXML
    private TableColumn<?, ?> tbcMarca;

    @FXML
    private Label lblCedulaEmpleado1;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Label lblTitulo;

    @FXML
    private TableView<?> tblVehiculos;

    @FXML
    private Label lblCedulaCliente;

    @FXML
    private TableColumn<?, ?> tbcPrecio;

    @FXML
    private TextField btnCedulaEmpleado1;

    @FXML
    private Label lblCedulaEmpleado;

    @FXML
    private TableColumn<?, ?> tbcTipoCombustible;

    @FXML
    private TableColumn<?, ?> tbcModelo;

    @FXML
    private TextField btnCedulaCliente;

    @FXML
    private TextField btnCedulaEmpleado;

    @FXML
    void onCerrarSesion(ActionEvent event) {

    }

    @FXML
    void onAlquilar(ActionEvent event) {

    }
}
