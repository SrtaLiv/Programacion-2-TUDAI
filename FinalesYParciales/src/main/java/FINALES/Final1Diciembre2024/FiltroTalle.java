package FINALES.Final1Diciembre2024;

import java.util.ArrayList;

public class FiltroTalle extends Filtro{
    private int talle;

    @Override
    public boolean cumple(Miembro miembro) {
        return miembro.getAltura() == talle;
    }
}
