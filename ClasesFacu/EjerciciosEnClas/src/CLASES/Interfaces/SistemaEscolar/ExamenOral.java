package CLASES.Interfaces.SistemaEscolar;

public class ExamenOral extends Examen{
    int notaSatisfaccion;

    public ExamenOral(String fecha, int notaSatisfaccion) {
        super(fecha);
        this.notaSatisfaccion = notaSatisfaccion;
    }

    @Override
    public boolean aprobo() {
        return false;
    }

    public int getNotaSatisfaccion() {
        return notaSatisfaccion;
    }

    public void setNotaSatisfaccion(int notaSatisfaccion) {
        this.notaSatisfaccion = notaSatisfaccion;
    }
}
