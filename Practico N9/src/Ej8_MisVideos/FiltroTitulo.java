package Ej8_MisVideos;

public class FiltroTitulo extends Filtro {
    String titulo;

    public FiltroTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(ElementoFV elem) {
        return elem.getTitulo().equalsIgnoreCase(titulo);
    }
}
