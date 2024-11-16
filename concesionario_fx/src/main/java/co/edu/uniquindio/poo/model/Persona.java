package co.edu.uniquindio.poo.model;

public class Persona {
    private String nombre;
    private String id, claveAcceso;
    public Persona(String nombre, String id, String claveAcceso){
        this.nombre = nombre;
        this.id = id;
        this.claveAcceso = claveAcceso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }
}
