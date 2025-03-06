package EjerciciosTipoParcial.src.Parcial2021_Viajes;

import java.time.LocalDate;

/**
 * The type Paquete promo.
 */
public class PaquetePromo extends PaqueteSimple {

	private LocalDate fInicio;
	private LocalDate fFin;
	private double descuento;


	/**
	 * Gets costo.
	 *
	 * @return the costo
	 */
	public double getCosto() {
	
       if (this.getFechaPago()!=null) {
    	   
    	   if (this.getFechaPago().isBefore(fFin) && 
    			  this.getFechaPago().isAfter(fInicio) )
    		   
    		   return super.getCosto()*descuento;
    	   
       } 
       return super.getCosto();
	}


	/**
	 * Instantiates a new Paquete promo.
	 *
	 * @param cantidadPersonas the cantidad personas
	 * @param id               the id
	 * @param origen           the origen
	 * @param destino          the destino
	 * @param costo            the costo
	 * @param datosAlo         the datos alo
	 * @param fInicio          the f inicio
	 * @param fFin             the f fin
	 * @param descuento        the descuento
	 */
	public PaquetePromo(int cantidadPersonas, int id, String origen, String destino, double costo, String datosAlo,
			LocalDate fInicio, LocalDate fFin, double descuento) {
		super(cantidadPersonas, id, origen, destino, costo, datosAlo);
		this.fInicio = fInicio;
		this.fFin = fFin;
		this.descuento = descuento;
	}
	


	
}
