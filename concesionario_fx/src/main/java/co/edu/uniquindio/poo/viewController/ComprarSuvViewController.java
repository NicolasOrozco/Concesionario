package co.edu.uniquindio.poo.viewController;
import javafx.scene.control.CheckBox;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Suv;
import co.edu.uniquindio.poo.model.Disponibilidad;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.TipoCombustible;


public class ComprarSuvViewController {
    ComprarSuvController comprarSuvController;
    App app;
    @FXML
    private TextField txfCapacidadBateria;

    @FXML
    private TextField txfCondicion;

    @FXML
    private Label lblAnio;

    @FXML
    private Label lblCambios;

    @FXML
    private Label lblTitulo;

    @FXML
    private CheckBox checkSiHibridoLigero;

    @FXML
    private CheckBox checkSiTraficoCruzado;

    @FXML
    private Label lblEnchufable;

    @FXML
    private TextField txfPrecio;

    @FXML
    private TextField txfTiempoCarga;

    @FXML
    private Label lblCombustible;

    @FXML
    private CheckBox checkSiAireAcondicionado;

  


    @FXML
    private TextField txfModelo;

    @FXML
    private Label lblControlCrucero;

    @FXML
    private TextField txfMarca;

    @FXML
    private Label lbl4x4;

    @FXML
    private Label lblAsistenciaCarril;

    

   

    @FXML
    private CheckBox checkSiAsistenciaCarril;

    @FXML
    private Label lblPasajeros;

    @FXML
    private Label lblVelMaxima;

  

    @FXML
    private TextField txfMaletero;

    @FXML
    private Label lblMaletero;


    @FXML
    private Label lblAttsHibrido;

    @FXML
    private Label lblPrecio;

    @FXML
    private Label lblSensores;

    @FXML
    private Label lblCondicion;

    @FXML
    private TextField txfTransmision;

    @FXML
    private CheckBox checkSiCamaraTrasera;

    @FXML
    private Label lblABS;

    @FXML
    private Label lblCilindraje;

    @FXML
    private TextField txfCombustible;

    @FXML
    private TextField txfAnio;

    @FXML
    private TextField txfPuertas;

    @FXML
    private Label lblAttsElectrico;

    @FXML
    private TextField txfVelMaxima;

    @FXML
    private CheckBox checkSiSensorColision;

   
    @FXML
    private Label lblAirbag;



    @FXML
    private Button btnVolver;

    @FXML
    private Label lblPuertas;

    @FXML
    private Label lblSensorColision;

    @FXML
    private Label lblAc;

    @FXML
    private TextField txfPlaca;

    @FXML
    private CheckBox checkSi4x4;

    @FXML
    private Label lblModelo;

  

    @FXML
    private TextField txfCilindraje;

    @FXML
    private CheckBox checkSiEnchufable;



    @FXML
    private Label lblTransmision;

    @FXML
    private CheckBox checkSiControlCrucero;

    @FXML
    private Label lblPlaca;

    @FXML
    private Label lblTiempoCarga;

    @FXML
    private TextField txfCambios;

    @FXML
    private Label lblMarca;

    @FXML
    private Button btnCrearVehiculo;

    @FXML
    private CheckBox checkSiAirbag;

    @FXML
    private Label lblHibridoLigero;

    @FXML
    private Label lblTraficoCruzado;

    @FXML
    private Label lblCapacidadBateria;

    @FXML
    private TextField txfPasajeros;

    @FXML
    private CheckBox checkSiABS;

    

    @FXML
    private Label lblCamaraTrasera;

    @FXML
    private Label lblCedulaCliente;

    @FXML
    private Label lblCedulaEmpleado;

    @FXML
    private TextField txfCedulaCliente;

    @FXML
    private TextField txfCedulaEmpleado;

    @FXML
    void onVolver(ActionEvent event) {
        app.openComprarVehiculo();
    }
    @FXML
    void initialize() {
        comprarSuvController = new ComprarSuvController(app.concesionario);
    }

    @FXML
    void onCrearVehiculo(ActionEvent event) {
        app.concesionario.comprarVehiculO(buildSuv(),txfCedulaEmpleado.getText() ,txfCedulaCliente.getText());
    }

    private Suv buildSuv(){
        Suv suv = new Suv("id", txfMarca.getText(), txfCondicion.getText(), txfModelo.getText(), Integer.parseInt(txfAnio.getText()), Transmision.valueOf(lblTransmision.getText().toUpperCase()), Integer.parseInt(txfCambios.getText()), Integer.parseInt(txfCilindraje.getText()), 
        Integer.parseInt(txfVelMaxima.getText()), Integer.parseInt(txfPasajeros.getText()), TipoCombustible.valueOf(txfCombustible.getText().toUpperCase()), Integer.parseInt(txfPuertas.getText()), checkSiAireAcondicionado.isSelected(), checkSiCamaraTrasera.isSelected(),
        checkSiControlCrucero.isSelected(), checkSiAirbag.isSelected(), checkSiABS.isSelected(), checkSiSensorColision.isSelected(), checkSiTraficoCruzado.isSelected(), checkSiAsistenciaCarril.isSelected(), Double.parseDouble(txfMaletero.getText()),
        checkSi4x4.isSelected(), Integer.parseInt(txfPrecio.getText()), Disponibilidad.DISPONIBLE );
        return suv;
        
    }


    public void setApp(App app) {
        this.app = app;
    }
    
}
