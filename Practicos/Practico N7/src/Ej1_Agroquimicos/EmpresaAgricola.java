package Ej1_Agroquimicos;

import java.util.ArrayList;

public class EmpresaAgricola {
    String nombre;
    ArrayList<Producto> productosQuimicos;

    public EmpresaAgricola(String nombre) {
        this.nombre = nombre;
        this.productosQuimicos = new ArrayList<>();
    }

    public void listadoProductos(Enfermedad enfermedad){
        ArrayList<Producto> productosHabilitadosaCurar = new ArrayList<>();
        for (Producto productoQuimico : productosQuimicos) {
            if (productoQuimico.esTratable(enfermedad)){
                productosHabilitadosaCurar.add(productoQuimico);
            }
        }
        for (Producto p : productosHabilitadosaCurar){
            System.out.println(p.toString());
        }
    }

    public void listadoProductosNoDesaconsejado(Enfermedad e, Cultivo c){
        ArrayList<Producto> productosAconsejados = new ArrayList<>();
        for (Producto p : productosQuimicos){
            if (p.esTratable(e,c) == true){
                productosAconsejados.add(p);
            }
        }
        for (Producto p : productosAconsejados){
            System.out.println(p.toString());
        }
    }

    public void agregarProductosQuimicos(Producto p){
        this.productosQuimicos.add(p);
    }
}
