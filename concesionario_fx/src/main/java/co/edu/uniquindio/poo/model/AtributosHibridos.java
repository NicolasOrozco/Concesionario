package co.edu.uniquindio.poo.model;

public class AtributosHibridos extends AtributosCombustible {
    private boolean esEnchufable, esHibridoLigero;

    public AtributosHibridos(boolean esEnchufable, boolean esHibridoLigero){
        this.esEnchufable = esEnchufable;
        this.esHibridoLigero = esHibridoLigero;
    }

    public AtributosHibridos(){}

    public boolean isEsEnchufable() {
        return esEnchufable;
    }

    public void setEsEnchufable(boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }

    public boolean isEsHibridoLigero() {
        return esHibridoLigero;
    }

    public void setEsHibridoLigero(boolean esHibridoLigero) {
        this.esHibridoLigero = esHibridoLigero;
    }
    
}
