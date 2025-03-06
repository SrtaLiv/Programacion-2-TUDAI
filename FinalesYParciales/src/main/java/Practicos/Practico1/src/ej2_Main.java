package Practicos.Practico1.src;

public class ej2_Main {
    public static void main(String[] args) {
        Electrodomestico electrodomestico1 = new Electrodomestico();
        Electrodomestico electrodomestico2 = new Electrodomestico("Lavadora", 30.0, "blanco", 15.0, 10.0);

        System.out.println("Electrodoméstico 1: " + electrodomestico1.esBajoConsumo());
        System.out.println("Electrodoméstico 2: " + electrodomestico2.esAltaGama());

        // Ejemplo de uso de métodos get y set
        Electrodomestico electrodomestico3 = new Electrodomestico();
        electrodomestico3.setNombre("Nevera");
        String nombreElectrodomestico = electrodomestico3.getNombre();
        System.out.println("Nombre del electrodoméstico: " + nombreElectrodomestico);

    }
}
