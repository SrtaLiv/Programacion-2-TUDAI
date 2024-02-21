package CLASES.PATRONES.Singleton;

public class Main {
    public static void main(String[] args) {
        //Unicen univ = new Unicen();  ERROR!

        Unicen uni1 = Unicen.getInstance();

        uni1.setRector("Roberto Tasara");
        System.out.println("Rector de uni1: "+ uni1.getRector());

        Unicen uni2 = Unicen.getInstance();
        System.out.println("Rector de uni2: "+ uni2.getRector());

        Unicen uni3 = Unicen.getInstance();
        System.out.println("Rector de uni3: "+ uni3.getRector());

        uni3.setRector("Juan Perez");
        System.out.println("Rector de uni1: "+ uni1.getRector());

    }
}
