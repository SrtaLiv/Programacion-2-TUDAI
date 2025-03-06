package FINALES.FinalFebrero_28_02_2025;

public class RequisitoEdad extends RequisitoEspecial{
    private int edad;

    @Override
    public boolean cumple(Libro libroAB, Socio socio) {
        return socio.getEdad() > this.edad;
    }
}
