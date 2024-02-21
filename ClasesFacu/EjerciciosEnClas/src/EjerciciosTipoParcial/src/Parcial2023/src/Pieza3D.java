package EjerciciosTipoParcial.src.Parcial2023.src;

import java.util.ArrayList;

/**
 * The type Pieza 3 d.
 */
public abstract class Pieza3D {
	private String nombre;
	private String descripcion;
    private static int precioGramo=12;
    private static int costoSegundo=45;

    public Pieza3D(String nombre, String descripcion) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;

    }
    public String getNombre() {
		return nombre;
	}

    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public String getDescripcion() {
		return descripcion;
	}

    public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


    public abstract int getPla();

    public abstract int getCantidadSimples();

    public abstract int getTiempo();


    public abstract ArrayList<String> getColores() ;

    public abstract ArrayList<Pieza> buscar(Condicion pp);
	// calcula como la cantidad de PLA necesario por
	//el precio del gramo PLA m�s la cantidad 
	//de segundos de impresi�n por un costo de segundo de impresi�n. 


    /**
     * Gets costo.
     *
     * @return the costo
     */
    public int getCosto() {
		return this.getPla()*Pieza3D.getPrecioGramo() + 
				this.getTiempo()* Pieza3D.getCostoSegundo();
	}

    /**
     * Gets precio gramo.
     *
     * @return the precio gramo
     */
    public static int getPrecioGramo() {
		return precioGramo;
	}

    /**
     * Sets precio gramo.
     *
     * @param precioGramo the precio gramo
     */
    public static void setPrecioGramo(int precioGramo) {
		Pieza3D.precioGramo = precioGramo;
	}

    /**
     * Gets costo segundo.
     *
     * @return the costo segundo
     */
    public static int getCostoSegundo() {
		return costoSegundo;
	}

    /**
     * Sets costo segundo.
     *
     * @param costoSegundo the costo segundo
     */
    public static void setCostoSegundo(int costoSegundo) {
		Pieza3D.costoSegundo = costoSegundo;
	}
	
	
}
