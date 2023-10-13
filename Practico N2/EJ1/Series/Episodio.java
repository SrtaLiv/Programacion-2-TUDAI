public class Episodio {
    int calificacion;
    boolean flag;
    public static final int MAX_EPISODIOS = 4;
    public static final int[] EPISODIOS = {1, 2, 3, 4}; //ALGO FIJO



    public Episodio(int calificacion, boolean flag) {
        setFlag(flag);
        setCalificacion(calificacion);
        //necesito tambien especificar que temporada es el episodio
    }

    public void mostrarEpisodios(int[]EPISODIOS){
        for (int i=0; i < EPISODIOS[i] ; i++){
            System.out.println("NUMERO DE EPISODIOS VISTOS: " +
            "CANTIDAD DE EPISODIOS:" + MAX_EPISODIOS);
        }
    }


    public int contarEpisodiosVistos(Episodio ep){
        int contador = 0;
        for (int i = 0 ; i < EPISODIOS.length; i++){
            System.out.println("EL EPISODIO " + i);
            if (ep.flag){
                contador++;
            }
        }
        return contador; //RETORNA EPISODIOS VISTOS.
    }



    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
