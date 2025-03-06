package Practicos.practico2.EJ1.Series;

public class Series {
    //ATRIBUTOS
    String titulo;
    String descripcion;
    String creador;
    String genero;
    Episodio numero; //episodio 1

    public Series(String titulo){
        this.titulo = titulo;
    }
    public Series(String titulo, String descripcion, String creador, String genero, Episodio numero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
    }



    //RESPONSABILIDADES: CALIFICAR, CONTADOR DE EPISODIOS Y TEMPORADAS



}