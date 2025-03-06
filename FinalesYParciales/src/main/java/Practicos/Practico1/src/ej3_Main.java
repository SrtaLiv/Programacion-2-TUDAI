package Practicos.Practico1.src;

public class ej3_Main {
    public static void main(String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico(3,4);

        p1.desplazar(1, 3);
        System.out.println("Nueva distancia" + p1.getX() + " , " + p1.getY());



    }


}
