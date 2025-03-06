package FINALES.FinalFebrero_14_02_2025;

import java.time.LocalDate;
import java.util.ArrayList;

public class ElementoSimple extends ElemAB {
    String descripcion;
    double valor;
    private LocalDate fechaVenta;
    private Calculador calculador;

    public ElementoSimple(int id, Calculador calculador) {
        super(id);
        this.calculador = calculador;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public LocalDate getFechaCompra() {
        return this.fechaVenta;
    }

    @Override
    public ArrayList<ElemAB> buscar(Filtro ff) {
        ArrayList<ElemAB> result = new ArrayList<>();
        if (ff.cumple(this)){
            result.add(this);
            return result;
        }
        return null;
    }

    @Override
    public double cobrarAlquiler(Calculador calculador) {
        return calculador.calcularCosto(this);
    }


}
