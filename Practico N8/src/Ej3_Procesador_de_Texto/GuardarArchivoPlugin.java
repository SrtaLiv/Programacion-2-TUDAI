package Ej3_Procesador_de_Texto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GuardarArchivoPlugin implements Plugin {

    private String path;

    public GuardarArchivoPlugin(String path) {
        this.path = path;
    }

    @Override
    public void ejecutar(String texto) {
        // Guardar el texto en un archivo
        try {
            Files.write(Paths.get(path), texto.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

