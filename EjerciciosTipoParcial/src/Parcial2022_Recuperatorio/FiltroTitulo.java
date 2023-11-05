package Parcial2022_Recuperatorio;

public class FiltroTitulo extends Filtro{
    String titulo;

    public FiltroTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().contains(titulo);
    }
}
