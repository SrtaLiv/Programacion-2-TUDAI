package Viajes.src;

import java.time.LocalDate;

public class FiltroFecha extends Filtro {

	
	private LocalDate fechaDada;
	
	@Override
	public boolean cumple(PaqueteViaje pp) {

	   LocalDate fechaPaquete = pp.getFechaPago();
	   
	   if((fechaPaquete!=null)) {
		   return fechaPaquete.compareTo(fechaDada) >0;
	   } 
	   return false;
	
	}

}
