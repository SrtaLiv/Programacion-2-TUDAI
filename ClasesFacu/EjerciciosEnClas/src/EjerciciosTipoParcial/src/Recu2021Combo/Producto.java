package EjerciciosTipoParcial.src.Recu2021Combo;

import java.util.ArrayList;

public class Producto extends ProductoAB {
    ArrayList<String> categorias;
    double peso;
    double precio;

    public Producto(String nombre, String desc, double peso, double precio) {
        super(nombre, desc);
        this.categorias = new ArrayList<>();
        this.peso = peso;
        this.precio = precio;
    }

    public void agregarCategoria(String s){
        if (!categorias.contains(s)){
            categorias.add(s);
        }
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public ArrayList<String> getCategorias() {
        return new ArrayList<>(categorias);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantProducto(){
        return 1;
    }

    public ArrayList<ProductoAB> buscar(Filtro ff) {
        ArrayList<ProductoAB> resultado = new ArrayList<>();
        if (ff.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

    //Yo soy un producto, que tengo que devolver si me piden que me duplique?
    //new ProductoAB? No! es un 2. no puedo instanciar productoAbstracto
    public ProductoAB copia(Filtro ff) {
        if (ff.cumple(this)){
            Producto copia = new Producto(this.getNombre(), this.getDescripcion(), this.peso,
                    this.precio); //faltan las categorias!!
            for (String cat : categorias){
                copia.agregarCategoria(cat);
            }
            return copia;
        }
        return null; //Retorno null pq no tengo un producto vacio, no hay []
    }

    @Override
    public Producto productoMenorPeso() {
        return this;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "categorias=" + categorias +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }
}
