package EjerciciosTipoParcial.src.Parcial2023.src;

import java.util.ArrayList;

/**
 * The type Pieza exclusiva.
 */
public class PiezaExclusiva extends Pieza {

	private int costoExtra;

    /**
     * Instantiates a new Pieza exclusiva.
     *
     * @param nombre      the nombre
     * @param descripcion the descripcion
     * @param color       the color
     * @param tiempo      the tiempo
     * @param pla         the pla
     */
    public PiezaExclusiva(String nombre, String descripcion, String color, int tiempo, int pla) {
		super(nombre, descripcion, color, tiempo, pla);
		// TODO Auto-generated constructor stub
	}

    /**
     * Buscar array list.
     *
     * @param cc the cc
     * @return the array list
     */
    public ArrayList<Pieza> buscar(Condicion cc){
		return new ArrayList<Pieza>();
	}

    /**
     * Gets costo.
     *
     * @return the costo
     */
    public int getCosto() {
		return super.getCosto() + costoExtra;
	}

    /**
     * Gets costo extra.
     *
     * @return the costo extra
     */
    public int getCostoExtra() {
		return costoExtra;
	}

    /**
     * Sets costo extra.
     *
     * @param costoExtra the costo extra
     */
    public void setCostoExtra(int costoExtra) {
		this.costoExtra = costoExtra;
	}
	
	

}
