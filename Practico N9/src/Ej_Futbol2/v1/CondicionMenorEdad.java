package Ej_Futbol2.v1;

public class CondicionMenorEdad extends Condicion{
    
    @Override
    public boolean filtrar(Socio socio) {
        return socio.getEdad() < 18;
    }
}
