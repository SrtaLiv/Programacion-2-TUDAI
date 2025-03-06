package EjerciciosTipoParcial.src.Parcial2023.src;

import java.util.ArrayList;

/**
 * The type Pieza.
 */
public class Pieza extends Pieza3D{
  
  private String color;
  private int tiempo;
  private int pla;


    /**
     * Instantiates a new Pieza.
     *
     * @param nombre      the nombre
     * @param descripcion the descripcion
     * @param color       the color
     * @param tiempo      the tiempo
     * @param pla         the pla
     */
    public Pieza(String nombre, String descripcion, String color, int tiempo, int pla) {
	super(nombre, descripcion);
	this.color = color;
	this.tiempo = tiempo;
	this.pla = pla;
}

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
		return color;
	}

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(String color) {
		this.color = color;
	}

    /**
     * Gets tiempo.
     *
     * @return the tiempo
     */
    public int getTiempo() {
		return tiempo;
	}

    /**
     * Sets tiempo.
     *
     * @param tiempo the tiempo
     */
    public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

    /**
     * Gets pla.
     *
     * @return the pla
     */
    public int getPla() {
		return pla;
	}

    /**
     * Sets pla.
     *
     * @param pla the pla
     */
    public void setPla(int pla) {
		this.pla = pla;
	}

    /**
     * Gets cantidad simples.
     *
     * @return the cantidad simples
     */
    public int getCantidadSimples() {
		return 1;
	}

    /**
     * Get colores array list.
     *
     * @return the array list
     */
    public ArrayList<String> getColores(){
		ArrayList<String> salida = new ArrayList<String>();
		salida.add(color);
		return salida;
	}

    /**
     * Buscar array list.
     *
     * @param cc the cc
     * @return the array list
     */
    public ArrayList<Pieza> buscar(Condicion cc){
		ArrayList<Pieza> salida = new ArrayList<Pieza>();
		if (cc.cumple(this)) {
			salida.add(this);
		}
		return salida;
	}
}
