package Ej3_cooperativa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lote {
    private double superficie;
    private String ubicacion;
    private Map<String, Double> composicionMineral;

    public Lote(double superficie, String ubicacion, Map<String, Double> composicionMineral) {
        this.superficie = superficie;
        this.ubicacion = ubicacion;
        this.composicionMineral = composicionMineral;
    }

    public double getSuperficie() {
        return superficie;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Map<String, Double> getComposicionMineral() {
        return composicionMineral;
    }

}