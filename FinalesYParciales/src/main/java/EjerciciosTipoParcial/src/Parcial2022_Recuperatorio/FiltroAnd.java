package EjerciciosTipoParcial.src.Parcial2022_Recuperatorio;

public class FiltroAnd extends Filtro{
    Filtro f1, f2;
    @Override
    public boolean cumple(Noticia noticia) {
        return f1.cumple(noticia) && f2.cumple(noticia);
    }
}
