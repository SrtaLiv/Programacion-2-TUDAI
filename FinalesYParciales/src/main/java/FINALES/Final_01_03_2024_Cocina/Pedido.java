package FINALES.Final_01_03_2024_Cocina;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Pedido {
    private ArrayList<ElemAB> elementos;
 /*   private ArrayList<String> clientes;
    private int nroMesa;
    private String mozo;

    public Pedido(int nroMesa, String mozo) {
        this.elementos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.nroMesa = nroMesa;
        this.mozo = mozo;
    }*/

    public void registrarElemento(ElemAB elem) {
        elementos.add(elem);
    }

    public ArrayList<ElemAB> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<ElemAB> elementos) {
        this.elementos = elementos;
    }
}
