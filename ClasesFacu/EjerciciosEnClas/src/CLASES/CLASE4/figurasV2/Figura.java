package CLASES.CLASE4.figurasV2;
public class Figura {
   private String nombre;
   
  /* public Figura(String nom) {
	   nombre = nom;
   }
   */
   public void setNombre(String nn) {
	   nombre =  nn;
	   
   }
   
   public String getNombre() {
	   return nombre;
   }
   
   public double getArea() {
	   return 0;
   }
   
   public double getPerimetro() {
	   return 0;
   }
   
	public String getDatosCompletos() {
		return this.getNombre()+":"+this.getArea()+":" +this.getPerimetro();
	}
}
