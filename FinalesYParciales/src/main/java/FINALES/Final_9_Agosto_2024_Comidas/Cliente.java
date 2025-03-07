package FINALES.Final_9_Agosto_2024_Comidas;

import java.awt.color.ColorSpace;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<ElemAB> comidas;
    private int caloriasMaximas;
    private ArrayList<Filtro> preferencias;

    /*
    El método contains() de la clase ArrayList utiliza el
     método equals() para comparar los elementos dentro de la lista,
     por lo que es importante asegurarse de que el método equals()
    esté correctamente implementado para que funcione como esperas.
     */
    public boolean leGusta(ElemAB elemAB) {
        // Primero, verificar si el cliente ya ha probado esta comida
        if (comidas.contains(elemAB)) {
            return false;  // Si ya la probó, no le gusta
        }

        // Verificar si la comida cumple con las preferencias del cliente
        for (Filtro ff : preferencias) {
            if (!ff.cumplen(elemAB)) {
                return false;  // Si alguna preferencia no se cumple, no le gusta
            }
        }

        return true;  // Si no la ha probado y cumple con las preferencias, le gusta
    }

}
