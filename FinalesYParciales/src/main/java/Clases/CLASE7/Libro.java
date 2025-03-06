package Clases.CLASE7;


public class Libro extends Producto{
    int cantPaginas;
    String resumen;

    public Libro(String nombre, String autor, int precio, int cantPaginas, String resumen) {
        super(nombre, autor, precio);
        this.cantPaginas = cantPaginas;
        this.resumen = resumen;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
