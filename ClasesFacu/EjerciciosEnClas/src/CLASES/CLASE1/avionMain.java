package CLASES.CLASE1;

public class avionMain {
    public static void main(String[] args) {
        Avion air314 = new Avion();
        System.out.println(air314.getColor());
        air314.setColor("rojo");
        System.out.println(air314.getColor());
    }

}
