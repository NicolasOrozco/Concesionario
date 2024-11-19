package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Disponibilidad;

import java.util.List;
import java.util.stream.Collectors;

public class ComprarVehiculoController {

    private final Concesionario concesionario;

    public ComprarVehiculoController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public List<Vehiculo> obtenerVehiculosDisponibles() {
        return concesionario.getVehiculos().stream()
                .filter(vehiculo -> vehiculo.getDisponibilidad() == Disponibilidad.DISPONIBLE)
                .collect(Collectors.toList());
    }

    public boolean comprarVehiculo(String idVehiculo) {
        Vehiculo vehiculo = concesionario.buscarVehiculo(idVehiculo);
        if (vehiculo != null && vehiculo.getDisponibilidad() == Disponibilidad.DISPONIBLE) {
            concesionario.eliminarVehiculo(idVehiculo);
            return true;
        }
        return false;
    }
}
