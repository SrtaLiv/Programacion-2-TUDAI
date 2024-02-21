package CLASES.CLASE3;

public class AdminFiguras {
    public void imprimir(Figura rr) {
        System.out.println("Figura: " + rr.getNombre() +
                " Area:"+ rr.getArea() +
                " Perimetro " + rr.getPerimetro());
    }

    public static void main(String[] args) {
        AdminFiguras aa = new AdminFiguras();
        Rectangulo rr1 = new Rectangulo(10,10);
        aa.imprimir(rr1);
        Circulo cc1 = new Circulo(10);
        aa.imprimir(cc1);



        // APUNTA A ALGO DEL TIPO FIGURA (Y SUS HIJOS)
        Figura f1;
        // APUNTA A ALGO DEL TIPO CIRCULO (Y SUS HIJOS)
        Circulo c1;
        // APUNTA A ALGO DEL TIPO Rectangulo (Y SUS HIJOS)

        Rectangulo r1;

        f1 = new Figura();
        f1 = new Circulo(10);
        f1 = new Rectangulo(10,10);

        //	c1 = new Figura();
        c1 = new Circulo(10);
        //	c1 = new Rectangulo(10,10);

        //	r1 = new Figura();
        //	r1 = new Circulo(10);
        r1 = new Rectangulo(10,10);


        f1 = r1;

        //	r1 = c1;
        //	c1 = r1;
        //((Rectangulo)f1).getLado1();

        MedioCirculo mc1 = new MedioCirculo(10);
        f1 = mc1;
        System.out.println(f1.getArea());
        System.out.println(f1.getPerimetro());
        //f1.getRadio();
        mc1.getRadio();

        System.out.println(c1.getDatosCompletos());
        System.out.println(mc1.getDatosCompletos());
        System.out.println(r1.getDatosCompletos());
    }
}
