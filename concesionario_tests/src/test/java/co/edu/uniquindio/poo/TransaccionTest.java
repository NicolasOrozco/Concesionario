
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

/**
 * Unit test for simple App.
 */
public class TransaccionTest {
    private static final Logger LOG = Logger.getLogger(ConcesionarioTest.class.getName());

    private Compra compra;
    private Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        vehiculo = new Vehiculo("veh001", "Toyota", "Nuevo", "Corolla", 5, 1800, 220, 5, TipoCombustible.GASOLINA, 50000);
        compra = new Compra(vehiculo,null,null);
        compra.setVehiculo(vehiculo);
        Alquiler alquiler = new Alquiler(vehiculo, null, null, LocalDate.of(2024,11,16), LocalDate.of(2024,11,26));
    }

    @Test
    public void testCalcularValor() {
        assertEquals(50000, compra.getValor(), "El valor de compra debería ser igual al precio del vehículo");
    }


    private Alquiler alquiler;
    @Test
    public void testCalcularValorAlquiler() {
        double expectedValue = (vehiculo.getPrecio() / 250.0) * 10;
        assertEquals(expectedValue, alquiler.calcularValor(), 0.01, "El valor de alquiler debería calcularse correctamente en función de los días de alquiler");
    }

}
