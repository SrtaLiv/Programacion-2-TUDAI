package Parcial2023;

public class FiltroEspecializacion extends Filtro{
    String especializacion;

    public FiltroEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
    @Override
    public boolean cumple(ContenidoEducativo cont) {
        return cont.getNombre().equalsIgnoreCase(especializacion);
    }
}
