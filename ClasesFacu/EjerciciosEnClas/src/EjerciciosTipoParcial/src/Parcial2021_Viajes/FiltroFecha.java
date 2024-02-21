package EjerciciosTipoParcial.src.Parcial2021_Viajes;

import java.time.LocalDate;

/**
 * The type Filtro fecha.
 */
public class FiltroFecha extends Filtro {

	
	private LocalDate fechaDada;

    /**
     * Cumple boolean.
     *
     * @param pp the pp
     * @return the boolean
     */
    @Override
	public boolean cumple(PaqueteViaje pp) {

	   LocalDate fechaPaquete = pp.getFechaPago();
	   
	   if((fechaPaquete!=null)) {
		   return fechaPaquete.compareTo(fechaDada) >0;
	   } 
	   return false;
	
	}

}
