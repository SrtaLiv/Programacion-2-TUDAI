package Practicos.practico5.Ej3_cooperativa;

import java.util.List;

public class Cereal {
    String granos;
    List<String> mineralesRequeridos;

    public Cereal(String granos, List<String> mineralesRequeridos) {
        this.granos = granos; //cosecha gruesa, fina y pasturas.
        this.mineralesRequeridos = mineralesRequeridos;
    }

    public String getGranos() {
        return granos;
    }


    public List<String> getMineralesRequeridos() {
        return mineralesRequeridos;
    }

}
