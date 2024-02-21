package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

import java.util.ArrayList;

/**
 * The type Seccion restringida.
 */
public class SeccionRestringida extends Seccion{
    /**
     * The Categorias permitidas.
     */
    ArrayList<String> categoriasPermitidas;

    public SeccionRestringida(String categoria) {
        super(categoria);
        this.categoriasPermitidas = new ArrayList<>();
    }

    public void addCategoria(String c){
        categoriasPermitidas.add(c);
    }

    /**
     * Add elemento.
     *
     * @param elem the elem
     */
    public void addElemento(ElementoAB elem){
        if (!categoriasPermitidas.contains(elem.getCategoria())){
            super.addElemento(elem);
        }
    }

    /**
     * Obtener copia seccion.
     *
     * @return the seccion
     */
    public Seccion obtenerCopia(){
        SeccionRestringida copia = new SeccionRestringida(this.getCategoria());
        for (String cat : copia.getCategoriasPermitidas())
            copia.addCategoria(cat);
        return copia;
    }

    public ArrayList<String> getCategoriasPermitidas() {
        return categoriasPermitidas;
    }

    public void setCategoriasPermitidas(ArrayList<String> categoriasPermitidas) {
        this.categoriasPermitidas = categoriasPermitidas;
    }
}
