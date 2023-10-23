package Ej8_MisVideos;

public class FiltroTitulo extends Filtro {
    String titulo;

    public FiltroTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getTitulo().equalsIgnoreCase(titulo);
    }

}
