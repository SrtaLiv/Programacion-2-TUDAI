package Ej8_MisVideos;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Oli", LocalDate.of(2000, 3, 2), "oli@gmail.com");
        Usuario user2 = new Usuario("Sofi", LocalDate.of(2000, 3, 2), "oli@gmail.com");

        Playlist raiz = new Playlist("Huerta en casa", LocalDate.of(1990, 2, 2));

       Video v1 = new Video("Cómo trasplantar tomates", LocalDate.of(2000, 12, 2),
                user1, 2, 2,3, 3);
       Video v2 = new Video("Siembra de morrones", LocalDate.of(2000, 12, 2),
                user1, 2, 2,3, 3);
        Video v3 = new Video("Tomates en maceta", LocalDate.of(2000, 12, 2),
                user1, 2, 2,3, 3);


       Playlist playAjies = new Playlist("Ajies picantes", LocalDate.now());
       Video v4 = new Video("Video introductorio", LocalDate.of(2000, 12, 2),
               user1, 2, 2,3, 3);

        //Grupo 1
        Grupo ajies1 = new Grupo("Ajies1",LocalDate.now());
        ajies1.addElementos(new Video("" +
                "Ajis rojos", LocalDate.of(2000, 12, 2),
                user1, 2, 2,3, 3));
        ajies1.addElementos(new Video("" +
                "Ajis azules", LocalDate.of(2000, 12, 2),
                user1, 2, 2,3, 3));
        ajies1.addElementos(new Video("" +
                "Ajis azules", LocalDate.of(2000, 12, 2),
                user1, 2, 2,3, 3));

        //Grupo 2
        Grupo ajies2 = new Grupo("Ajies2", LocalDate.now());
        ajies2.addElementos(new Video("" +
                "Ajis ricos", LocalDate.of(2000, 12, 2),
                user1, 2, 2,3, 3));
        ajies2.addElementos(new Video("" +
                "Ajis feos", LocalDate.of(2000, 12, 2),
                user1, 2, 2,3, 3));

 /*
    Por ejemplo la
playlist “Huerta en casa”, contiene los videos “Cómo trasplantar tomates”, “Siembra de
morrones”, “Tomates en maceta”, y la playlist “Ajíes picantes” (que a su vez contiene un
video introductorio y otros 10 videos diferentes, organizados en 2 grupos por tipo de ají)

Playlist -> video1, video2, playlist2(video3, video4) ->
     */

        raiz.addElemento(v1); //raiz/transplantar
        raiz.addElemento(v2); //raiz/siembra
        raiz.addElemento(v3); //raiz/tomates maceta

        playAjies.addElemento(v4); //Ajies picantes/video intro
        playAjies.addElemento(ajies1); //Ajies picantes/4videos..
        playAjies.addElemento(ajies2); //Ajies picantes/2 videos..

        raiz.addElemento(playAjies); //raiz/playAjies/ videoIntro+4videos+2videos

        System.out.println("Cantidad videos raiz:" + raiz.getCantVideos());

    }

}
