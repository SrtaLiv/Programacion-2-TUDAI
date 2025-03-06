package Practicos.Practico9.SistemasArchivosYo2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends ElemAB{
    private int tamanio;

    public Archivo(int tamanio, String nombre, LocalDate fecha) {
        super(nombre, fecha);
        this.tamanio = tamanio;
    }

    @Override
    public ArrayList<ElemAB> buscar(Filtro ff) {
        ArrayList<ElemAB> elemABS = new ArrayList<>();
        if (ff.cumple(this)){
            elemABS.add(this);
        }
        return elemABS;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
