package Recu2021Del;

public class Main {
    public static void main(String[] args) {
        Filtro ff = new FiltroTieneCategoria("Ca");
        Combo uno = new Combo("Burguer1", "JIDAS", 0.5, 50, ff);
        Combo dos = new Combo("Burguer2", "JIDAS", 0.5, 50, ff);
        Combo tres = new Combo("Burguer3", "JIDAS", 0.5, 50, ff);
        Producto p1 = new Producto("B1", "muito rica", 1, 100);
        Producto p2 = new Producto("B1", "muito rica", 22, 100);
        Producto p3 = new Producto("B1", "muito rica", 333, 100);
        Producto p4 = new Producto("B1", "muito rica", 444, 100);

        p1.agregarCategoria("Ca");
        p2.agregarCategoria("Ca");
        p3.agregarCategoria("Ca");
        p4.agregarCategoria("Ca");


        uno.agregarElemento(dos);
        dos.agregarElemento(tres);
        tres.agregarElemento(p1);
        tres.agregarElemento(p2);
        tres.agregarElemento(p3);
        tres.agregarElemento(p4);
        System.out.println(uno.productoMenorPeso());
    }
}
