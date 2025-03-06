package Clases.Parcialito4;

import java.util.ArrayList;

public class PlataformaStreaming {
    ArrayList<Pelicula> pelis;
    public PlataformaStreaming() {
        this.pelis = new ArrayList<>();
    }

    public void addPeliculas(Pelicula peli){
        pelis.add(peli);
    }

    public ArrayList<Pelicula> getPeliculas(){
        return new ArrayList<>(pelis);
    }

    public void showPeliculas(){
        for (int i = 0 ; i < pelis.size() ; i++) {
            System.out.println(pelis.get(i).toString());
        }
    }

    public ArrayList<Pelicula> buscar(Condicion condicion ){
        ArrayList<Pelicula> retorno = new ArrayList<>();
        for (int i = 0; i < pelis.size(); i++) {
            Pelicula actual = pelis.get(i);
            if (condicion.cumple(actual))
                retorno.add(pelis.get(i));
        }
        return retorno;
    }


    public static void main(String[] args) {
        PlataformaStreaming netflix = new PlataformaStreaming();

        netflix.addPeliculas( new Pelicula("Cars", "autos choca", "romance",
                "JK Rowling", "Harry", 2000, 190, 16));

        netflix.addPeliculas( new Pelicula("Mariluna", "autos veloces", "terror",
                "Martin Scorsese", "Harry", 2000, 190, 16));

        netflix.addPeliculas(new Pelicula("Carluna", "autos veloces", "romance",
                "Martin Scorsese", "Will Smith", 2000, 190, 20));

        netflix.addPeliculas(new Pelicula("Sex Education", "sexoooo", "drama",
                "Tu Mama", "Will Smith", 2022, 100, 20));

        netflix.showPeliculas();
        System.out.println("Mostrar:");
        ArrayList<Pelicula> peliculasLuna = netflix.buscar(new CondicionTitulo("luna"));
        System.out.println(peliculasLuna);

        System.out.println("PELICULAS +18");
        ArrayList<Pelicula> pelisEdadMin = netflix.buscar(new CondicionEdad(18));
        System.out.println(pelisEdadMin);

        System.out.println("PELICULAS DE TERROR:");
        ArrayList<Pelicula> peliculasTerror = netflix.buscar(new CondicionGenero("terror"));
        System.out.println(peliculasTerror);

        System.out.println("PELICULA sin Will Smith y cuyo director SI haya\n" +
                "sido Martin Scorsese.");
        ArrayList<Pelicula> peliWill = netflix.buscar(new CondicionAND(new CondicionNOT(new CondicionActor("Will Smith")), new CondicionDirector("Martin Scorsese")));
        System.out.println(peliWill);

        System.out.println("Películas cuya duración sea menor a 120 minutos, que no sean del género “comedia”.");
        ArrayList<Pelicula> ceo = netflix.buscar(new CondicionAND(new CondicionDuracion(120), new CondicionNOT(new CondicionGenero("comedia"))));
        System.out.println(ceo);


    }
}
