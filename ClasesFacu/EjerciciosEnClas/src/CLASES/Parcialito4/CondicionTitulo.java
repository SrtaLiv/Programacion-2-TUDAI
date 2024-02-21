package CLASES.Parcialito4;

public class CondicionTitulo extends Condicion{
    String titulo;

    public CondicionTitulo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return peli.getTitulo().toLowerCase().contains(this.titulo) ;
    }

}
