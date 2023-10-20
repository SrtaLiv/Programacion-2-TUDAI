package Pacial2021;
import java.time.LocalDate;

public class Viaje {
   protected int cantidadMiembros;
    protected int id;
    protected String ciudadOrigen;
    protected String ciudadDestino;
    protected LocalDate fechaPago;
    protected int costo; //double
    protected String datosAlojamiento;

    public Viaje(int cantidadMiembros, int id, String ciudadOrigen, String ciudadDestino, LocalDate fechaPago,
                 int costo, String datos) {
        this.cantidadMiembros = cantidadMiembros;
        this.id = id;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaPago = fechaPago;
        this.costo = costo;
        this.datosAlojamiento = datos;
    }

    public Viaje(int id) {
        this.id = id;
    }

    public int getCantidadMiembros() {
        return cantidadMiembros;
    }

    public void setCantidadMiembros(int cantidadMiembros) {
        this.cantidadMiembros = cantidadMiembros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getDatosAlojamiento() {
        return datosAlojamiento;
    }

    public void setDatosAlojamiento(String datosAlojamiento) {
        this.datosAlojamiento = datosAlojamiento;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "cantidadMiembros=" + cantidadMiembros +
                ", id=" + id +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                ", fechaPago=" + fechaPago +
                ", costo=" + costo +
                ", datosAlojamiento='" + datosAlojamiento + '\'' +
                '}';
    }
}
