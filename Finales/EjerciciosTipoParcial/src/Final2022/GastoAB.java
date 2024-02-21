package Final2022;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class GastoAB {
    public abstract double getMontoTotal();
    public abstract ArrayList<String> getPalabras(); //sin repetidos ordenados alfabe
    public abstract LocalDate getFecha();
    public abstract ArrayList<GastoAB> buscar(Filtro ff);
}
