package Ej8_MisVideos;

public class FiltroLikes extends Filtro{
    int likes;

    public FiltroLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public boolean cumple(Video elem) {
        return elem.getLikes() == likes;
    }
}
