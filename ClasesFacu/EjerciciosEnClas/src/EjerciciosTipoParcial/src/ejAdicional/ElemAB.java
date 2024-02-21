package EjerciciosTipoParcial.src.ejAdicional;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElemAB {
    String destino;
    LocalDate fPartida;
    LocalDate fRegreso;
    double precio;

    public ElemAB(String destino, LocalDate fPartida, LocalDate fRegreso) {
        this.destino = destino;
        this.fPartida = fPartida;
        this.fRegreso = fRegreso;
    }

    public abstract ArrayList<ElemAB> buscar(Filtroo ff);
    public abstract double getPrecio();

    public abstract double getDeuda();

    public abstract String getDestino();

    public abstract LocalDate getfPartida();

    public abstract LocalDate getfRegreso();

    public abstract int cantPasajeros();
    public abstract Pasajero alumnoMayorDeuda();
    public abstract ElemAB copia();

}
