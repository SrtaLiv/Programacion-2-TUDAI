package EjerciciosTipoParcial.src.clase20211026;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * The type Seguro temporal.
 */
public class SeguroTemporal extends Seguro{
    private LocalDate fIncial, fFinal;
    private Seguro contenido;

    /**
     * Instantiates a new Seguro temporal.
     *
     * @param dni       the dni
     * @param fIncial   the f incial
     * @param fFinal    the f final
     * @param contenido the contenido
     */
    public SeguroTemporal(int dni, LocalDate fIncial, LocalDate fFinal, Seguro contenido) {
        super(dni);
        this.fIncial = fIncial;
        this.fFinal = fFinal;
        this.contenido = contenido;
    }

    /**
     * Esta vigente boolean.
     *
     * @return the boolean
     */
    public boolean estaVigente(){
        LocalDate hoy = LocalDate.now();
        return hoy.compareTo(fIncial) > 0 &&
                hoy.compareTo(fFinal) < 0;
    }

    /**
     * Gets nro poliza.
     *
     * @return the nro poliza
     */
    @Override
    public int getNroPoliza() {
        return contenido.getNroPoliza();
    }

    /**
     * Gets costo.
     *
     * @return the costo
     */
    @Override
    public double getCosto() {
        if (estaVigente())
            return contenido.getCosto();
        return 0.0;
    }

    /**
     * Gets monto asegurado.
     *
     * @return the monto asegurado
     */
    @Override
    public double getMontoAsegurado() {
        if (estaVigente())
            return contenido.getMontoAsegurado();
        return 0.0;
    }

    /**
     * Seguros que cumplen array list.
     *
     * @param condicion the condicion
     * @param orden     the orden
     * @return the array list
     */
    @Override
    public ArrayList<SeguroSimple> segurosQueCumplen(Filtro condicion, Comparator<SeguroSimple> orden) {
        if (estaVigente())
            return contenido.segurosQueCumplen(condicion, orden);
        return new ArrayList<>();
    }
}
