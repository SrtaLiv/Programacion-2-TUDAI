package EjerciciosTipoParcial.src.Parcial2021_Viajes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * The type Paquete simple.
 */
public class PaqueteSimple extends PaqueteViaje {

	private String origen;
	private String destino;
	private double costo;
	private String datosAlo;
	private LocalDate fechaPago;

	public PaqueteSimple(int cantidadPersonas, int id, String origen, String destino, double costo, String datosAlo) {
		super(cantidadPersonas, id);
		this.origen = origen;
		this.destino = destino;
		this.costo = costo;
		this.datosAlo = datosAlo;
		this.fechaPago = null;
	}

	/**
	 * Gets origen.
	 *
	 * @return the origen
	 */
	@Override
	public String getOrigen() {
		
		return origen;
	}

	/**
	 * Gets destino.
	 *
	 * @return the destino
	 */
	@Override
	public String getDestino() {
		
		return destino;
	}

	/**
	 * Gets costo.
	 *
	 * @return the costo
	 */
	@Override
	public double getCosto() {
		return costo;
	}

	/**
	 * Gets fecha pago.
	 *
	 * @return the fecha pago
	 */
	@Override
	public LocalDate getFechaPago() {
		
		return fechaPago;
	}

	/**
	 * Gets datos alo.
	 *
	 * @return the datos alo
	 */
	public String getDatosAlo() {
		return datosAlo;
	}

	/**
	 * Sets datos alo.
	 *
	 * @param datosAlo the datos alo
	 */
	public void setDatosAlo(String datosAlo) {
		this.datosAlo = datosAlo;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public ArrayList<PaqueteViaje> buscar(Filtro ff){
	  ArrayList<PaqueteViaje> result = new ArrayList<PaqueteViaje>();
	  if (ff.cumple(this)) {
		  result.add(this);
	  }
	  return result;
	  
	}
	

}
