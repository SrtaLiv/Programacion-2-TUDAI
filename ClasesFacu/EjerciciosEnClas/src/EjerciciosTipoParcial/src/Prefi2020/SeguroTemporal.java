package EjerciciosTipoParcial.src.Prefi2020;


import java.time.LocalDate;
import java.util.ArrayList;

public class SeguroTemporal extends SeguroAB {
    LocalDate fInicio;
    LocalDate fFin;
    private SeguroAB contenido;


    public SeguroTemporal(LocalDate fInicio, LocalDate fFin, SeguroAB segirp) {
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.contenido = segirp;
    }

    @Override
    public int getNroPoliza() {
        return contenido.getNroPoliza();
    }

    @Override
    public int getMonto() {
            if (periodo())
            return contenido.getMonto();
        else return 0;
    }

    public boolean periodo(){
        LocalDate fActual = LocalDate.now();
        return (fActual.isAfter(this.fInicio ) && fActual.isBefore(this.fFin));
    }

    @Override
    public int getCosto() {
        if (periodo()){
            contenido.getCosto();
        }
        return 0;
    }

    @Override
    public ArrayList<SeguroSimple> buscar(Filtro ff) {
        ArrayList<SeguroSimple> result = new ArrayList<>();
        if (periodo()){
            return contenido.buscar(ff);
        }
        return result;
    }
}
