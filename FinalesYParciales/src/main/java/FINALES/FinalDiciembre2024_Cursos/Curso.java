package FINALES.FinalDiciembre2024_Cursos;

import java.util.ArrayList;

public class Curso extends ElemAB{
    private double precio;
    private ArrayList<String> docentes;
    private ArrayList<String> palabrasClaves;
    private int horasCatedra;

    public Curso(String nombre, double precio, int horasCatedra) {
        super(nombre);
        this.precio = precio;
        this.docentes = new ArrayList<>();
        this.palabrasClaves = new ArrayList<>();
        this.horasCatedra = horasCatedra;
    }

    @Override
    public double calcularPrecio() {
        return this.getPrecio();
    }

    public void addPalabraClaveSinRepetir(String palabra){
        if (!palabrasClaves.contains(palabra)){
            palabrasClaves.add(palabra);
        }
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClaves);
    }

    @Override
    public ArrayList<String> getDocentesACargo() {
        return new ArrayList<>(docentes);
    }

    @Override
    public int getCantHoras() {
        return this.horasCatedra;
    }

    @Override
    public int getCantCursos() {
        return 1;
    }

    @Override
    public ElemAB getCopia(Filtro ff) {
        if (ff.cumple(this)){
            Curso curso = new Curso(getNombre(), precio, horasCatedra);
            for (String pala : palabrasClaves){
                curso.addPalabraClaveSinRepetir(pala);
            }
            return curso;
        }
        return null;
    }

    @Override
    public Curso cursoMasCaro() {
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<String> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<String> getPalabrasClaves() {
        return palabrasClaves;
    }

    public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public int getHorasCatedra() {
        return horasCatedra;
    }

    public void setHorasCatedra(int horasCatedra) {
        this.horasCatedra = horasCatedra;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "precio=" + precio +
                ", docentes=" + docentes +
                ", palabrasClaves=" + palabrasClaves +
                ", horasCatedra=" + horasCatedra +
                '}';
    }
}
