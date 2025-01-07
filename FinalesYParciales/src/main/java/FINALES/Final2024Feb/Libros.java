package FINALES.Final2024Feb;

public class Libro{
    /*
     * LIBRO
     * titulo
     * anioPublicacion
     * editor a cargo
     */


    String titulo;
    int anio;
    String editor;
    ArrayList<Capitulo> elementos;

    public Libro(String titulo, int anio, String editor){
        this.titulo = titulo;
        this.anio = anio;
        this.editor = editor;
        this.elementos = new ArrayList<>();
    }

    public ArrayList<Capitulo> getArray(){
        return new ArrayList<Capitulo>()
    }




}