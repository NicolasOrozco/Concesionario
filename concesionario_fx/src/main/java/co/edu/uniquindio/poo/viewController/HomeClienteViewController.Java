package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
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

public class HomeClienteViewController {

    HomeClienteController homeClienteController;

    App app;
    @FXML
    private URL location;

    @FXML
    private Button btnVerDetalles;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Label lblTitulo;

    @FXML
    void initialize() {
        homeClienteController = new HomeClienteController(app.concesionario);
        initView();
    }

    private void initView() {
        initDataBinding();
        obtenerVehiculos();
        ListVehiculos.setItems(listVehiculos);
        listenerSelection();
    }

    private Collection<Vehiculo> obtenerVehiculos() {
        return app.concesionario.getVehiculos();
    }

    

    @FXML
    private ListView<Vehiculo> listVehiculos = FXCollections.ob(obtenerVehiculos());
    

    @FXML
    void onCerrarSesion(ActionEvent event) {

    }

    @FXML
    void onVerDetalles(ActionEvent event) {
        
    }

    public void setApp(App app) {
        this.app = app;
    }

   
}
