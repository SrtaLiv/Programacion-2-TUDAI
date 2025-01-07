package FINALES.Final2022;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GastoDetallado gastoR = new GastoDetallado();
        Gasto gasto = new Gasto("A", "Chau", LocalDate.now(), 2);
        gasto.addPalabraClave("Hola");
        gasto.addPalabraClave("aaa");
        gasto.addPalabraClave("Chau");

        Gasto gasto2 = new Gasto("A", "Chau", LocalDate.now(), 2);
        gasto.addPalabraClave("Hola");
        gasto.addPalabraClave("aaa");
        gasto.addPalabraClave("Chau");


        gastoR.addElemento(gasto);
        gastoR.addElemento(gasto2);

        System.out.println(gastoR.getPalabras());
    }
}
