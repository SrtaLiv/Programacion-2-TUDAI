package Parcial2022_Recuperatorio;

import java.util.ArrayList;

public class SeccionRestringida extends Seccion{
    ArrayList<String> categoriasPermitidas;
    public SeccionRestringida(String categoria) {
        super(categoria);
        this.categoriasPermitidas = new ArrayList<>();
    }

    public void addCategoria(String c){
        categoriasPermitidas.add(c);
    }

    public void addElemento(ElementoAB elem){
        if (!categoriasPermitidas.contains(elem.getCategoria())){
            super.addElemento(elem);
        }
    }

    public Seccion obtenerCopia(){
        return new Seccion(this.getCategoria());
    }


}
