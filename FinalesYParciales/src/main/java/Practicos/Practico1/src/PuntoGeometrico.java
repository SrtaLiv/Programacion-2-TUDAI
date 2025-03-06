package Practicos.Practico1.src;

public class PuntoGeometrico {
    //ATRIBUTOS
    private double x;
    private double y;
    private Rectangulo prop; //un objeto 1 a 1.

    //CONSTRUCTOR
    public PuntoGeometrico(){
        this.x = 0;
        this.y = 0;
    }

    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazar(double nuevaX, double nuevaY){
        this.x += nuevaX;
        this.y += nuevaY;

    }

    //necesito x1 y x2 - y1 y y2;
    public double calcularDistanciaEudraica(PuntoGeometrico otroPunto){;
        double distanciaX = x - otroPunto.getX();
        double distanciaY = y - otroPunto.getY();
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }


    //set y get
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }



}
