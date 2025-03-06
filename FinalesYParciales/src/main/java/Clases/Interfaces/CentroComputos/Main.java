package CLASES.Interfaces.CentroComputos;

public class Main {
    public static void main(String[] args) {
        CentroComputos centro = new CentroComputos();

        //Items Ordenables: (dispositivo) computadora - procesos
        Computadora compu1 = new Computadora(121, "PC1");
        Computadora compu2 = new Computadora(3333, "PC2");
        Computadora compu3 = new Computadora(33, "PC2");
        Computadora compu4 = new Computadora(31233, "PqweC2");

        //PODEMOS COMPARAR A TRAVES DE LA INTERFAZ ESMAYOR(). Solo para ITEMS ORDENABLES.
        boolean comparar = compu2.esMayor(compu3);
        System.out.println(comparar);

        //Si agregamos la ColaEspera podemos comparar todos los procesos o computadoras
        ColaEspera colaProcesos = new ColaEspera();
        Proceso pro1 = new Proceso(100, "Eliminando Lol");
        Proceso pro2 = new Proceso(10, "Agregando Vida");
        Proceso pro3 = new Proceso(1000, "Agregar a favoritos");

        boolean comp2 = pro2.esMayor(pro1);
        System.out.println(comp2);

        //Dispositivo: impresora
        Impresora imp1 = new Impresora("SAMSUNG", 23);
        Dispositivo imp2 = new Impresora("XIAOMI", 23);
        Dispositivo imp3 = new Impresora("XIAP3", 20);

        //Solo agrego items ordenables (procesos y computadoras)
        //ITEMS EN COLA
        ColaEspera cola = new ColaEspera(); //Solo tiene itemsOrdenables
        cola.addItem(compu1);
        cola.addItem(compu2);
        cola.addItem(compu3);

        //no entiendo la funcion de la cola de espera!


        //El centro permite agregar procesos y computadoras
        centro.addComputadora(compu1);
        centro.addComputadora(compu2);
        centro.addComputadora(compu3);
        centro.addComputadora(compu4);




    }


}
