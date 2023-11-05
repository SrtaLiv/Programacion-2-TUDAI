package Parcial2022NoticiasPortal;

import java.util.ArrayList;
import java.util.Collections;

public class SeccionEspecial extends NoticiaCompuesta{
    String categoriaFija;
    int cantidad;

    public SeccionEspecial(int posicion, String categoriaFija, int cantidad) {
        super(posicion);
        this.categoriaFija = categoriaFija;
        this.cantidad = cantidad;
    }

    public String getCategoriaFija(){
        return categoriaFija;
    }
    public ArrayList<String> getPalabrasClaves(){
        ArrayList<String> aux = super.getPalabrasClave();
        Collections.sort(aux);
        ArrayList<String> result = new ArrayList<String>();
        for (int i=0; (i<aux.size() && (i<cantidad)); i++){
            result.add(aux.get(i));
        }
        return result;
    }
}
