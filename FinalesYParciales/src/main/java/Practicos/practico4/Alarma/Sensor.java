package Practicos.practico4.Alarma;

import java.util.ArrayList;
import java.util.List;

public class Sensor extends Alarma{
    private boolean zonaActivada;
    private String zona;

    public Sensor() {
        super();
        this.zonaActivada = false;
        this.zona = "Cocina";
    }


    public void activarSensores() {
        this.zonaActivada = true;
        this.zona = "zona";
        System.out.println("SENSOR PRENDIDO!!! :O");
    }

    public void agregarZonaDetectada(String zona){
        if (super.comprobarPeligro()){
            System.out.println("SE HA DETECTADO PELIGRO EN " + zona);
            activarSensores();
        }
    }

    /*
    public void encontrarZonaDetectada(String zonaDet) {
        for (int i = 0; i < 2; i++) {
            if (super.comprobarPeligro()) {
                activarSensores();
                System.out.println("SE HA ENCONTRADO ZONA DETECTADA!!" + zonaDet);
            }
            else System.out.println("NO SE ENCONTRO ZONA PELIGROSA");
        }
    }*/

    public String getZona() {
        return zona;
    }

    public boolean isZonaActivada() {
        return zonaActivada;
    }
}
