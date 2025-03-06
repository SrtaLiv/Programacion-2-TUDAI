package EjerciciosTipoParcial.src.Parcial2021_Viajes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * The type Paquete compuesto.
 */
public class PaqueteCompuesto extends PaqueteViaje {

	private ArrayList<PaqueteViaje> elementos;

	/**
	 * Instantiates a new Paquete compuesto.
	 *
	 * @param id   the id
	 * @param cant the cant
	 */
	public PaqueteCompuesto(int id, int cant) {
		super(id, cant);
		this.elementos = new ArrayList<PaqueteViaje>();
	}


	/**
	 * Gets origen.
	 *
	 * @return the origen
	 */
	public String getOrigen() {
		if (!elementos.isEmpty())
			 return elementos.get(0).getOrigen();
		else
			return null;
		
	}

	public String getDestino() {
		int size = elementos.size();
		if (size>0)
		  return elementos.get(size-1).getDestino();
		else
			 return null;
		
	}

	/**
	 * Gets costo.
	 *
	 * @return the costo
	 */
	public double getCosto() {
		double aux = 0;
		for (PaqueteViaje elemento : elementos) {
			aux = aux + elemento.getCosto();
		}
		return aux;
	}

	/**
	 * Gets fecha pago.
	 *
	 * @return the fecha pago
	 */
	public LocalDate getFechaPago() {
		LocalDate mayor =  LocalDate.of(1900, 1,1);
		for (PaqueteViaje elementoI : elementos) {
			LocalDate fecha = elementoI.getFechaPago();
			if (fecha == null) {
				return null;
			} else {
				if (fecha.compareTo(mayor) > 0)
					mayor = fecha;
			}
		}
		return mayor; 
		
	}


	/**
	 * Add paquete.
	 *
	 * @param paquete the paquete
	 */
	public void addPaquete(PaqueteViaje paquete) {
		if (paquete.getCantidadPersonas() == this.getCantidadPersonas()) {
			if (elementos.size()==0) {
				elementos.add(paquete);
			} else {
				if (this.getDestino().equals(paquete.getOrigen()))
					elementos.add(paquete);
			}
		}
	}

	/**
	 * Buscar array list.
	 *
	 * @param ff the ff
	 * @return the array list
	 */
	public ArrayList<PaqueteViaje> buscar(Filtro ff){
		  ArrayList<PaqueteViaje> result = new ArrayList<PaqueteViaje>();
		  if (ff.cumple(this)) {
			  result.add(this);
		  } else {
			  for (PaqueteViaje elemento : elementos) {
				  result.addAll(elemento.buscar(ff));
			  }
		  }
		  return result;
		  
		}
	
	
	
}
