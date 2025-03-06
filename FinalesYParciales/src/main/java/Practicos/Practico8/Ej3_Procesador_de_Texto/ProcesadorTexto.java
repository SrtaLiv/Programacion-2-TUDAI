package Practicos.Practico8.Ej3_Procesador_de_Texto;

public class ProcesadorTexto{
    String texto;

    public ProcesadorTexto(String texto) {
        this.texto = texto;
    }

    public void ejecutarPlugin(Plugin p){
       p.ejecutar(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
