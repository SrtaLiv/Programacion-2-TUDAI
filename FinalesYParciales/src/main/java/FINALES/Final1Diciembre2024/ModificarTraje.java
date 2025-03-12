package FINALES.Final1Diciembre2024;

import FINALES.Final_9_Agosto_2024_Comidas.ElemAB;

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
