package Ej4_CandyCrush;

public class Ficha {
    String nombreFicha;
    int fortaleza; //Golpes necesarios
    int espacioTablero; //cantidad de casilleros
    int poderDestruccion; //ej chocolate

    //ej: chocolate, fortaleza 1, 1 casillero


    public Ficha(String nombreFicha, int fortaleza, int espacioTablero,
                 int poderDestruccion) {
        this.nombreFicha = nombreFicha;
        this.fortaleza = fortaleza;
        this.espacioTablero = espacioTablero;
        this.poderDestruccion = poderDestruccion;
    }

    public String getNombreFicha() {
        return nombreFicha;
    }

    public void setNombreFicha(String nombreFicha) {
        this.nombreFicha = nombreFicha;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getEspacioTablero() {
        return espacioTablero;
    }

    public void setEspacioTablero(int espacioTablero) {
        this.espacioTablero = espacioTablero;
    }

    public int getPoderDestruccion() {
        return poderDestruccion;
    }

    public void setPoderDestruccion(int poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }

    public String toString(){
        return  "|| NOMBRE: " + nombreFicha + " | FORTALEZA: " + fortaleza + " | ESPACIO: " + espacioTablero +
                " | PODER DESTRUCCION:" + poderDestruccion + " ||";
    }
}
