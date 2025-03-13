package FINALES.Final_Diciembre_2024_Trajes;

public class ModificarTraje extends Modificador{
    private int talle;

    public ModificarTraje(int talle) {
        this.talle = 1;
    }

    @Override
    public TrajeAB modificar(Traje elemAB) {
        elemAB.setTalle(talle);
        return elemAB;
    }
}
