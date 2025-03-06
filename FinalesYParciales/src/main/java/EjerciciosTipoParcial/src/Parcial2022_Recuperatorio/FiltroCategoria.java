package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

public class FiltroCategoria extends Filtro {

    String categoria;

    public FiltroCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getCategoria().contains(categoria);
    }
}
