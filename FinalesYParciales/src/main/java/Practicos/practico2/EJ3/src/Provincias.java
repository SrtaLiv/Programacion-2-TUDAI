package Practicos.practico2.EJ3.src;

import java.util.ArrayList;

public class Provincias {
    String nombre;
    private ArrayList<Ciudad> ciudades;
    ArrayList<String> ciudadesDeficit;
    ArrayList<Provincias> provincias;

    public Provincias(String nombre) {
        this.nombre = nombre;
        ciudades = new ArrayList<>();
        ciudadesDeficit = new ArrayList<>();
        provincias = new ArrayList<>();
    }

    public void agregarCiudad(ArrayList<Ciudad> ciudad) {
        this.ciudades.addAll(ciudad);
    }

    public void mostrarCiudades() {
        System.out.println("Ciudades de la provincia de " + nombre + ":");
        for (int i = 0; i < ciudades.size(); i++) {
            Ciudad cc = ciudades.get(i);
            System.out.println("-" + cc.getNombre());

            if (cc.ciudadDeficit()) {
                ciudadesDeficit.add(cc.getNombre());
            }
        }
        if (!ciudadesDeficit.isEmpty()) {
            System.out.print("Ciudades con deficit: ");
            ciudadesDeficit();
        }
    }
    public void ciudadesDeficit(){
        for (int i = 0; i < ciudadesDeficit.size(); i++) {
            System.out.print(ciudadesDeficit.get(i));
            if (i < ciudadesDeficit.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    //PROVINCIAS CON > DE LA MITAD DE CIUDADES CON DEFICIT
    //ARRAY DE CIUDADES ARRAY.SIZE/2 Y SI CONTADOR>AL ARRAY/2 MOSTRAR
    public void provinciasMitadDeficit(){

    }

}
