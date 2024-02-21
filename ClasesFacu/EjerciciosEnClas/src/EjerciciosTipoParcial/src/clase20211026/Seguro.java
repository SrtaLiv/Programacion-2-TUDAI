package EjerciciosTipoParcial.src.clase20211026;


import java.util.ArrayList;
import java.util.Comparator;

/**
 * The type Seguro.
 */
public abstract class Seguro {
    private int dniCliente;

    /**
     * Instantiates a new Seguro.
     *
     * @param dniCliente the dni cliente
     */
    public Seguro(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    /**
     * Gets dni cliente.
     *
     * @return the dni cliente
     */
    public int getDniCliente() {
        return dniCliente;
    }

    public abstract int getNroPoliza();

    public abstract double getCosto();

    public abstract double getMontoAsegurado();

    public abstract ArrayList<SeguroSimple> segurosQueCumplen(Filtro condicion, Comparator<SeguroSimple> orden) ;

}
