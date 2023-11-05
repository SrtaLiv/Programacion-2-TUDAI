package Recu2021Del;

public class FiltroTieneCategoria extends Filtro{
    private String catQueBusco;

    public FiltroTieneCategoria(String catQueBusco){
        this.catQueBusco = catQueBusco;
    }


    @Override
    public boolean cumple(ProductoAB elemento) {
        return elemento.tieneCategoria(catQueBusco);
    }
}
