package Parcial2023;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FiltroPalabras extends Filtro{
    ArrayList<String> palabrasClave;
    //array o string?

    public FiltroPalabras(ArrayList<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    @Override
    public boolean cumple(ContenidoEducativo cc) {
        return false;
    }
}
