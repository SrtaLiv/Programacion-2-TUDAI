package CLASES.Abstractas.EjComputos;

public class Computadora extends ObjetoComparable{
    private int velocidad;
    private String nombre;
    Proceso ejecutando;

    public Computadora(int velocidad, String nombre) {
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return this.getNombre() + " ("+this.getVelocidad()+")";
    }

    public void asignarProceso(Proceso proc) {
        ejecutando = proc;
    }

    public boolean estaLibre(){
        return ejecutando==null;
    }

    public void liberarComputadora(){
        this.ejecutando = null;
    }

    @Override
    public boolean esMenor(ObjetoComparable otro) {
        return this.getVelocidad() < ((Computadora) otro).getVelocidad();
    }
}
