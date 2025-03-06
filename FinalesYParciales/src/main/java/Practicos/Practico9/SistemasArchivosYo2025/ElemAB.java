package Practicos.Practico9.SistemasArchivosYo2025;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElemAB {
    private String nomrbe;
    private LocalDate fechaCreacion;

    public ElemAB(String nomrbe, LocalDate fechaCreacion) {
        this.nomrbe = nomrbe;
        this.fechaCreacion = fechaCreacion;
    }

    public abstract ArrayList<ElemAB> buscar(Filtro ff);

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
