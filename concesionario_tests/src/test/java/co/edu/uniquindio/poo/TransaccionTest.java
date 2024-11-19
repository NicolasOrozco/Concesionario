
package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransaccionTest {

    private Concesionario concesionario;
    private Cliente cliente0;
    private Empleado empleado0;
    private Suv suv0;
    private Venta venta;

    @BeforeEach
    void setUp() {
        concesionario = new Concesionario("TuCarroUQ");
        
        cliente0 = new Cliente("Andres", "cliente0", "clave0", "¿en que año nacio?", "2007");
        concesionario.agregarCliente(cliente0);
        
        empleado0 = new Empleado("Raul", "empleado0", "contraseña0", "¿cual es el segundo nombre de su madre?", "ana");
        concesionario.agregarEmpleado(empleado0);

        suv0 = new Suv("suv0", "Chevrolet", "Nuevo", "Tahoe", 2024, Transmision.AUTOMATICO, 10, 5200, 180, 5, TipoCombustible.DIESEL, 4, true, true, true, true, true, true, true, true, 2, true, 350000000, Disponibilidad.DISPONIBLE);
        concesionario.agregarVehiculo(suv0);

        venta = new Venta();
        venta.setVehiculo(suv0);
        venta.setEmpleado(empleado0);
        venta.setCliente(cliente0);
    }

    @Test
    void testCalcularValorVenta() {
        double valorEsperado = suv0.getPrecio();
        assertEquals(valorEsperado, venta.calcularValor());
    }

    @Test
    void testObtenerTipoTransaccion() {
        assertEquals("Venta", venta.obtenerTipoTransaccion());
    }
}