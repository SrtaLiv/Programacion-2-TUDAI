package EjerciciosTipoParcial.src.FINAL2023;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EntrenamientoCompuesto extends EntrenamientoAB{
    ArrayList<EntrenamientoAB> entrenamientoABS;
    int factorEnergetico;

    public EntrenamientoCompuesto() {
        this.entrenamientoABS = new ArrayList<>();
        factorEnergetico = 0;
    }

    public ArrayList<EntrenamientoAB> getEntrenamientoABS() {
        return new ArrayList<>(entrenamientoABS);
    }

    @Override
    int getDuracion() {
        int duracion = 0;
        for (EntrenamientoAB ee : entrenamientoABS){
            duracion += ee.getDuracion();
        }
        return duracion;
    }

    @Override
    String getActividad() {
        String act = null;
        for (EntrenamientoAB ent : entrenamientoABS) {
            act = ent.getActividad() + "-";
        }
        return act;
    }

    @Override
    ArrayList<EntrenamientoAB> buscar(Filtro ff) {
        ArrayList<EntrenamientoAB> ent = new ArrayList<>();
        for (EntrenamientoAB entre : entrenamientoABS) {
            if (ff.cumple(this)){
                ent.add(this);
            } else {
                ent.addAll(entre.buscar(ff));
            }
        }
        return ent;
    }

    @Override
    int getCosto() {
        int costo = 0;
        for (EntrenamientoAB ent : entrenamientoABS){
            costo += ent.getCosto();
        }
        return costo + factorEnergetico ;
    }


    public void setEntrenamientoABS(ArrayList<EntrenamientoAB> entrenamientoABS) {
        this.entrenamientoABS = entrenamientoABS;
    }
}
