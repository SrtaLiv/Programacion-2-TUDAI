package CLASES.Abstractas.Empresa;

public class Muebles extends Elemento {
    String material;

    public Muebles(String nombre, int anioFabricacion, String material) {
        super(nombre, anioFabricacion);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


}
