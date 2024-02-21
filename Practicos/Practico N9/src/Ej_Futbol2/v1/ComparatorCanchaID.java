package Ej_Futbol2.v1;

import java.util.Comparator;

public class ComparatorCanchaID implements Comparator<Socio> {

    // Atributo

    private int idCancha;

    // Constructor

    public ComparatorCanchaID(int idCancha) {
        this.idCancha = idCancha;
    }

    // Comportamiento

    @Override
    public int compare(Socio socio1, Socio socio2) {
        
        return Integer.valueOf(socio1.cantidadVecesCanchaAlquilada(this.idCancha)).compareTo(socio2.cantidadVecesCanchaAlquilada(this.idCancha));
    }
    
}
