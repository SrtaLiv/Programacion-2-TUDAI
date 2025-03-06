package Practicos.Practico8.Ej3_Procesador_de_Texto;

public class EliminarPalabraPlugin implements Plugin {

    private String palabra;

    public EliminarPalabraPlugin(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public void ejecutar(String texto) {
        // Eliminar todas las ocurrencias de la palabra
        String textoEliminado = texto.replaceAll(palabra, "");

        // Imprimir el resultado
        System.out.println("Texto eliminado: " + textoEliminado);
    }

}
