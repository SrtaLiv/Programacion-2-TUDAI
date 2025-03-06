package CLASES.CLASE4.dados;

public class Cubilete {
	Dado[] dados;
	
	public Cubilete() {
		dados = new Dado[2];
		for(int i =0; i<dados.length; i++) {
			dados[i] = new Dado();
		}
	}

	public Cubilete(int cantidadDados) {
		dados = new Dado[cantidadDados];
		for(int i =0; i<dados.length; i++) {
			dados[i] = new Dado();
		}
	}
	
	public Cubilete(int cantidadDados, int caras) {
		dados = new Dado[cantidadDados];
		for(int i =0; i<dados.length; i++) {
			dados[i] = new Dado(caras);
		}
	}
	public Dado[] getDados() {
		return dados;
	}
	public void setDados(Dado[] dados) {
		this.dados = dados;
	}
	
	public int tirarDados() {
		int suma = 0;
		for (int i =0; i<dados.length;i++) {
			Dado di = dados[i];
			if (di!=null)
			   suma = suma + di.tirar();
		}
		return suma;
	}
	
	
}
