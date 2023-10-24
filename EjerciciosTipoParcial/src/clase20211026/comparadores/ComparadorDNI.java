package clase20211026.comparadores;

import clase20211026.SeguroSimple;

import java.util.Comparator;

public class ComparadorDNI implements Comparator<SeguroSimple> {
    @Override
    public int compare(SeguroSimple o1, SeguroSimple o2) {
        return o1.getDniCliente() - o2.getDniCliente();
    }
}
