package EjerciciosTipoParcial.src.Parcial2022NoticiasPortal;

import java.util.ArrayList;

/**
 * The type Noticia compuesta.
 */
public class NoticiaCompuesta extends ElementoAB{
    private ArrayList<ElementoAB> elementos;
    private int posicion;
    private static String defecto;
    private ArrayList<Clasificador> clasif;

    /**
     * Instantiates a new Noticia compuesta.
     *
     * @param posicion the posicion
     */
    public NoticiaCompuesta(int posicion) {
        this.elementos = new ArrayList<>();
        this.posicion = posicion;
        this.clasif = new ArrayList<>();
    }

    /**
     * Clasificar noticia.
     *
     * @param noticia the noticia
     */
    public void clasificarNoticia(NoticiaSimple noticia){
        for (int i = 0; i<clasif.size();i++){
            clasif.get(i).clasificar(noticia);
        }
    }

    /**
     * Gets palabras clave.
     *
     * @return the palabras clave
     */
    @Override
    /* la unión de todas las palabras claves
     de los elementos que contiene, sin incluir
     palabras repetidas */
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (int i = 0 ; i < elementos.size() ; i++){
            ArrayList<String> aux = elementos.get(i).getPalabrasClave();
            for (int j = 0; j < aux.size() ; j++ ){
                if (!resultado.contains(aux.get(i))){
                    resultado.add(aux.get(i));
                }
            }
        }
        return resultado;
    }


    /**
     * Gets categoria.
     *
     * @return the categoria
     */
    @Override
    public String getCategoria() {
        if (posicion < elementos.size()){
            return elementos.get(posicion).getCategoria();
        }
        return defecto;
    }

    /**
     * Buscar array list.
     *
     * @param ff the ff
     * @return the array list
     */
    @Override
    public ArrayList<NoticiaSimple> buscar(Filtro ff) {
        ArrayList<NoticiaSimple> salida = new ArrayList<NoticiaSimple>();
        for (ElementoAB elemento : elementos) {
            salida.addAll(elemento.buscar(ff));
        }
        return salida;
    }
}
