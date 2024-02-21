package CLASES.CLASE5;

public class ColeccionDinamica {

	private Object[] datos;
	private int contador;
	
	public ColeccionDinamica() {
		datos = new Object[10];
		contador =0;
	}
	public ColeccionDinamica(int tamInicial) {
		datos = new Object[tamInicial];
		contador =0;
	}	
	
	public void addElemento(Object o1) {
	  datos[contador]=o1;
	  contador++;
		 if (contador==datos.length) {
			 Object[] aux=new Object[contador*2];
			 for(int i=0;i<datos.length;i++) {
				  aux[i]=datos[i];
			 }
			 datos = aux;
		  } 

	}
	
	public Object getElemento(int pos) {
		if (pos>=0 && pos<contador)
		   return datos[pos];
		else
			return null;
	}
	
	public int tamanio() {
		return contador;
	}
	
	public void remove(int pos) {
		if (pos>=0&&pos<contador) {
			for( int i = pos;i<contador-1;i++) {
				datos[i]=datos[i+1];
			}
	    this.removeLast();
	  }
	}
	
	public void removeLast() {
		if (contador>0) {
			datos[contador-1]=null;
			contador--;
		}
	}
	
	
	public void setElement(int pos, Object o1) {
		if (pos>=0&& pos<contador) {
			datos[pos]=o1;
		}
	}
	
	public void addElement(int pos, Object o1) {
		if (pos>=0&& pos<contador) {
			for(int i=contador;i>pos;i--) {
				datos[i]=datos[i-1];
			}
			datos[pos]=o1;
			contador++;
		}
	}
	
	
	public void removeFirst() {
		this.remove(0);
	}
	
	public int getPos(Object o1) {
		
		for(int i =0; i< contador; i++ ) {
			if(datos[i].equals(o1)) {
				return i;
			}
		}
		return -1;
	}
	
	
	public void remove(Object o1) {
		int pos = this.getPos(o1);
		if (pos>=0) {
			this.remove(pos);
		}
	}
	
	public void removeAll(Object o1) {
		int pos = this.getPos(o1);
		while(pos>=0) {
			this.remove(pos);
			pos=this.getPos(o1);
		}
	}
}
