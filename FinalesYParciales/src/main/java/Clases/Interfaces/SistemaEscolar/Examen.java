package CLASES.Interfaces.SistemaEscolar;

public abstract class Examen implements Aprobable{
    String fecha;

    public Examen(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
