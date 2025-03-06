package EjerciciosTipoParcial.src.Parcial2021_Viajes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The type Paquete viaje.
 */
public abstract class PaqueteViaje {

	private int cantidadPersonas;
	private int id;

	/**
	 * Instantiates a new Paquete viaje.
	 *
	 * @param cantidadPersonas the cantidad personas
	 * @param id               the id
	 */
	public PaqueteViaje(int cantidadPersonas, int id) {
		super();
		this.cantidadPersonas = cantidadPersonas;
		this.id = id;
	}

	/**
	 * Gets cantidad personas.
	 *
	 * @return the cantidad personas
	 */
	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	/**
	 * Sets cantidad personas.
	 *
	 * @param cantidadPersonas the cantidad personas
	 */
	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets origen.
	 *
	 * @return the origen
	 */
	public abstract String getOrigen();

	/**
	 * Gets destino.
	 *
	 * @return the destino
	 */
	public abstract String getDestino();

	/**
	 * Gets costo.
	 *
	 * @return the costo
	 */
	public abstract double getCosto();

	/**
	 * Gets fecha pago.
	 *
	 * @return the fecha pago
	 */
	public abstract LocalDate getFechaPago();

	/**
	 * Buscar array list.
	 *
	 * @param ff the ff
	 * @return the array list
	 */
	public abstract ArrayList<PaqueteViaje> buscar(Filtro ff);

	public ArrayList<PaqueteViaje> buscar(Filtro ff, Comparator<PaqueteViaje> c1){
	  ArrayList<PaqueteViaje> result = this.buscar(ff);
	  Collections.sort(result,c1);
	  return result;
	}
	
	 
	 
	
	
	
}
