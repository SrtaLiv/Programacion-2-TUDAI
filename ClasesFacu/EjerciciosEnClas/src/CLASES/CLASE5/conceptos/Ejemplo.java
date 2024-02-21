package CLASES.CLASE5.conceptos;

import java.util.ArrayList;
import CLASES.CLASE5.ColeccionDinamica;
public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ColeccionDinamica cd = new ColeccionDinamica(110);
      
      for(int i =0; i<10; i++) {
    	  cd.addElemento("elem "+i);
      }
      cd.remove(0);
      cd.setElement(2, "soy 2");
      cd.addElement(2, "soy 2");
      
      for(int i =0; i<cd.tamanio(); i++) {
    	 System.out.println(cd.getElemento(i));
      }

      cd.removeAll( "soy 2");
      //cd.addElement(2, "soy el nuevo 2");
      
      for(int i =0; i<cd.tamanio(); i++) {
    	 System.out.println(cd.getElemento(i));
      }
      
      
      ArrayList<String> cd2 = new ArrayList();
      
      cd2.add("hola");
      //cd2.add(new ColeccionDinamica());
      String o1 = cd2.get(0);
     
    // Figura ff 
      
      
      
	}

}
