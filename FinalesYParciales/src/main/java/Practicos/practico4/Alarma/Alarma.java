package Practicos.practico4.Alarma;

public class Alarma {
    //mi alarma tiene 3 variables
    private boolean vidrioRoto;
    private boolean puertaVentanaAbierta;
    private boolean movimientoDomicilio;
    private Timbre timbre;
    public Alarma() {
        this.vidrioRoto = false; //POR DEFECTO
        this.puertaVentanaAbierta = false;
        this.movimientoDomicilio = false;
        this.timbre = new Timbre();
    }

    public boolean comprobarPeligro(){
        return vidrioRoto || puertaVentanaAbierta || movimientoDomicilio;
    }
    public void activarAlarma(){
        if (comprobarPeligro()){
            timbre.hacerSonar();
            System.out.println("SE HA DETECTADO PELIGRO EN ");
        }
        else System.out.println("NO HAY NINGUN PELIGRO");

    }

    public boolean isVidrioRoto() {
        return vidrioRoto;
    }

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public boolean isPuertaVentanaAbierta() {
        return puertaVentanaAbierta;
    }

    public void setPuertaVentanaAbierta(boolean puertaVentanaAbierta) {
        this.puertaVentanaAbierta = puertaVentanaAbierta;
    }

    public boolean isMovimientoDomicilio() {
        return movimientoDomicilio;
    }

    public void setMovimientoDomicilio(boolean movimientoDomicilio) {
        this.movimientoDomicilio = movimientoDomicilio;
    }
}
