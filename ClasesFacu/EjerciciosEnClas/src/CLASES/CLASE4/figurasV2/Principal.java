package CLASES.CLASE4.figurasV2;
public class Principal {

	public static void main(String[] args) {
       Circulo c1 = new Circulo(10);
       Figura3D ff1 = new Figura3D("Cilindro",
    		                       c1,
    		                       20);
       
       
       Figura3D ff2 = new Figura3D("PrismaRectangular",
               new Rectangulo(10,10),
               20);

       System.out.println(ff1.getVolumen());
       System.out.println(ff2.getVolumen());
       
       Figura3D ff3 = new Figura3D("MedioCirculo3D",
               new MedioCirculo(10),
               20);
       System.out.println(ff3.getVolumen());
       System.out.println(ff3.getSuperficie());
	}

}
