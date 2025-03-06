package EjerciciosTipoParcial.src.FINAL2023;

import java.util.ArrayList;

public class EntrenamientoRepetitivo extends EntrenamientoAB{
    int cantidad;
    int pausa;

    public EntrenamientoRepetitivo(int cantidad, int pausa) {
        this.cantidad = cantidad;
        this.pausa = 1;
    }

    @Override
    int getDuracion() {
        return getDuracion() * cantidad + pausa;
    }

    @Override
    int getCosto() {
        return getCosto() * cantidad + pausa;
    }

    @Override
    String getActividad() {
        return getActividad() + " X " + cantidad;
    }

    @Override
    ArrayList<EntrenamientoAB> buscar(Filtro ff) {
        return null;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPausa(int pausa) {
        this.pausa = pausa;
    }
}
