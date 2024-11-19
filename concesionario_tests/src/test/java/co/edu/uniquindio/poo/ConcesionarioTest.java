package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcesionarioTest {

    private Concesionario concesionario;
    private Cliente cliente0, cliente1;
    private Empleado empleado0;
    private Administrador administrador0;
    private Suv suv0, suv1, suv2, suv3;
    private Deportivo deportivo1;

    @BeforeEach
    void setUp() {
        Concesionario concesionario;

        concesionario = new Concesionario("TuCarro UQ");
        
        cliente0 = new Cliente("Andres", "cliente0", "clave0", "¿en que año nacio?", "2007");
        concesionario.agregarCliente(cliente0);
        
        cliente1 = new Cliente("Fernequi", "cliente1", "clave1", "¿cual es su color favorito?", "azul");
        concesionario.agregarCliente(cliente1);
        
        empleado0 = new Empleado("Raul", "empleado0", "contraseña0", "¿cual es el segundo nombre de su madre?", "ana");
        concesionario.agregarEmpleado(empleado0);
        
        administrador0 = new Administrador("Jose", "admin", "admin", "¿cual es el palindromo de su 2do apellido", "anipso");
        concesionario.agregarAdminsitrador(administrador0);

        suv0 = new Suv("suv0", "Chevrolet", "Nuevo", "Tahoe", 2024, Transmision.AUTOMATICO, 10, 5200, 180, 5, TipoCombustible.DIESEL, 4, true, true, true, true, true, true, true, true, 2, true, 350000000, Disponibilidad.DISPONIBLE);
        concesionario.agregarVehiculo(suv0);
        
        suv1 = new Suv("suv1", "Toyota", "Nuevo", "Fortuner", 2023, Transmision.AUTOMATICO, 15, 4500, 175, 7, TipoCombustible.GASOLINA, 5, true, true, false, true, false, true, true, false, 2, true, 280000000, Disponibilidad.DISPONIBLE);
        concesionario.agregarVehiculo(suv1);

        suv2 = new Suv("suv2", "Mazda", "Usado", "CX-5", 2020, Transmision.MANUAL, 25, 3800, 165, 5, TipoCombustible.GASOLINA, 4, true, false, false, true, true, false, true, true, 1, false, 190000000, Disponibilidad.DISPONIBLE);
        concesionario.agregarVehiculo(suv2);
        
        suv3 = new Suv("suv3", "Hyundai", "Nuevo", "Santa Fe", 2024, Transmision.AUTOMATICO, 12, 4800, 170, 6, TipoCombustible.HIBRIDO, 4, true, true, true, true, true, true, true, true, 3, true, 330000000, Disponibilidad.DISPONIBLE);
        concesionario.agregarVehiculo(suv3);
        
        deportivo1 = new Deportivo("deportivo1", "Ferrari", "Nuevo", "488 Pista", 2024, Transmision.AUTOMATICO, 7, 3902, 340, 2, TipoCombustible.GASOLINA, 2, true, true, true, true, true, true, true, true, 720, 2.85, 1200000000, Disponibilidad.DISPONIBLE); 
        concesionario.agregarVehiculo(deportivo1);
    }

    @Test
    void testAgregarCliente() {
        assertTrue(concesionario.getClientes().contains(cliente0));
        assertTrue(concesionario.getClientes().contains(cliente1));
    }

    @Test
    void testAgregarEmpleado() {
        assertTrue(concesionario.getEmpleados().contains(empleado0));
    }

    @Test
    void testAgregarAdministrador() {
        assertTrue(concesionario.getAdministradores().contains(administrador0));
    }

    @Test
    void testAgregarVehiculo() {
        assertTrue(concesionario.getVehiculos().contains(suv0));
        assertTrue(concesionario.getVehiculos().contains(suv1));
        assertTrue(concesionario.getVehiculos().contains(suv2));
        assertTrue(concesionario.getVehiculos().contains(suv3));
        assertTrue(concesionario.getVehiculos().contains(deportivo1));
    }

    @Test
    void testAgregarVehiculoConDisponibilidadNoDisponible() {
        Suv suv4 = new Suv("suv4", "Ford", "Usado", "Explorer", 2022, Transmision.MANUAL, 20, 4300, 160, 5, TipoCombustible.HIBRIDO, 4, true, false, true, true, false, true, true, true, 3, false, 320000000, Disponibilidad.ALQUILADO);
        concesionario.agregarVehiculo(suv4);
        assertTrue(concesionario.getVehiculos().contains(suv4));
        assertEquals(Disponibilidad.ALQUILADO, suv4.getDisponibilidad());
    }


}