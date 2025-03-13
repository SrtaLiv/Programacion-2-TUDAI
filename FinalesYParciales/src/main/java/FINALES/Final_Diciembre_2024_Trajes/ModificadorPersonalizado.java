package FINALES.Final_Diciembre_2024_Trajes;

public class ModificadorPersonalizado extends Modificador{
    private String material;

    public ModificadorPersonalizado(String material) {
        this.material = material;
    }

    @Override
    public TrajeAB modificar(Traje elem) {
        elem.addMetal(material);
        return elem;
    }
}
