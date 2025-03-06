package Practicos.Practico1.src;

public class Electrodomestico {
    // Atributos
    private String nombre;
    private double precioBase;
    private String color;
    private double consumoEnergetico;
    private double peso;

    // Valores por defecto
    private static final String COLOR_DEFECTO = "gris plata";
    private static final double CONSUMO_DEFECTO = 10.0;
    private static final double PRECIO_DEFECTO = 100.0;
    private static final double PESO_DEFECTO = 2.0;

    // Constructores
    public Electrodomestico() {
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_DEFECTO;
        this.precioBase = PRECIO_DEFECTO;
        this.peso = PESO_DEFECTO;
    }

    public Electrodomestico(String nombre, double precioBase, String color, double consumoEnergetico, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(double consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para comprobar si el electrodoméstico es de bajo consumo
    public boolean esBajoConsumo() {
        return consumoEnergetico < 45.0;
    }

    // Método para calcular el balance
    public double calcularBalance() {
        if (peso != 0) {
            return precioBase / peso;
        }
        return 0.0;
    }

    // Método para indicar si el producto es de alta gama
    public boolean esAltaGama() {
        return calcularBalance() > 3.0;
    }

}
