package Practicos.practico2.EJ4.src;

public class Turno{
    private int horaIni;
    private int horaFin;
    private Usuario user;
    private Cancha cancha;
    private boolean esSocio;


    public Turno(Usuario user, int horaIni, int horaFin) {
        this.horaIni = 0;
        this.horaFin = horaFin;
        this.user = null;
        this.esSocio = false;
    }

    public int cantidadHoras(int horaIni, int horaFin){
        return horaFin + horaIni;
    }

    public int getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(int horaIni) {
        this.horaIni = horaIni;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public boolean isEsSocio() {
        return esSocio;
    }

    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }
}
