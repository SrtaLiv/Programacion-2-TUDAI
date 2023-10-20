package Pacial2021;
import java.time.LocalDate;

public class ViajeEscapadaRomantica extends Viaje{

    public ViajeEscapadaRomantica(int cantidadMiembros, int id, String ciudadOrigen, String ciudadDestino, LocalDate fechaPago, int costo, String datos) {
        super(cantidadMiembros, id, ciudadOrigen, ciudadDestino, fechaPago, costo, datos);
    }
}
