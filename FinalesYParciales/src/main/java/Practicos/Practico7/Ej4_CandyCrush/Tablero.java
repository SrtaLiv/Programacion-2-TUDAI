package Practicos.Practico7.Ej4_CandyCrush;

import java.util.ArrayList;

public class Tablero {
    public static final int PUNTAJE_MINIMO = 20;
    ArrayList<Ficha> fichas;
    int dificultad;

    public Tablero() {
        this.fichas = new ArrayList<>();
        this.dificultad = getDificultad();
    }

    public int getDificultad() {
        int sumatoriaFortalezaFichas = 0;
        int sumatoriaPoderDestruccion = 0;

        for (Ficha ficha : fichas) {
            sumatoriaFortalezaFichas += ficha.getFortaleza();
            sumatoriaPoderDestruccion += ficha.getPoderDestruccion();
        }

        if (sumatoriaPoderDestruccion != 0) {
            return sumatoriaFortalezaFichas / sumatoriaPoderDestruccion;
        } else {
            return -1;
        }
    }


    public void addFichas(Ficha f){
        fichas.add(f);
    }

    public ArrayList<Ficha> buscarFicha(Filtro f){
        ArrayList<Ficha> fichasEncontradas = new ArrayList<>();
        for (int i = 0; i < fichas.size(); i++) {
            if (f.cumple(fichas.get(i))){
                fichasEncontradas.add(fichas.get(i));
            }
        }
        return fichasEncontradas;
    }

}
