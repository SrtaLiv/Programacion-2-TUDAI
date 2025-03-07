package FINALES.Final_9_Agosto_2024_Comidas;

import java.util.ArrayList;

public class Menu extends ElemAB {
    private ArrayList<ElemAB> elementos;
    private double descuento = 0.10;

    public Menu(String name) {
        super(name);
        this.elementos = new ArrayList<>();
    }

    public ArrayList<ElemAB> getElementos() {
        return new ArrayList<>(elementos);
    }

    public void setElementos(ArrayList<ElemAB> elementos) {
        this.elementos = elementos;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public ArrayList<ElemAB> buscar(Filtro ff) {
        ArrayList<ElemAB> elems = new ArrayList<>();
        for (ElemAB elemAB : elementos){
            elems.addAll(elemAB.buscar(ff));
        }
        return elems;
    }

    public void addElemento(ElemAB elemAB){
        elementos.add(elemAB);
    }

    @Override // mayor de los tiempos
    public int getTiempoPreparacion() {
        int tiempo = 0;
        for (ElemAB elem : elementos){
            if (elem.getTiempoPreparacion() > tiempo){
                tiempo = elem.getTiempoPreparacion();
            }
        }
        return tiempo;
    }

    @Override
    public int getCalorias() {
        int calorias = 0;
        for (ElemAB elem : elementos){
            calorias += elem.getCalorias();
        }
        return calorias;
    }

    @Override
    public ArrayList<String> getIngredientes() {
        ArrayList<String> result = new ArrayList<>();
        for (ElemAB elemAB : elementos){
            ArrayList<String> aux = new ArrayList<>(elemAB.getIngredientes());
            for (String palabra : aux){
                if (!result.contains(palabra)){
                    result.add(palabra);
                }
            }
        }
        return result;
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for (ElemAB elem : elementos){
            precio += elem.getPrecio();
        }
        return precio - (precio * descuento);
    }
}
