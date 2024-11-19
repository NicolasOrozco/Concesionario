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

}
