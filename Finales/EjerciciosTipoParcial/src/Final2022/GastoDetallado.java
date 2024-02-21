package Final2022;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class GastoDetallado extends GastoAB{
    ArrayList<GastoAB> gastos;

    public GastoDetallado() {
        this.gastos = new ArrayList<>();
    }

    public void addElemento(GastoAB gas){
        gastos.add(gas);
    }
    @Override
    public double getMontoTotal() {
        return 0;
    }

    @Override
    public ArrayList<String> getPalabras() {
        ArrayList<String> result = new ArrayList<>();
        for (GastoAB gasto : gastos){
            result.addAll(gasto.getPalabras());
        }
        Collections.sort(result);
        return result;
    }

    @Override
    public LocalDate getFecha() { //obtiene la fecha mayor
        LocalDate aux = LocalDate.of(1400, 12, 12);
        for (GastoAB gasto : gastos){
            if (gasto.getFecha().isAfter(aux) ){
                aux = gasto.getFecha();
            }
        }
        return aux;
    }

    @Override
    public ArrayList<GastoAB> buscar(Filtro ff) {
        ArrayList<GastoAB> result = new ArrayList<>();
        if (ff.cumple(this)){
           result.add(this);
        } else {
            for (GastoAB gasto : gastos){
                result.addAll(gasto.buscar(ff));
            }
        }
        return result;
    }
}
