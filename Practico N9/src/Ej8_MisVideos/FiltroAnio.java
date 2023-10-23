package Ej8_MisVideos;

import java.time.LocalDate;

public class FiltroAnio extends Filtro{
    LocalDate anio;

    public FiltroAnio(LocalDate anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Video elem) {
        return elem.getFechaC().getYear() == anio.getYear();
    }
}
