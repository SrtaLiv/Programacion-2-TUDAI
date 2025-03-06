package EjerciciosTipoParcial.src.ejAdicional;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pasajero  extends ElemAB{

    double deuda;
    double precio;

    public Pasajero(String destino, LocalDate fPartida, LocalDate fRegreso, double pr,
                    double deuda) {
        super(destino, fPartida, fRegreso);
        this.deuda = deuda;
        this.precio = pr;
    }

    public double getDeuda() {
        return deuda;
    }

    @Override
    public ArrayList<ElemAB> buscar(Filtroo ff) {
        ArrayList<ElemAB> elem = new ArrayList<>();
        if (ff.cumple(this))
            elem.add(this);
        return elem;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String getDestino() {
        return null;
    }

    @Override
    public LocalDate getfPartida() {
        return null;
    }

    @Override
    public LocalDate getfRegreso() {
        return null;
    }

    @Override
    public int cantPasajeros() {
        return 1;
    }

    @Override
    public Pasajero alumnoMayorDeuda() {
        return this;
    }

    @Override
    public ElemAB copia() {
        return new Pasajero(this.destino, this.fPartida, this.fRegreso
        , this.precio, this.deuda);
    }
}
