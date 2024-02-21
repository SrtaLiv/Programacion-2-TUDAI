package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

import EjerciciosTipoParcial.src.Recu2021Combo.Producto;
import EjerciciosTipoParcial.src.Recu2021Combo.ProductoAB;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The type Seccion.
 */
public class Seccion extends ElementoAB {
    /**
     * The Elementos.
     */
    ArrayList<ElementoAB> elementos;

    /**
     * Instantiates a new Seccion.
     *
     * @param categoria the categoria
     */
    public Seccion(String categoria) {
        this.elementos = new ArrayList<>();
    }

    /**
     * Add elemento.
     *
     * @param nuevo the nuevo
     */
    public void addElemento(ElementoAB nuevo){
        this.elementos.add(nuevo);
        Collections.sort(elementos);
    }

    /**
     * Gets palabras clave.
     *
     * @return the palabras clave
     */
    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> palabras = new ArrayList<>();
        for (ElementoAB elem : elementos){
            ArrayList<String> aux = elem.getPalabrasClave();
            for (String s: aux){
                if (!palabras.contains(s)){
                    palabras.add(s);
                }
            }
        }
        return palabras;
    }


    @Override
    public String getCategoria() {
        return super.categoria;
    }
    
    @Override
    public ElementoAB copiaRestringida(Filtro ff) {
        ArrayList<ElementoAB> elementosQueCumplen = new ArrayList<>();
        for (ElementoAB hijo : elementos) {
            ElementoAB copiaHijo = hijo.copiaRestringida(ff);
            if (copiaHijo!= null){
                elementosQueCumplen.add(copiaHijo);
            }
        }
        if (elementosQueCumplen.size() > 0) { //hijo duplicado debo retornar la seccion
            Seccion copia = obtenerCopia();
            for (ElementoAB copiaHijo : elementosQueCumplen)
                copia.addElemento(copiaHijo);
                return copia;
        } else //Ningun hijo fue dupicado, entonces reotrno null (no duplico)
            return null;
    }



    public Seccion obtenerCopia(){
        return new Seccion(this.getCategoria());
    }

    /**
     * Gets elementos.
     *
     * @return the elementos
     */
    public ArrayList<ElementoAB> getElementos() {
        return new ArrayList<>();
    }

    //:::::::::::::::PARA ESTUDIAR::::::::::
    @Override
    ArrayList<ElementoAB> buscar(Filtro ff) {
        ArrayList<ElementoAB> result = new ArrayList<>();
        for (ElementoAB elem : elementos){
            result.addAll(elem.buscar(ff));
        }
        return result;
    }

    //si me pide retornar la sNOTICIA (no seccion) de menor precio (lo agregue
    //recien..
    public Noticia noticiaMenorPrecio() {
        double menorPeso = Double.MAX_VALUE;
        Noticia noticiaMenor = null;
        for (ElementoAB elemento : elementos){
            Noticia noticiaMenorPrecioAux = elemento.noticiaMenorPrecio();
            double temp = noticiaMenorPrecioAux.getPrecio();
            if (noticiaMenor == null || temp < menorPeso){
                menorPeso = temp;
                noticiaMenor = noticiaMenorPrecioAux;
            }
        }
        return noticiaMenor;
    }

    @Override
    public String toString() {
        return "Seccion{" +
                "elementos=" + elementos +
                '}';
    }
}
