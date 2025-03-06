package Clases.CLASE12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Carpeta extends ElementoSA{
    private ArrayList<ElementoSA> elementos;

    public Carpeta(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoSA nuevo){
        if (nuevo.getContenedor()!=null) {
            nuevo.getContenedor().eliminar(nuevo);
        }
        elementos.add(nuevo);
        nuevo.setContenedor(this);
    }

    private void eliminar(ElementoSA nuevo) {
        this.elementos.remove(nuevo);
    }

    public double getTamanio(){
        double tamTotal = 0.0;
        for (int i = 0; i < elementos.size(); i++) {
            tamTotal += elementos.get(i).getTamanio();
        }
        return tamTotal;
    }

    public int cantElementos(){
        int cant = super.cantElementos();
        for (int i = 0; i < elementos.size(); i++) {
            ElementoSA elemHijo = elementos.get(i);
            cant += elemHijo.cantElementos();
        }
        return cant;
    }

    public ArrayList<Archivo> buscar(Filtro condicion, Comparator<ElementoSA> orden){
        ArrayList<Archivo> resultado = new ArrayList<>();
        for (ElementoSA elemHijo : elementos) {
            //ArrayList<Archivo> resultadoParcial = elemHijo.buscar(condicion);
            //resultado.addAll(resultadoParcial);

            resultado.addAll(elemHijo.buscar(condicion, orden));

            //Si me piden que no haya repetidos
            //ArrayList<Archivo> resultadoParcial = elemHijo.buscar(condicion);
            //for (int j=0; j<resultadoParcial.size();j++)
            //    if (!resultado.contains(resultadoParcial.get(j)))
            //        resultado.add(resultadoParcial.get(j));

        }
        if (orden!=null)
            Collections.sort(resultado, orden);
        else
            Collections.sort(resultado);
        return resultado;
    }

    public void imprimirContenido(String tab){
        super.imprimirContenido(tab);
        for (ElementoSA hijo:elementos)
            hijo.imprimirContenido(tab+"-");
    }

    public Carpeta copia(){
        Carpeta copiaCarpeta = crearCopiaBasica();
        for (int i = 0; i < elementos.size(); i++) {
            ElementoSA hijo = elementos.get(i);
            copiaCarpeta.addElemento(hijo.copia());
        }
        return copiaCarpeta;
    }

    public Carpeta copia(Filtro cond){
        Carpeta copiaCarpeta = crearCopiaBasica();
        for (ElementoSA hijo : elementos) {
            ElementoSA copiaHijo = hijo.copia(cond);
            if (copiaHijo != null)
                copiaCarpeta.addElemento(copiaHijo);
        }
        if (copiaCarpeta.cantElementos()==0)
            return null;
        else
            return copiaCarpeta;
    }

    protected Carpeta crearCopiaBasica() {
        return new Carpeta(this.getNombre());
    }

}
