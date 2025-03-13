package FINALES.Final_01_03_2024_Cocina;

public class ElementoSimple extends ElemAB {
    private String tipo;
    private String modoPreparacion;
    private int calorias;
    private double precio;
    private int tiempoPreparacion;

    public ElementoSimple(String nombre, String tipo, String modoPreparacion,
                          int calorias, double precio, int tiempoPreparacion) {
        super(nombre);
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
        this.calorias = calorias;
        this.precio = precio;
        this.tiempoPreparacion = tiempoPreparacion;
    }


    @Override
    public int getCalorias() {
        return 0;
    }

    @Override
    public int getTiempoPreparacion() {
        return 0;
    }

    @Override
    public double getPrecio() {
        return 0;
    }

    @Override
    public void asignarAEstacion(Especialidad especialidad) {

    }

    @Override
    public double getCostoTotal() {
        return 0;
    }
}
