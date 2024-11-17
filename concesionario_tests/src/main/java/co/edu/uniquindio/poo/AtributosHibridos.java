package co.edu.uniquindio.poo;

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

    @Override
    public String toString() {
        return super.toString() + "es Enchufable=" + esEnchufable + ", es Hibrido Ligero=" + esHibridoLigero ;
    }
    
    
}
