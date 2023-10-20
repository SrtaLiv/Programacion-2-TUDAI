package Pacial2021;
import java.time.LocalDate;
public class Promocion {
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;

    public Promocion(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


}
