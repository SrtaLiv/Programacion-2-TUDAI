package FINALES.Final_9_Agosto_2024_Comidas;

import java.util.ArrayList;

public class MenuEspecial extends Menu{
    private Filtro ff;

    public MenuEspecial(String name, Filtro ff) {
        super(name);
        this.ff = ff;
    }

    /*public void addElemento1(ElemAB elemAB){
        if (this.ff.cumplen(elemAB)){
            elementos.add(elemAB); // si le pones PROTECTED a menu espeical
        }
    }*/

    public void addElemento(ElemAB elemAB) {
        // Aplicar el filtro antes de agregar el elemento
        if (ff.cumplen(elemAB)) {
            super.addElemento(elemAB);  // si usas el metodo heredado
        }
    }

}
