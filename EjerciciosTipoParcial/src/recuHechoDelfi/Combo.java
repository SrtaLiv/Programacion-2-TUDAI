package recuHechoDelfi;

import recuHechoDelfi.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collections;

public class Combo extends ElementoBZ {
		private ArrayList<ElementoBZ> elementosBazar;
		private double descuentoPorProducto;
		private double descuentoLimite;
		
		public Combo(double descuentoPorProducto,double descuentoLimite) {
			super();
			elementosBazar = new ArrayList<>();
			this.descuentoPorProducto = descuentoPorProducto;
			this.descuentoLimite = descuentoLimite;
			
		}
		
		public void agregarElementoBazar(ElementoBZ elemB, Condicion c) {
			if(c.cumple(elemB))
			{
			elementosBazar.add(elemB);
			}
		}

		public void addElemento(ElementoBZ nuevo){
			elementosBazar.add(nuevo);
			nuevo.setContenedor(this);
		}

		private void eliminar(ElementoBZ nuevo) {
			this.elementosBazar.remove(nuevo);
		}

	@Override
		public double getPrecio() {
			double descuento= descuentoPorProducto * cantTotal();
			if(descuento > descuentoLimite) {
				descuento = descuentoLimite;
			}
			return sumaPrecio() - sumaPrecio() * descuento;
		}
		
		public double sumaPrecio() {
			double sumaTotalPrecios = 0.0;
			
			for (ElementoBZ elemBaz : elementosBazar) {
				sumaTotalPrecios += elemBaz.getPrecio();
			}
			
		return sumaTotalPrecios;
		}
		
		public double getDescuento() {
			return descuentoPorProducto;
		}

		public void setDescuento(double descuentoPorProducto) {
			this.descuentoPorProducto = descuentoPorProducto;
		}

		@Override
		public ArrayList<String> getCategorias() {
			ArrayList<String> misCateg = new ArrayList<>();
			for (ElementoBZ ebaz : elementosBazar) {
				ArrayList<String> aux = new ArrayList<>();
				aux.addAll(ebaz.getCategorias());
				for(String s : aux) {
					if(!misCateg.contains(s)) {
						misCateg.add(s);
					}
				}
				
			}
		Collections.sort(misCateg);
		return misCateg;
		}
		
		@Override
		public double getPeso() {
			double peso = 0;
			for (ElementoBZ elemB : elementosBazar) {
				peso += elemB.getPeso();
			}
			return peso;
		}

		/*asi cuento a mis hijos producto (y no a mi)*/
		@Override 
		public int cantTotal() {
			int cant= 0;
			for (ElementoBZ e : elementosBazar) {
				cant += e.cantTotal();
			}			
		return cant;
		}
		

		public Producto productoMenorPeso(){
	        double pesoParcial = 99999999;
	        Producto menorPeso = null;
	        for(ElementoBZ elem : elementosBazar){
	            Producto menorPesoHijo = elem.productoMenorPeso();
	            if (menorPeso.getPeso() < pesoParcial){
	                pesoParcial = menorPeso.getPeso();
	                menorPeso = menorPesoHijo;
	            }
	        }
	        return menorPeso;
	    }

	@Override
	public Combo copia() {
			Combo copia = crearCopiaBasica();
			for (int i = 0; i < elementosBazar.size();i++){
				ElementoBZ hijo = elementosBazar.get(i);
			//	copia.agregarElementoBazar(hijo.copia());
			}
		return null;
	}

	@Override
	public ElementoBZ copia(Condicion cond) {
			for (int i = 0; i < elementosBazar.size(); i++){
				ElementoBZ hijo = elementosBazar.get(i);
				if (cond.cumple(hijo)){
					return hijo.copia();
				}
			}
		return null;
	}

	public Combo crearCopiaBasica(){
			return new Combo(this.descuentoPorProducto, this.descuentoLimite);
	}



	/*arreglado por profe*/
		@Override
		public ArrayList<ElementoBZ> obtenerSiCumple(Condicion cond) {
			ArrayList<ElementoBZ> elemCumple = new ArrayList<>();
			if (cond.cumple(this)) {
				elemCumple.add(this);
			}
			else {
			    for(ElementoBZ elemB : elementosBazar) {
				  elemCumple.addAll(elemB.obtenerSiCumple(cond));
			    	
				}
			}
		return elemCumple;
		}
		

		
}
