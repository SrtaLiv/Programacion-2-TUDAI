package Practicos.Practico8.Ej3_Procesador_de_Texto;

public class ContadorOcurrenciasPlugin implements Plugin {

    private String palabra;

    public ContadorOcurrenciasPlugin(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public void ejecutar(String texto) {
        // Contar la cantidad de veces que aparece la palabra
        int cantidadOcurrencias = texto.split(palabra).length - 1;

        // Imprimir el resultado
        System.out.println("Cantidad de ocurrencias de la palabra \"" + palabra + "\": " + cantidadOcurrencias);
    }

}

