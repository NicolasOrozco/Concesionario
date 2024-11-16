// File path: src/main/java/co/edu/uniquindio/poo/controller/InicioSesionController.java
package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.*;


public class InicioSesionController {
    Concesionario concesionario;

    
    public String inicioSesion(String usuario, String contraseña){
        String sesion = "";
        if(concesionario.iniciarSesionCliente(usuario, contraseña)){
            sesion = "cliente";
        }else if(concesionario.iniciarSesionEmpleado(usuario, contraseña)){
         sesion = "empleado";
        }
        else if(concesionario.iniciarSesionAdministrador(usuario, contraseña)){
            sesion = "administrador";
        }
        return sesion;
}
    }
