package FINALES.Final_01_03_2024_Cocina;

public abstract class ElemAB {
    public String nombre;

    public ElemAB(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getCalorias();
    public abstract int getTiempoPreparacion();
    public abstract double getPrecio();
    public abstract void asignarAEstacion(Especialidad especialidad);
    public abstract double getCostoTotal();

}
