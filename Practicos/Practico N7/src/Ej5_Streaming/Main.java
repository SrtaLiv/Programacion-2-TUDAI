package Ej5_Streaming;

public class Main {
    public static void main(String[] args) {
        PlataformaStreaming p = new PlataformaStreaming();
        Pelicula cars = new Pelicula("Cars", "Accion", "A",
                2020, 100, 6);
        Pelicula barbie = new Pelicula("Barbie", "Terror", "B",
                2020, 120, 12);
        Pelicula crepusculo = new Pelicula("Crepusulo", "Romance", "A",
                2020, 90, 18);
        Pelicula bajoes = new Pelicula("Bajo la misma Estrella", "Drama", "A",
                2020, 90, 18);
        Pelicula sirenita = new Pelicula("Sirenita", "Romance", "A",
                2020, 120, 18);

        p.addPelicula(cars);
        p.addPelicula(barbie);
        p.addPelicula(crepusculo);
        p.addPelicula(bajoes);
        p.addPelicula(sirenita);

        System.out.println(p.buscar(new FiltroNombre("Barbie")));
    }
}
