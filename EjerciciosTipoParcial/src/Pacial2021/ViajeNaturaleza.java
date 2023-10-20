package Pacial2021;
import java.time.LocalDate;

public class ViajeNaturaleza extends Viaje {
    protected int tiempoEstadia;

    public ViajeNaturaleza(int cantidadMiembros, int id, String ciudadOrigen, String ciudadDestino,
                           LocalDate fechaPago, int costo, int tiempo, String datosAlojamiento) {
        super(cantidadMiembros, id, ciudadOrigen, ciudadDestino, fechaPago, costo, datosAlojamiento);
        tiempoEstadia = tiempo;
    }
}
