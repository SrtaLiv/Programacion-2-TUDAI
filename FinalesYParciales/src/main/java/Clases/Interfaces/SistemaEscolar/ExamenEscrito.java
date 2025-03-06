package CLASES.Interfaces.SistemaEscolar;

public class ExamenEscrito extends Examen{
    public static final int MIN_NOTA = 0;
    public static final int MAX_NOTA = 10;
    public static final int NOTA_APROB = 6;
    public static final int MIN_DURACION = 90;
    int duracion;
    int nota;

    public ExamenEscrito(String fecha, int nota, int duracion) {
        super(fecha);
        this.nota = nota;
        this.duracion = duracion;
    }


    @Override
    public boolean aprobo() {
        return this.nota>NOTA_APROB&&this.duracion<MIN_DURACION;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
