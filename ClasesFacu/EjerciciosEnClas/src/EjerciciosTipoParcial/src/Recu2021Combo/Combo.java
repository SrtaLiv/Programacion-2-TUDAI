package EjerciciosTipoParcial.src.Recu2021Combo;

import java.util.ArrayList;

public class Combo extends ProductoAB {
    ArrayList<ProductoAB> elementos;
    double porcentajeDtoPorProducto; //el 1,4
    double porcentajeTopeDto; //el 0,5
    Filtro ff; //La condicion es algo propio del combo, no del producto.
    //Las categorias del combo no son propias, son del producto.

    public Combo(String nombre, String descripcion,
                 double porcentajeDtoPorProducto, double porcentajeTopeDto, Filtro ff) {
        super(nombre, descripcion);
        this.elementos = new ArrayList<>();
        this.porcentajeDtoPorProducto = porcentajeDtoPorProducto; //set
        this.porcentajeTopeDto = porcentajeTopeDto; //set
        this.ff = ff; //set
    }

    /*
        El precio queda determinado por la suma de sus componentes. Es decir que el precio
        no es un atributo del combo. Por lo tanto, no debo abstraerlo de PRODUCTOAB
        Las categorias de un combo, la union de todas las dccategorias del producto. Tampoco
        es un atributo del combo! es del producto
         */
    public void agregarElemento(ProductoAB elemento){
        if (ff.cumple(elemento)){
            elementos.add(elemento);
        }
    }

    public double precioSinDescuento(){
        double precio = 0.0;
        for (ProductoAB elemento : elementos){
            precio += elemento.getPrecio();
        }
        return precio;
    }


    public double getPrecio(){
        double precio = precioSinDescuento();
        double descuento = porcentajeDtoPorProducto * getCantProducto();
        if (descuento > this.porcentajeTopeDto)
            descuento = porcentajeTopeDto;
        return precio - descuento * precio;
    }


    public double getPeso(){
        double peso = 0.0;
        for (int i = 0; i < elementos.size(); i++){
            peso += elementos.get(i).getPeso();
        }
        return peso;
    }

    public ArrayList<String> getCategorias() {
        ArrayList<String> categorias = new ArrayList<>();
        for (ProductoAB elem : elementos){
            ArrayList<String> catElem = elem.getCategorias();
            for (String cat : catElem){
                if (!categorias.contains(cat))
                    categorias.add(cat);
            }
        }
        return categorias;
    }

    public int getCantProducto(){
        int suma = 0;
        if (elementos.size() > 0) {
            for (ProductoAB elemento : elementos) {
                suma += elemento.getCantProducto();
            }
        }
        return suma;
    }

    //si el combo cumple retorno el combo, si no cumplia el combo
    //Debia buscar si sus hijos si cumplian y retornarlo
    @Override
    public ArrayList<ProductoAB> buscar(Filtro ff) {
        ArrayList<ProductoAB> resultado = new ArrayList<>();
        if (ff.cumple(this)){ //si cumplo me agrego yo
            resultado.add(this);
        } else //sino busco en mis hijos
        for (ProductoAB elemento : elementos){
            resultado.addAll(elemento.buscar(ff));
            //Cada hijo busca los elementos q cumplan con la condicion
            //devuelve una lista y la agrego toda a lista resultado
        }
        return resultado;
    }

    @Override
    public ProductoAB copia(Filtro ff) {
        if (ff.cumple(this)){ //Si yo combo cumplo, me fijo en mis hijos
            ArrayList<ProductoAB> hijosQueCumplen = new ArrayList<>();
            for (ProductoAB elemento : elementos){
                ProductoAB copia = elemento.copia(ff); //Copia de cada elemento
                if (copia!=null)
                    hijosQueCumplen.add(copia);
            }
            if (hijosQueCumplen.isEmpty()) //Si ningun hijo cumple
                return null;
            else {
                Combo copiaCombo = new Combo(this.getNombre(), this.getDescripcion(),
                        porcentajeDtoPorProducto, porcentajeTopeDto, ff);
                for (ProductoAB elem : hijosQueCumplen){
                    copiaCombo.agregarElemento(elem);
                }
                return copiaCombo;
            }

        }
        return null;
    }

    @Override
    public Producto productoMenorPeso() {
        double menorPeso = Double.MAX_VALUE;
        Producto productoMenorPeso = null;
        for (ProductoAB elemento : elementos){
            Producto productoMenorPesoAux = elemento.productoMenorPeso();
            double temp = productoMenorPesoAux.getPeso();
            if (productoMenorPeso == null || temp < menorPeso){
                menorPeso = temp;
                productoMenorPeso = productoMenorPesoAux;
            }
        }
        return productoMenorPeso;
    }

    @Override
    public String toString() {
        return "Combo{" +
                "elementos=" + elementos +
                ", porcentajeDtoPorProducto=" + porcentajeDtoPorProducto +
                ", porcentajeTopeDto=" + porcentajeTopeDto +
                ", ff=" + ff +
                '}';
    }
}
