package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Empleado;

public class EditarEmpleadoController {
    Concesionario concesionario;
    public EditarEmpleadoController(Concesionario concesionario){
        this.concesionario = concesionario;
    }
    public void editarEmpleado(String id, Empleado actualizado){
        App.concesionario.editarEmpleado(id, actualizado);

    }
}
