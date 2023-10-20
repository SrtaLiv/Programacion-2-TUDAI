package Pacial2021;
import java.time.LocalDate;
public class PromoViaje extends Viaje{
    protected int porcentajeDescuento;
    protected Promocion promo;

    public PromoViaje(int cantidadMiembros, int id, String ciudadOrigen,
                      String ciudadDestino, LocalDate fechaPago, int costo, String datosAlojamiento) {
        super(cantidadMiembros, id, ciudadOrigen, ciudadDestino, fechaPago, costo, datosAlojamiento);

    }
}
