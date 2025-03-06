package CLASES.Abstractas.EjComputos;

import java.util.ArrayList;

public class ListaOrdenada {

    private ArrayList<ObjetoComparable> elementos;

    public ListaOrdenada() {
        elementos = new ArrayList();
    }

    public ObjetoComparable getSiguienteElemento(){
        if (elementos.isEmpty())
            return null;
        return elementos.remove(0);
    }

    public boolean tieneElementos(){
        return !elementos.isEmpty();
    }

    public void agregarElemento(ObjetoComparable elemento) {
        //guardar Ordenado
        boolean encontro = false;
        int i = 0;
        while (!encontro && i< elementos.size()) {
            if (elemento.esMenor(elementos.get(i)))
                i++;
            else
                encontro = true;
        }
        if (encontro)
            elementos.add(i,elemento);
        else
            elementos.add(elemento);
    }
}
