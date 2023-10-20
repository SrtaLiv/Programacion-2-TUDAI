package Parcial2023;

public class FiltroCantidadPalabras extends Filtro{
    int cantPalabra;

    public FiltroCantidadPalabras(int cantPalabra) {
        this.cantPalabra = cantPalabra;
    }

    @Override
    public boolean cumple(ContenidoEducativo cc) {
        return cc.getPalabrasClave().size() == cantPalabra;
    }
}
