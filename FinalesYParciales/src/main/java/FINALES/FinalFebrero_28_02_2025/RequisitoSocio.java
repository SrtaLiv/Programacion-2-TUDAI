package FINALES.FinalFebrero_28_02_2025;

public class RequisitoSocio extends RequisitoEspecial{

    @Override
    public boolean cumple(Libro libro, Socio socio) {
        for (String caracteristicasLibro : libro.getCaracteristicas()){
            if (socio.getRequisitosEspeciales().contains(caracteristicasLibro)){
                return true;
            }
        }
        return false;
    }
}
