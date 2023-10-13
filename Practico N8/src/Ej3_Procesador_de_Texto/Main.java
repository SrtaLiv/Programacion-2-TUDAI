package Ej3_Procesador_de_Texto;

public class Main {
    public static void main(String[] args) {
        ProcesadorTexto p = new ProcesadorTexto("Hola como estas ");
/*        Plugin eliminar = new EliminarPalabraPlugin();
        Plugin contarOcu = new ContadorOcurrenciasPlugin();
        Plugin reemplazo = new ReemplazoTextoPlugin();
        Plugin guardar = new GuardarArchivoPlugin();*/

        // Ejecuta el plugin ContadorPalabrasPlugin
        p.ejecutarPlugin(new ContadorPalabrasPlugin());
        System.out.println("El número de palabras es: " + p.getTexto());

        p.ejecutarPlugin(new ContadorOcurrenciasPlugin("Hola"));

        p.ejecutarPlugin(new EliminarPalabraPlugin("como"));

        p.ejecutarPlugin(new GuardarArchivoPlugin("aaaa"));

    }
}
