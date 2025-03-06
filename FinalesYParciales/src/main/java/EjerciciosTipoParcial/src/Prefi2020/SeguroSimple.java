package EjerciciosTipoParcial.src.Prefi2020;

import java.util.ArrayList;

public class SeguroSimple extends SeguroAB  {
    int nroPoliza;
    String descripcion;
    int monto;
    CalculadorCosto calculadorCosto;

    public SeguroSimple(int nroPoliza, String descripcion,
                        int monto, CalculadorCosto calculadorCosto) {
        this.nroPoliza = nroPoliza;
        this.descripcion = descripcion;
        this.monto = monto;
        this.calculadorCosto = calculadorCosto;
    }

    @Override
    public int getMonto() {
        return 0;
    }

    @Override
    public int getNroPoliza() {
        return 0;
    }

    @Override
    public int getCosto() {
        return calculadorCosto.getCosto(this);
    }

    @Override
    public ArrayList<SeguroSimple> buscar(Filtro ff) {
        ArrayList<SeguroSimple> result = new ArrayList<>();
        if (ff.cumple(this))
            result.add(this);
        return result;
    }


}
