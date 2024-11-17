package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import co.edu.uniquindio.poo.model.*;

public class ComprarVehiculoViewController {

    @FXML
    private ComboBox<String> tipoVehiculoCombo;

    @FXML
    private ComboBox<TipoCombustible> tipoCombustibleCombo;

    @FXML
    private VBox camposEspecificos;

    @FXML
    private TextField marcaField, modeloField, añoField, cambiosField, cilindrajeField, velMaximaField, numPasajerosField, precioField;

    @FXML
    private ComboBox<Transmision> transmisionCombo;

    @FXML
    private TextField idField;

    @FXML
    public void initialize() {
        // Inicializar ComboBox de tipo de vehículo
        tipoVehiculoCombo.getItems().addAll("Moto", "Bus", "Camion", "Deportivo", "PickUp", "Sedan", "Suv", "Van");
        tipoCombustibleCombo.getItems().addAll(TipoCombustible.values());
        transmisionCombo.getItems().addAll(Transmision.values());

        // Añadir listeners
        tipoVehiculoCombo.setOnAction(e -> actualizarCamposEspecificos());
        tipoCombustibleCombo.setOnAction(e -> actualizarCamposEspecificos());
    }

    private void actualizarCamposEspecificos() {
        camposEspecificos.getChildren().clear();

        String tipoVehiculo = tipoVehiculoCombo.getValue();
        TipoCombustible tipoCombustible = tipoCombustibleCombo.getValue();

        if (tipoVehiculo == null || tipoCombustible == null) return;

        // Campos específicos según tipo de vehículo
        switch (tipoVehiculo) {
            case "Moto":
                // Moto no tiene atributos adicionales
                break;
            case "Bus":
                camposEspecificos.getChildren().addAll(
                    crearCampoTexto("Número de Ejes:", "numEjes"),
                    crearCampoTexto("Número de Salidas de Emergencia:", "numSalidasEmergencia")
                );
                break;
            case "Camion":
                camposEspecificos.getChildren().addAll(
                    crearCampoTexto("Número de Ejes:", "numEjes"),
                    crearCampoCheckbox("Freno de Aire:", "tieneFrenoDeAire"),
                    crearCampoTexto("Tipo de Camión:", "tipoCamion")
                );
                break;
            case "Deportivo":
                camposEspecificos.getChildren().addAll(
                    crearCampoTexto("Caballos de Fuerza:", "numeroCaballosDeFuerza"),
                    crearCampoTexto("0 a 100 km/h (s):", "tiempo0a100kmph")
                );
                break;
            case "PickUp":
                camposEspecificos.getChildren().addAll(
                    crearCampoTexto("Capacidad de Caja (m³):", "capacidadCaja"),
                    crearCampoCheckbox("Es 4x4:", "es4x4")
                );
                break;
            case "Sedan":
                camposEspecificos.getChildren().addAll(
                    crearCampoTexto("Capacidad del Maletero (m³):", "capacidadMaletero")
                );
                break;
            case "Suv":
                camposEspecificos.getChildren().addAll(
                    crearCampoTexto("Capacidad del Maletero (m³):", "capacidadMaletero"),
                    crearCampoCheckbox("Es 4x4:", "es4x4")
                );
                break;
            case "Van":
                camposEspecificos.getChildren().addAll(
                    crearCampoTexto("Tipo de Van:", "tipoVan")
                );
                break;
        }

        // Campos específicos según tipo de combustible
        switch (tipoCombustible) {
            case ELECTRICO:
                camposEspecificos.getChildren().addAll(
                    crearCampoTexto("Tiempo de Carga (horas):", "tiempoDeCarga"),
                    crearCampoTexto("Capacidad de la Batería (kWh):", "capacidadBateria")
                );
                break;
            case HIBRIDO:
                camposEspecificos.getChildren().addAll(
                    crearCampoCheckbox("Es Enchufable:", "esEnchufable"),
                    crearCampoCheckbox("Es Híbrido Ligero:", "esHibridoLigero")
                );
                break;
            // GASOLINA y DIESEL no necesitan campos adicionales
        }
    }

    // Método auxiliar para crear campos de texto dinámicos
    private Node crearCampoTexto(String etiqueta, String id) {
        HBox hbox = new HBox(10);
        Label label = new Label(etiqueta);
        TextField textField = new TextField();
        textField.setId(id);
        hbox.getChildren().addAll(label, textField);
        return hbox;
    }

    // Método auxiliar para crear campos de selección (Checkbox)
    private Node crearCampoCheckbox(String etiqueta, String id) {
        CheckBox checkBox = new CheckBox(etiqueta);
        checkBox.setId(id);
        return checkBox;
    }

    @FXML
    private void registrarVehiculo() {
        // Aquí obtendrás los valores de los campos básicos y específicos
        String id = idField.getText();
        String marca = marcaField.getText();
        String modelo = modeloField.getText();
        int año = Integer.parseInt(añoField.getText());
        Transmision transmision = transmisionCombo.getValue();
        int cambios = Integer.parseInt(cambiosField.getText());
        int cilindraje = Integer.parseInt(cilindrajeField.getText());
        int velMaxima = Integer.parseInt(velMaximaField.getText());
        int numeroPasajeros = Integer.parseInt(numPasajerosField.getText());
        int precio = Integer.parseInt(precioField.getText());
        TipoCombustible tipoCombustible = tipoCombustibleCombo.getValue();

        // Según el tipo de vehículo, recoge los datos adicionales y crea el objeto
        String tipoVehiculo = tipoVehiculoCombo.getValue();
        switch (tipoVehiculo) {
            case "Camion":
                int numEjes = Integer.parseInt(getValorCampo("numEjes"));
                boolean tieneFrenoDeAire = getValorCheckbox("tieneFrenoDeAire");
                String tipoCamion = getValorCampo("tipoCamion");
                Camion camion = new Camion(id, marca, "Nueva", modelo, año, transmision, cambios, cilindraje, velMaxima, numeroPasajeros, tipoCombustible, numEjes, tieneFrenoDeAire, tipoCamion, precio);
                // Agregar el objeto al concesionario
                break;
            // Más casos para otros vehículos...
        }
    }

    // Métodos auxiliares para obtener valores dinámicos
    private String getValorCampo(String id) {
        for (Node node : camposEspecificos.getChildren()) {
            if (node instanceof HBox && node.getId() != null && node.getId().equals(id)) {
                for (Node child : ((HBox) node).getChildren()) {
                    if (child instanceof TextField) {
                        return ((TextField) child).getText();
                    }
                }
            }
        }
        return null;
    }

    private boolean getValorCheckbox(String id) {
        for (Node node : camposEspecificos.getChildren()) {
            if (node instanceof CheckBox && node.getId() != null && node.getId().equals(id)) {
                return ((CheckBox) node).isSelected();
            }
        }
        return false;
    }
}

