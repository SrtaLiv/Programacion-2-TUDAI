package recuConDelfi;

import java.util.ArrayList;

public class Combo extends ElementoBZ{
    ArrayList<ElementoBZ> elementos;
    double descuento;
    public static final double DESCUENTO_MAX = 0.5;

    public Combo(double precio, double peso, double descuento) {
        this.elementos = new ArrayList<>();
        this.descuento = descuento;
    }

    @Override
    public double getPeso() {
        double peso = 0;
        for (int i = 0; i < elementos.size();i++){
            peso += elementos.get(i).getPeso();
        }
        return 0;
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (ElementoBZ elem : elementos) {
            precioTotal += elem.getPrecio();
        }

        for (ElementoBZ elem : elementos) {
            double descuentoProducto = this.descuento * elem.getPrecio();
            if (descuentoProducto > DESCUENTO_MAX * elem.getPrecio()) {
                descuentoProducto = DESCUENTO_MAX * elem.getPrecio();
            }
            precioTotal -= descuentoProducto;
        }

        return precioTotal;
    }

    @Override
    public int getCantElementos() {
        int cant = 0;
        for (int i = 0; i < elementos.size() ; i++){
            cant += elementos.get(i).getCantElementos();
        }
        return cant;
    }
/*
    @Override
    public ArrayList<ElementoBZ> armarCombo(Filtro f) {
        ArrayList<Producto> combos = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            ElementoBZ elemHijo = elementos.get(i);

            ArrayList<Producto> productos = elemHijo.armarCombo(f);

            if (f.cumple(elementos.get(i))){
                combos.add(elementos.get(i));
            }
        }
        return combos;
    }
*/
    /*

    public ArrayList<Archivo> buscar(Filtro condicion, Comparator<ElementoSA> orden){
        ArrayList<Archivo> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            ElementoSA elemHijo = elementos.get(i);

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
     */

    @Override
    public ArrayList<String> categoria() {
        ArrayList<String> cate = new ArrayList<>();
        for (ElementoBZ elem : elementos){
            ArrayList<String> aux = new ArrayList<>();
            aux.addAll(elem.categoria());
                for (String  auxP : aux){
                    if (!cate.contains(aux)){
                        cate.addAll(aux);
                }
            }
        }
        return cate;
    }

    public ArrayList<ElementoBZ> getElementos() {
        return new ArrayList<ElementoBZ>(elementos);
    }

    public double getDescuento() {
        return descuento;
    }
/*
    public Producto productoMenorPrecio(){
        Producto producto = null;
        double minPrecio = -1.0;

        for (Producto producto: productos){
            if (producto.getPrecio() < minPrecio) {
                minPrecio = pr
            }
        }
    }*/


}
