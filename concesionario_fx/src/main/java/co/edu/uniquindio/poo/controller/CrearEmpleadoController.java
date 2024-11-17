package co.edu.uniquindio.poo.controller;
import java.util.Collection;

import co.edu.uniquindio.poo.model.*;


public class CrearEmpleadoController {
    
    Concesionario concesionario;
    public CrearEmpleadoController(Concesionario concesionario){
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

    public void editarEmpleado(String id, Empleado empleado) {
       //concesionario.editarEmpleado(id, empleado);
    }


}
