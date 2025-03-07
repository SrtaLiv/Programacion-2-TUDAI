package FINALES.Final_9_Agosto_2024_Comidas;

import java.util.ArrayList;

public class FiltroIngredientes extends Filtro{

    private String ingredienteProhibido;

    @Override
    public boolean cumplen(ElemAB elemAB) {
        ArrayList<String> ingredientes = elemAB.getIngredientes();
        for (String elem : ingredientes){
            if (elem.contains(this.ingredienteProhibido)){
                return false;
            }
        }
        return true;
    }
}
