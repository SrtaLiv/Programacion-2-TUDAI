package Parcial2022_Recuperatorio;

import java.util.ArrayList;
import java.util.Collections;

public class Seccion extends ElementoAB {
    ArrayList<ElementoAB> elementos;

    public Seccion(String categoria) {
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoAB nuevo){
        this.elementos.add(nuevo);
        Collections.sort(elementos);
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> palabras = new ArrayList<>();
        for (ElementoAB elem : elementos){
            ArrayList<String> aux = new ArrayList<>();
            aux.addAll(elem.getPalabrasClave());
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
            Seccion copia = new Seccion(this.getCategoria());
            for (ElementoAB copiaHijo : elementosQueCumplen)
                copia.addElemento(copiaHijo);
                return copia;
        } else //Ningun hijo fue dupicado, entonces reotrno null (no duplico)
            return null;
    }


    public ArrayList<ElementoAB> getElementos() {
        return new ArrayList<>(elementos);
    }
}
