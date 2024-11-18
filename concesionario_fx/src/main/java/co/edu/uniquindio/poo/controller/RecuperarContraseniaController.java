package co.edu.uniquindio.poo.controller;
import co.edu.uniquindio.poo.model.*;

public class RecuperarContraseniaController {
    Concesionario concesionario;
    public RecuperarContraseniaController(Concesionario concesionario){
        this.concesionario = concesionario;
    }
    public void recuperarContrasenia(String nuevaContrasenia, String id, String respuesta ){
        for(Empleado empleado: concesionario.getEmpleados()){
            if(empleado.getId().equals(id)){
                if(respuesta.equals(empleado.getRespuesta())){
                    empleado.setClaveAcceso(nuevaContrasenia);
                    break;
                }
                else{

                }
            }
        }
        for(Cliente cliente : concesionario.getClientes()){
            if(cliente.getId().equals(id)){
                if(respuesta.equals(cliente.getRespuesta())){
                    cliente.setClaveAcceso(nuevaContrasenia);
                    break;
                }
                else{

                }
            }
        
        }
        for(Administrador administrador : concesionario.getAdministradores()){
            if(administrador.getId().equals(id)){
                if(respuesta.equals(administrador.getRespuesta())){
                    administrador.setClaveAcceso(nuevaContrasenia);
                    break;
                }
                else{

                }
            }
        
        }
    }
}


