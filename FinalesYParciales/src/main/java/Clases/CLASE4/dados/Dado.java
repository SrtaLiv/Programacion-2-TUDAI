package CLASES.CLASE4.dados;

public class Dado {

	private int caras;
	private int ultimoValor;
	
	public Dado() {
		caras = 6;
		ultimoValor = tirar();
	}
	
	public Dado(int cantidadCaras) {
		caras = cantidadCaras;
		ultimoValor = tirar();
	}
	
	public int getCantidadCaras() {
		return caras;
	}
	public void setCantidadCaras(int carasNuevas) {
		caras = carasNuevas;
	}
	
	public int tirar() {
		ultimoValor= (int) (Math.random()*caras+1);
		return ultimoValor;
	}
	
	public int getUltimoValor() {
		return ultimoValor;
	}
	
	
	public static void main(String[] args) {
		Dado d1 = new Dado();
		for(int i = 0; i<10; i ++) {
		   System.out.println(d1.tirar());
		   System.out.println(d1.getUltimoValor());
		}
	}
}
