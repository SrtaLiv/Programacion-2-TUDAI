package Practicos.Practico9.SistemasArchivosYo2025;

import Clases.CLASE12.Comparador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class ElemAB {
    private String nomrbe;
    private LocalDate fechaCreacion;

    public ElemAB(String nomrbe, LocalDate fechaCreacion) {
        this.nomrbe = nomrbe;
        this.fechaCreacion = fechaCreacion;
    }

    public abstract ArrayList<ElemAB> buscar(Filtro ff);

    public ArrayList<ElemAB> buscarPorOrden(Filtro ff, Comparador comparador){
    ArrayList<ElemAB> elemABS = this.buscar(ff);
        Collections.sort(elemABS, comparador);
        return elemABS;
    }

    /**
     * ¿Cómo cambiaría la solución si las búsquedas anteriores
     * debieran devolverse siempre por fecha de creación
     * (ascendente)?
     */

    public ArrayList<ElemAB> buscarPorOrdenASC(Filtro ff, Comparador comparador){
        ArrayList<ElemAB> elemABS = this.buscar(ff);
        Collections.sort(elemABS, comparador);
        return elemABS;
    }

    public abstract int getTamanio();

    public String getNomrbe() {
        return nomrbe;
    }

    public void setNomrbe(String nomrbe) {
        this.nomrbe = nomrbe;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
