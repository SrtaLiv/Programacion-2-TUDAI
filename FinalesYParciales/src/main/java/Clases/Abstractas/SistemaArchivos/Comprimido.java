package Clases.Abstractas.SistemaArchivos;

public class Comprimido extends CLASES.Abstractas.SistemaArchivos.Carpeta {
    private double tasaCompresion;

    public Comprimido(String nombre, double tasaCompresion) {
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio()*tasaCompresion;
    }
}
