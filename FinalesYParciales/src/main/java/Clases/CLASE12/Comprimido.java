package Clases.CLASE12;

public class Comprimido extends Carpeta{
    private double tasaCompresion;

    public Comprimido(String nombre, double tasaCompresion) {
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio()*tasaCompresion;
    }

    @Override
    public String toString() {
        return super.toString()+" (tasa: "+this.tasaCompresion+")";
    }
    protected Carpeta crearCopiaBasica() {
        return new Comprimido(this.getNombre(), this.tasaCompresion);
    }
}
