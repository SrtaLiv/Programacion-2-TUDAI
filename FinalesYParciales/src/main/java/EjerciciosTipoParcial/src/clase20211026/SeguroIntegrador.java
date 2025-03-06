package EjerciciosTipoParcial.src.clase20211026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The type Seguro integrador.
 */
public class SeguroIntegrador extends Seguro{

    private ArrayList<Seguro> elementos;

    /**
     * Instantiates a new Seguro integrador.
     *
     * @param dniCliente the dni cliente
     */
    public SeguroIntegrador(int dniCliente) {
        super(dniCliente);
        elementos = new ArrayList<>();
    }

    /**
     * Gets nro poliza.
     *
     * @return the nro poliza
     */
    @Override
    public int getNroPoliza() {
        int max = -1;
        for (Seguro s:elementos)
            if (s.getNroPoliza() > max)
                max = s.getNroPoliza();
        return max;
    }

    /*public int getNroPolizaVersionAlternativa(){
        ArrayList<Integer> nrosPoliza = new ArrayList<>();
        for(Seguro s:elementos)
            nrosPoliza.add(s.getNroPolizaVersionAlternativa());
        return Collections.max(nrosPoliza);
    }*/

    /**
     * Gets costo.
     *
     * @return the costo
     */
    @Override
    public double getCosto() {
        double suma = 0.0;
        for (Seguro s:elementos)
            suma+= s.getCosto();
        return suma;
    }

    /**
     * Gets monto asegurado.
     *
     * @return the monto asegurado
     */
    @Override
    public double getMontoAsegurado() {
        double suma = 0.0;
        for (Seguro s:elementos)
            suma+= s.getMontoAsegurado();
        return suma;
    }

    /**
     * Seguros que cumplen array list.
     *
     * @param condicion the condicion
     * @param orden     the orden
     * @return the array list
     */
    @Override
    public ArrayList<SeguroSimple> segurosQueCumplen(Filtro condicion,
                                                     Comparator<SeguroSimple> orden) {
        ArrayList<SeguroSimple> aux = new ArrayList<>();
        //Lo que NO tienen que hacer
        //for (Seguro s:elementos){
        //    if (condicion.cumple(s))
        //        aux.add(s);
        //}
        for (Seguro s:elementos){
            aux.addAll(s.segurosQueCumplen(condicion, orden));
        }
        Collections.sort(aux, orden);
        return aux;
    }

    /**
     * Agregar seguro.
     *
     * @param nuevo the nuevo
     */
    public void agregarSeguro(Seguro nuevo){
        this.elementos.add(nuevo);
    }


}
