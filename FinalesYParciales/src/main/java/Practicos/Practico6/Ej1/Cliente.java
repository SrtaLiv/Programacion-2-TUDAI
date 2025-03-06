package Practicos.Practico6.Ej1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Item> itemsAlquilados;


    public Cliente(String nombre) {
        this.nombre = nombre;;
        this.itemsAlquilados = new ArrayList<>();
    }

    public void alquilarItem(Item item, LocalDate fechaDevolucion) {
        item.alquilar(fechaDevolucion);
        itemsAlquilados.add(item);

    }

    public void devolverItem(Item item) {
        item.devolver();
        itemsAlquilados.remove(item);

    }

    public List<Item> getItemsVencidos(LocalDate fechaActual) {
        List<Item> itemsVencidos = new ArrayList<>();
        for (Item item : itemsAlquilados) {
            if (item.estaVencido(fechaActual))
                itemsVencidos.add(item);
        }
        return itemsVencidos;
    }
}
