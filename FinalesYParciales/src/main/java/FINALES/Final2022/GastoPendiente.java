package FINALES.Final2022;

import java.time.LocalDate;
import java.util.ArrayList;

public class GastoPendiente extends GastoAB{
    LocalDate fechaDePago;
    boolean pagado;
    double deuda;
    public GastoPendiente(LocalDate fecha) {
        fechaDePago = fecha;
        pagado = false;
        deuda = 0.15;
    }

    @Override
    public double getMontoTotal() {
        if (fechaDePago.isBefore(getFecha())){
            return this.getMontoTotal();
        } else {
           // int diasNoPagos = LocalDate.diasEntre(fecha1, fecha2);
            return this.getMontoTotal() +  /*diasNoPagos * */  deuda;
        }
    }

    @Override
    public ArrayList<String> getPalabras() {
        return null;
    }

    public boolean estaPagado(){
        if (fechaDePago == LocalDate.now()){
            return true;
        } else
        return false;
    }

    @Override
    public LocalDate getFecha() {

        return null;
    }

    @Override
    public ArrayList<GastoAB> buscar(Filtro ff) {
        return null;
    }
}
