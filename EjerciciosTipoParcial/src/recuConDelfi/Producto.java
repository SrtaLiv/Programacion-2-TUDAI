package recuConDelfi;

import java.util.ArrayList;
import java.util.Comparator;

public class Producto extends ElementoBZ{
    ArrayList<String> categoria;
    double precio;
    double peso;

    public Producto(double precio, double peso) {
        this.peso = peso;
        this.precio = precio;
        categoria = new ArrayList<>();
    }


    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public int getCantElementos() {
        return 1;
    }

    @Override
    /**
     * Retorna una lista con un(1) elemento, si el archivo
     * cumple con la condición o una lista vacía en caso
     * contrario
     */
    public ArrayList<ElementoBZ> armarCombo(Filtro f) {
        return null;
    }

    @Override
    public ArrayList<String> categoria() {
        return new ArrayList<>(categoria);
    }

    public ArrayList<String> getCategoria() {
        return new ArrayList<String>(categoria);
    }

    public void addCategoria(String s){
        categoria.add(s);
    }
}
