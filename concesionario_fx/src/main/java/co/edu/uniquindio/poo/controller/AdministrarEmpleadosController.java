package co.edu.uniquindio.poo.controller;
import co.edu.uniquindio.poo.model.*;
import java.util.Collection;

public class AdministrarEmpleadosController {
    Concesionario concesionario;
    public AdministrarEmpleadosController(Concesionario concesionario){
        this.concesionario = concesionario;
    }

    public Collection<Empleado> obtenerListaEmpleados() {
        return concesionario.getEmpleados();
    }

    public void crearEmpleado(Empleado empleado) {
        concesionario.agregarEmpleado(empleado);
    }

    public void eliminarEmpleado(String id) {
       concesionario.eliminarEmpleado(id);
    }
    public void banearEmpleado(String id){
        concesionario.banearEmpleado(id);
    }

}
