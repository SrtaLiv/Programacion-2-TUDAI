package Ej8_MisVideos;

import java.util.Comparator;

public class ComparadorUsuario implements Comparator<Usuario> {

    @Override
    public int compare(Usuario o1, Usuario o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
