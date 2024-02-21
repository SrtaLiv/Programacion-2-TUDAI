package EjerciciosTipoParcial.src.recuCombos;

import java.util.ArrayList;
import java.util.Collections;

public class Combo extends ElementoBazar{

	
		private ArrayList<ElementoBazar> elementosBazar;
		private double descuentoPorProducto;
		private double descuentoLimite;
		
		public Combo(double descuentoPorProducto,double descuentoLimite) {
			super();
			elementosBazar = new ArrayList<>();
			this.descuentoPorProducto = descuentoPorProducto;
			this.descuentoLimite = descuentoLimite;
			
		}
		
		public void agregarElementoBazar(ElementoBazar elemB, Condicion c) {
			if(c.cumple(elemB))
			{
			elementosBazar.add(elemB);
			}
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
			
			for (ElementoBazar elemBaz : elementosBazar) {
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
			for (ElementoBazar ebaz : elementosBazar) {
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
			for (ElementoBazar elemB : elementosBazar) {
				peso += elemB.getPeso();
			}
			return peso;
		}
/*asi cuento a mis hijos producto (y no a mi)*/
		@Override 
		public int cantTotal() {
			int cant= 0;
			for (ElementoBazar e : elementosBazar) {
				cant += e.cantTotal();
			}			
		return cant;
		}
		
		
		/*public Producto pesoMenorProducto() {
			Producto productoMenorPeso = null;
			double menorPesoDetectado = Double.MAX_VALUE;  // auxiliar
			for (ElementoBazar elementoB : elementosBazar) {
				if(elementoB.getClass().getName().equals("Combo"))
				{
					Combo combo = (Combo) elementoB;
					Producto prodDecombo = combo.pesoMenorProducto();// me retorna el producto de menor peso de un combo
					if(prodDecombo.getPeso()<menorPesoDetectado)  // tengo que verificar si realmente es el menor del combo superior
					{
						menorPesoDetectado = prodDecombo.getPeso();
						productoMenorPeso = prodDecombo;
					}
				}
				else // elementoB.getClass().getName() = "Producto"}
				{
					if(elementoB.getPeso()<menorPesoDetectado)
					{
						menorPesoDetectado = elementoB.getPeso();
						productoMenorPeso = (Producto) elementoB;
					}
				}
			}
			
			return productoMenorPeso;
		}*/
		
		public Producto productoMenorPeso(){
	        double pesoParcial = 99999999;
	        Producto menorPeso = null;
	        for(ElementoBazar elem : elementosBazar){
	            Producto menorPesoHijo = elem.productoMenorPeso();
	            if(menorPeso.getPeso() < pesoParcial){
	                pesoParcial = menorPeso.getPeso();
	                menorPeso = menorPesoHijo;
	            }
	        }
	        return menorPeso;
	    }
		
/*arreglado por profe*/
		@Override
		public ArrayList<ElementoBazar> obtenerSiCumple(Condicion cond) {
			ArrayList<ElementoBazar> elemCumple = new ArrayList<>();
			if(cond.cumple(this)) {
				elemCumple.add(this);
			}
			else {
			    for(ElementoBazar elemB : elementosBazar) {
				  elemCumple.addAll(elemB.obtenerSiCumple(cond));
			    	
				}
			}
		return elemCumple;
		}
		

		
}
