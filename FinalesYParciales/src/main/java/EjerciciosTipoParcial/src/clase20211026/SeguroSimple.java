package EjerciciosTipoParcial.src.clase20211026;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * The type Seguro simple.
 */
public class SeguroSimple extends Seguro{

    private String descripcion;
    private int nroPoliza;
    private double montoAsegurado;
    private CalculadorCosto calculador;


    public SeguroSimple(int dniCliente, String descripcion, int nroPoliza, double monto, CalculadorCosto calculador) {
        super(dniCliente);
        this.descripcion = descripcion;
        this.nroPoliza = nroPoliza;
        this.montoAsegurado = monto;
        this.calculador = calculador;
    }

    /**
     * Gets descripcion.
     *
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Gets nro poliza.
     *
     * @return the nro poliza
     */
    @Override
    public int getNroPoliza() {
        return nroPoliza;
    }

    /**
     * Gets costo.
     *
     * @return the costo
     */
    @Override
    public double getCosto() {
        return calculador.cuantoCuesta(this);
    }

    /**
     * Gets monto asegurado.
     *
     * @return the monto asegurado
     */
    @Override
    public double getMontoAsegurado() {
        return montoAsegurado;
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
        ArrayList<SeguroSimple> retorno = new ArrayList<>();
        if (condicion.cumple(this))
            retorno.add(this);
        return retorno;
    }

    /**
     * Cambiar calculador.
     *
     * @param nuevo the nuevo
     */
    public void cambiarCalculador(CalculadorCosto nuevo){
        this.calculador = nuevo;
    }

}
