package co.edu.uniquindio.poo;

public class Vehiculo {
    private  String id,  marca, condicion, modelo;
    private  int cambios, cilindraje, VelMaxima, numeroPasajeros, precio;
    private TipoCombustible tipoCombustible;
    private AtributosCombustible atributosCombustible;
   

    public Vehiculo(String id, String marca, String condicion, String modelo, int cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int precio){
        this.marca = marca;
        this.condicion = condicion;
        this.modelo = modelo;
        this.cambios = cambios;
        this.cilindraje = cilindraje;
        this.VelMaxima = velMaxima;
        this.numeroPasajeros = numeroPasajeros;
        this.precio = precio;
        this.id = id; 
        this.tipoCombustible = tipoCombustible;
        this.atributosCombustible = crearAtributosCombustible(tipoCombustible);
               
    }
    private AtributosCombustible crearAtributosCombustible(TipoCombustible tipo) {
        switch(tipo) {
            case ELECTRICO: return new AtributosElectrico();
            case HIBRIDO: return new AtributosHibridos();
            default: return new AtributosCombustible();
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getVelMaxima() {
        return VelMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        VelMaxima = velMaxima;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getId(){
        return id;
    } 
    public void setId(String id){
        this.id = id;
    }
    
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public AtributosCombustible getAtributosCombustible() {
        return atributosCombustible;
    }
    public void setAtributosCombustible(AtributosCombustible atributosCombustible) {
        this.atributosCombustible = atributosCombustible;
    }

    

}
