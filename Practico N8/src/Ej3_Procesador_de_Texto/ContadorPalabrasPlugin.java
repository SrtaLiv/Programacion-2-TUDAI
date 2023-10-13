package Ej3_Procesador_de_Texto;

public class ContadorPalabrasPlugin implements Plugin {

   /* @Override
    public void ejecutar(String procesadorDeTexto) {
        String[] palabras = procesadorDeTexto.getTexto().split(" ");
        procesadorDeTexto.setTexto(String.valueOf(palabras.length));
    }*/


        @Override
        public void ejecutar(String texto) {
            // Contar las palabras en el texto
            int cantidadPalabras = texto.split(" ").length;

            // Guardar el resultado
            System.out.println("Cantidad de palabras: " + cantidadPalabras);
        }

    }
