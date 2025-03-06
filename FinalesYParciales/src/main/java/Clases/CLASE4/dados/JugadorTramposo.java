package CLASES.CLASE4.dados;

public class JugadorTramposo extends Jugador{
    private DadoCargado[] misDados;
	public JugadorTramposo(String nombre, DadoCargado[] dados) {
		super(nombre);
		misDados = dados;
		
	}
	@Override
	public int tirarDados(Cubilete ccc) {
		Dado[] aux = ccc.getDados();
		ccc.setDados(misDados);
		int valor = ccc.tirarDados();
		ccc.setDados(aux);
		return valor;
	}

}
