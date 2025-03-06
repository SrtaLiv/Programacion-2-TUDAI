package Practicos.Practico9.Ej8_MisVideos;

public class FiltroAutor extends Filtro {

    Usuario user;

    public FiltroAutor(Usuario user) {
        this.user = user;
    }

    @Override
    public boolean cumple(Video elem) {
        return elem.getUser().equals(user);
    }
}
