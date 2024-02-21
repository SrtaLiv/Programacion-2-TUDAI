package Final2024;

import java.util.ArrayList;

public class Comando extends ComandoAB{
    String gastoBateria;
    double tiempoEjecucion;
    String instruccion;

    public Comando(String gastoBateria, double tiempoEjecucion) {
        this.gastoBateria = gastoBateria;
        this.tiempoEjecucion = tiempoEjecucion;
    }


    @Override
    public double getGastoBateria() {
        Kiko.getInstance();

        return 0;
    }

    @Override
    public int getCantTiempo() {
        return 0;
    }

    @Override
    public ComandoAB copia(Filtro ff) {
        if (ff.cumplio(this)){
            return new Comando(this.gastoBateria, this.tiempoEjecucion);
        }
       return null;
    }

    @Override
    public ArrayList<ComandoAB> buscar(Filtro ff) {
        ArrayList<ComandoAB> result = new ArrayList<>();
        if (ff.cumplio(this)){
            result.add(this);
        }
        return result;
    }

    @Override
    public int getConsumo() {
        return 0;
    }


}
