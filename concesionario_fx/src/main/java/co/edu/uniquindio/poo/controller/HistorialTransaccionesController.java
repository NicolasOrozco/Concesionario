package co.edu.uniquindio.poo.controller;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Concesionario;
import java.util.Collection;


public class HistorialTransaccionesController {
    Concesionario concesionario;

     public HistorialTransaccionesController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public Collection<Transaccion> obtenerListTransaccions() {
        return concesionario.getTransacciones();
    }

}
