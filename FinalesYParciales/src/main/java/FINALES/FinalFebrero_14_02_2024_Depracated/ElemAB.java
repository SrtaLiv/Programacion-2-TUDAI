package FINALES.FinalFebrero_14_02_2024_Depracated;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElemAB implements Comparable<ElemAB>{
    private int id;

    public ElemAB(int id) {
        this.id = id;
    }

    public abstract double getValor();

    public abstract LocalDate getFechaCompra();
    public abstract ArrayList<ElemAB> buscar(Filtro ff);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(ElemAB o) {
        // Primero comparas por ID
        int idComparison = Integer.compare(this.getId(), o.getId());

        // Si los ID son iguales, entonces comparas por fecha de compra
        if (idComparison == 0) { // CERO ES SI SON 2 OBJETOS IGUALES
            return this.getFechaCompra().compareTo(o.getFechaCompra()); // COMPARAR POR ANTIGUEDAD
        }

        return idComparison;
    }

    public abstract double cobrarAlquiler(Calculador calculador);
}
