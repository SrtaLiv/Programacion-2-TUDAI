package Ej8_MisVideos;

public class FiltroVisualizacion extends Filtro{
    int visualizacion;

    public FiltroVisualizacion(int visualizacion) {
        this.visualizacion = visualizacion;
    }

    @Override
    public boolean cumple(Video v) {
        return v.getVisualizacion() == visualizacion;
    }

}
