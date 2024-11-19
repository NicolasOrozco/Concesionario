package co.edu.uniquindio.poo.model;

public class Administrador extends Persona{

    /**
     * Método constructor de la clase administrador
     * @param nombre;
     * @param id;
     * @param claveAcceso;
     * @param preguntaSeguridad;
     * @param respuesta;
     */
    public Administrador(String nombre, String id, String claveAcceso, String preguntaSeguridad, String respuesta) {
        super(nombre, id, claveAcceso, preguntaSeguridad, respuesta);
    }
}
