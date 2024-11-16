package co.edu.uniquindio.poo.model;

public class Persona {
    private String nombre, id, claveAcceso, preguntaSeguridad, respuesta ;
   
    public Persona(String nombre, String id, String claveAcceso, String preguntaSeguridad, String respuesta){
        this.nombre = nombre;
        this.id = id;
        this.claveAcceso = claveAcceso;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuesta = respuesta;
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

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
        
}
