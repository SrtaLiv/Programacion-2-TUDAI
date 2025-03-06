package EjerciciosTipoParcial.src.recuCombos;

import java.util.ArrayList;

public class Bazar {
	private ArrayList<ElementoBazar> elementosBazar;
	
	public Bazar() {
		elementosBazar = new ArrayList<>();
	}

	public ArrayList<ElementoBazar> getElementosBazar() {
		return new ArrayList<>(elementosBazar);
	}
	
	public void addElementoBazar(ElementoBazar elemNuevo) {
		elementosBazar.add(elemNuevo);
	}
	
	public ArrayList<ElementoBazar> busquedaProductoCombo(Condicion cond){
		ArrayList<ElementoBazar> busqueda = new ArrayList<>();
		
		for(ElementoBazar elemBazar : elementosBazar) {
			ArrayList<ElementoBazar> listaAux = elemBazar.obtenerSiCumple(cond);
			if (!listaAux.isEmpty()){
				busqueda.addAll(listaAux);
			}
		}
	 
	 return busqueda;
	}

	
	/*
	obtenerPRoductoDEMeorpeso(cobo)
	
	eturn cobo.getproductodemneoreso*/
}
