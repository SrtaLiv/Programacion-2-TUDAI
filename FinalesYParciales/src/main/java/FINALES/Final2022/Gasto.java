package FINALES.Final2022;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gasto extends GastoAB {
    String nombre;
    String descr;
    LocalDate fecha;
    double monto;
    ArrayList<String> palabrasClave;

    public Gasto(String nombre, String descr, LocalDate fecha, double monto) {
        this.nombre = nombre;
        this.descr = descr;
        this.fecha = fecha;
        this.monto = monto;
        this.palabrasClave = new ArrayList<>();
    }

    public void addPalabraClave(String ss){
        if (!palabrasClave.contains(ss)) //control de repetidos!
        palabrasClave.add(ss);
    }
    @Override
    public double getMontoTotal() {
        return 0;
    }

    @Override
    public ArrayList<String> getPalabras() {
        return new ArrayList<>(palabrasClave);
    }

    @Override
    public LocalDate getFecha() {
        return null;
    }

    @Override
    public ArrayList<GastoAB> buscar(Filtro ff) {
        ArrayList<GastoAB> res = new ArrayList<>();
        if (ff.cumple(this)){
            res.add(this);
        }
        return res;
    }
}
