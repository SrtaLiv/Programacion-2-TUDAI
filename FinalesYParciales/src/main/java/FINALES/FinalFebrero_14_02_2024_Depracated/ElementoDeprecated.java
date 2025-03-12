package FINALES.FinalFebrero_14_02_2024_Depracated;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ElementoDeprecated extends ElemAB {
    private static double descuento;
    private LocalDate fechaObsoleto;
    private ElemAB elementoRepresentado;

    public ElementoDeprecated(int id, LocalDate fechaObsoleto, ElemAB elemAB) {
        super(id);
        this.fechaObsoleto = fechaObsoleto;
        this.elementoRepresentado = elemAB;
    }

    @Override
    public ArrayList<ElemAB> buscar(Filtro ff) {
        ArrayList<ElemAB> result = new ArrayList<>();
        if (elementoRepresentado.getFechaCompra().isBefore(fechaObsoleto) && ff.cumple(this)) {
            result.add(this); // Agrega este elemento si cumple con el filtro
        }
        result.addAll(elementoRepresentado.buscar(ff)); // Busca dentro del elemento representado
        return result;
    }

    public double getValor() {
        if (LocalDate.now().isBefore(fechaObsoleto)) {
            return elementoRepresentado.getValor(); // Si no está vencido, conserva el valor original
        } else {
            long mesesDiferencia = ChronoUnit.MONTHS.between(fechaObsoleto, LocalDate.now());
            double nuevoValor = elementoRepresentado.getValor() * (1 - (descuento * mesesDiferencia));

            if (nuevoValor < 0) {
                return 0; // Si el valor es negativo, devuelve 0
            } else {
                return nuevoValor;
            }
        }
    }

    @Override
    public LocalDate getFechaCompra() {
        return elementoRepresentado.getFechaCompra();
    }

    public LocalDate getFechaObsoleto() {
        return this.fechaObsoleto;
    }

    public double cobrarAlquiler(Calculador calculador) {
        double costo = 0;
            if (fechaObsoleto.isAfter(LocalDate.now())) { // si esta vencido
                costo += elementoRepresentado.cobrarAlquiler(calculador) / 2; // La mitad de lo que vale
            } else {
                costo += elementoRepresentado.cobrarAlquiler(calculador); // Costo normal
            }
        return costo;
    }

}