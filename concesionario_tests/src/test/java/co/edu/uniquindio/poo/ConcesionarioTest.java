package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class ConcesionarioTest {

    private Concesionario concesionario;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        concesionario = new Concesionario("Concesionario de Prueba");
        empleado = new Empleado("Carlos", "emp123", "clave123", "¿En qué ciudad naciste?", "Armenia");
        cliente = new Cliente("Ana", "cli123", "claveCliente", "¿Quien fue tu mejor amigo en la infancia?", "Pepito");
        vehiculo = new Deportivo("veh001", "Toyota", "Nuevo", "Corolla", 5, 1800, 220, 5, TipoCombustible.GASOLINA, 50000);
    }

    @Test
    public void testAgregarYVerificarEmpleado() {
        concesionario.agregarEmpleado(empleado);
        assertTrue(concesionario.verificarEmpleado("emp123"));
    }

    @Test
    public void testEliminarEmpleado() {
        concesionario.agregarEmpleado(empleado);
        concesionario.eliminarEmpleado("emp123");
        assertFalse(concesionario.verificarEmpleado("emp123"));
    }

    @Test
    public void testAgregarYVerificarCliente() {
        concesionario.agregarCliente(cliente);
        assertTrue(concesionario.verificarCliente("cli123"));
    }

    @Test
    public void testEliminarCliente() {
        concesionario.agregarCliente(cliente);
        concesionario.eliminarCliente("cli123");
        assertFalse(concesionario.verificarCliente("cli123"));
    }

    @Test
    public void testAgregarYVerificarVehiculo() {
        concesionario.agregarVehiculo(vehiculo);
        assertTrue(concesionario.verificarVehiculo("veh001"));
    }

    @Test
    public void testEliminarVehiculo() {
        concesionario.agregarVehiculo(vehiculo);
        concesionario.eliminarVehiculo("veh001");
        assertFalse(concesionario.verificarVehiculo("veh001"));
    }

    @Test
    public void testIniciarSesionEmpleado() {
        concesionario.agregarEmpleado(empleado);
        assertTrue(concesionario.iniciarSesionEmpleado("emp123", "clave123"));
        assertFalse(concesionario.iniciarSesionEmpleado("emp125", "claveIncorrecta"));
    }

    @Test
    public void testIniciarSesionCliente() {
        concesionario.agregarCliente(cliente);
        assertTrue(concesionario.iniciarSesionCliente("cli123", "claveCliente"));
        assertFalse(concesionario.iniciarSesionCliente("cli125", "claveIncorrecta"));
    }
}
