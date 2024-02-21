package Ej2_Busqueda;

import java.util.ArrayList;

public class Documento {
    String titulo;
    ArrayList<String> autores;
    String contenido;
    ArrayList<String> palabrasClave;

    public Documento(String titulo,
                     String contenido, ArrayList<String> palabrasClave) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.contenido = contenido;
        this.palabrasClave = new ArrayList<>();
    }
}
