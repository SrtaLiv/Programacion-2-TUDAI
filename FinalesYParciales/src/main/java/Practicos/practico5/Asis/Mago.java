package Practicos.practico5.Asis;

public abstract class Mago {
    protected String nombreMagico;

    public Mago(String nombreMagico) {
        this.nombreMagico = nombreMagico;
    }

    public abstract double getPoderMagico();

    public String getNombre(){
        return nombreMagico;
    }
}