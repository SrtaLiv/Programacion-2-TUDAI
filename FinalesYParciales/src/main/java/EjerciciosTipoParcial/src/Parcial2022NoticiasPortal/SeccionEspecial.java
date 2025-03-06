package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The type Seccion especial.
 */
public class SeccionEspecial extends NoticiaCompuesta{
    /**
     * The Categoria fija.
     */
    String categoriaFija;
    /**
     * The Cantidad.
     */
    int cantidad;

    /**
     * Instantiates a new Seccion especial.
     *
     * @param posicion      the posicion
     * @param categoriaFija the categoria fija
     * @param cantidad      the cantidad
     */
    public SeccionEspecial(int posicion, String categoriaFija, int cantidad) {
        super(posicion);
        this.categoriaFija = categoriaFija;
        this.cantidad = cantidad;
    }

    /**
     * Get categoria fija string.
     *
     * @return the string
     */
    public String getCategoriaFija(){
        return categoriaFija;
    }

    /**
     * Get palabras claves array list.
     *
     * @return the array list
     */
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
