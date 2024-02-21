package EjerciciosTipoParcial.src.Prefi2023;

import java.util.ArrayList;

public abstract class ObjetoAB{
    String nombre;

    public ObjetoAB(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract int getAnio();
    public abstract double getValorEstimado();
    public abstract int getPeso();
    public abstract ArrayList<Objeto> cumple(Filtro ff);

    public abstract boolean pertenece(Objeto obj);
    public int getCantElementos(){
        return 1;

    }





}
