package EjerciciosTipoParcial.src.Prefi2023;

import java.util.ArrayList;
import java.util.Objects;

public class Objeto extends ObjetoAB implements Comparable<Objeto>{
    String marca;
    int anio;
    double valor;
    int peso;

    public Objeto(String nombre, String marca, int anio, double valor, int peso) {
        super(nombre);
        this.marca = marca;
        this.anio = anio;
        this.valor = valor;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int getAnio() {
        return this.anio;
    }

    @Override
    public double getValorEstimado() {
        return this.valor;
    }

    @Override
    public int getPeso() {
        return this.peso;
    }

    @Override
    public ArrayList<Objeto> cumple(Filtro ff) {
        ArrayList<Objeto> objetos = new ArrayList<>();
        if (ff.cumple(this))
            objetos.add(this);
        return objetos;
    }

    @Override
    public boolean pertenece(Objeto obj) {
        return this.equals(obj);
    }


    public boolean equals(Objeto obj){
        return this.getNombre().equals(obj.getNombre()) &&
                this.getMarca().equals(obj.getMarca()) &&
                this.getAnio() == obj.getAnio() &&
                this.getPeso() == obj.getPeso();
    }

    @Override
    public int compareTo(Objeto o) {
        int dif = this.getMarca().compareTo(o.getMarca());
        if (dif == 0){
            return this.getNombre().compareTo(o.getNombre());
        }
        return dif;
    }



    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
