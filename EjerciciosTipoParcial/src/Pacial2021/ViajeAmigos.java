package Pacial2021;
import java.time.LocalDate;
public class ViajeAmigos extends Viaje{
    protected int cantidadAmigos;

    public ViajeAmigos(int cantidadMiembros, int id, String ciudadOrigen, String ciudadDestino,
                       LocalDate fechaPago, int costo, int amigos, String datosAlojamiento) {
        super(cantidadMiembros, id, ciudadOrigen, ciudadDestino, fechaPago, costo, datosAlojamiento);
        this.cantidadAmigos = amigos;
    }
}
