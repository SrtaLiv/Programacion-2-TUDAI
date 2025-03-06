package Practicos.Practico6.Ej3_PuertoCereales;

import java.util.ArrayList;

public class PuertoCereal {

    //quien tiene que ordenar su capacidad?
    ArrayList<Barco> barcos = new ArrayList<>();
    ArrayList<Camion> camiones = new ArrayList<>();

    public void agregarBarco(Barco barco){
        System.out.println("Barco capacidad: " + barco.getCapacidad());
    }
    public void agregarCamion(Camion c){
        camiones.add(c);
    }

    public void ordenarBarco() {
        int n = barcos.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (barcos.get(j).getCapacidad() < barcos.get(j + 1).getCapacidad()) {
                    // Intercambia los barcos en la lista
                    Barco temp = barcos.get(j);
                    barcos.set(j, barcos.get(j + 1));
                    barcos.set(j + 1, temp);
                }
            }
        }
    }


    public void ordenarCamion() {
        int n = camiones.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (camiones.get(j).getFechaEntrada().compareTo(camiones.get(j + 1).getFechaEntrada()) > 0) {
                    // Intercambia los camiones en la lista
                    Camion temp = camiones.get(j);
                    camiones.set(j, camiones.get(j + 1));
                    camiones.set(j + 1, temp);
                }
            }
        }
    }

    public void mostrarBarcos(){
        for (int  i = 0; i < barcos.size() ; i++){
            System.out.println("Capacidad: " + barcos.get(i));
        }
    }

    public void descargarCamion(){
        for (int  i = 0; i < camiones.size() ; i++){
            System.out.println("Se ha descargado el camion de " + camiones.get(i).getCereal() + " llegado el " + camiones.get(i).getFechaEntrada());
        }
    }




}
