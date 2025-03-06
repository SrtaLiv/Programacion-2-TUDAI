package FINALES.Final2024Feb;

import java.util.ArrayList;

public class Capitulo{

    int paginas;
    String tema;
    ArrayList<String> autores;

    public Capitulo(int paginas, String tema) {
        this.paginas = paginas;
        this.tema = tema;
        this.autores = new ArrayList<>();
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores);
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }
}