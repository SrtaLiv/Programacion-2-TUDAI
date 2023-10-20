package Pacial2021;

import java.time.LocalDate;

public class FiltroFecha extends Filtro{
    LocalDate fecha;

    public FiltroFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(Viaje viaje) {
        return viaje.getFechaPago().equals(fecha);
    }
}
