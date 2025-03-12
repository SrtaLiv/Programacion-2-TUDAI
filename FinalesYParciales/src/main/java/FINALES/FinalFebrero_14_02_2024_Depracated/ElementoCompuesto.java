package FINALES.FinalFebrero_14_02_2024_Depracated;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

//COMBO ARMADO
public class ElementoCompuesto extends ElemAB{
    private ArrayList<ElemAB> elems;

    public ElementoCompuesto(int id) {
        super(id);
        this.elems = new ArrayList<>();
    }

    @Override
    public double getValor() {
        double valor = 0;
        for (ElemAB elem : elems){
            valor += elem.getValor();
        }
        return valor;
    }

    @Override
    public LocalDate getFechaCompra() {
        LocalDate fechaMasReciente = LocalDate.of(2000, 1, 1); //Inicializo con una fecha vieja
        for (ElemAB elem : elems){
            if (elem.getFechaCompra().isAfter(fechaMasReciente)){
                fechaMasReciente = elem.getFechaCompra();
            }
        }
        return fechaMasReciente;
    }

    @Override
    public ArrayList<ElemAB> buscar(Filtro ff) {
        ArrayList<ElemAB> result = new ArrayList<>();
        for (ElemAB elem : elems){
            result.addAll(elem.buscar(ff));
        }
        Collections.sort(result);
        return result;
    }

    public void agregarElemento(ElemAB elem) {
        elems.add(elem);
    }

    public ArrayList<ElemAB> getElems() {
        return new ArrayList<>(elems);
    }

    public void setElems(ArrayList<ElemAB> elems) {
        this.elems = elems;
    }

    @Override
    public double cobrarAlquiler(Calculador calculador){
        double costo = 0;
        for (ElemAB elem : getElems()){
            costo += calculador.calcularCosto(elem);
        }
        return costo;
    }
}
