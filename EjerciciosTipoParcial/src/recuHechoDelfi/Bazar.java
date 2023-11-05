package recuHechoDelfi;

import recuHechoDelfi.Condiciones.Condicion;

import java.util.ArrayList;

public class Bazar {
	private ArrayList<ElementoBZ> elementosBazar;
	
	public Bazar() {
		elementosBazar = new ArrayList<>();
	}

	public ArrayList<ElementoBZ> getElementosBazar() {
		return new ArrayList<>(elementosBazar);
	}
	
	public void addElementoBazar(ElementoBZ elemNuevo) {
		elementosBazar.add(elemNuevo);
	}
	
	public ArrayList<ElementoBZ> busquedaProductoCombo(Condicion cond){
		ArrayList<ElementoBZ> busqueda = new ArrayList<>();
		for(ElementoBZ elemBazar : elementosBazar) {
			ArrayList<ElementoBZ> listaAux = elemBazar.obtenerSiCumple(cond);
			if (!listaAux.isEmpty()){
				busqueda.addAll(listaAux);
			}
		}
	 
	 return busqueda;
	}

	

}
