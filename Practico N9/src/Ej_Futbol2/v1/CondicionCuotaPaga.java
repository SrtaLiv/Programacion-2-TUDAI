package Ej_Futbol2.v1;

public class CondicionCuotaPaga extends Condicion{
    
    @Override
    public boolean filtrar(Socio socio) {
        return socio.isUltimaCuotaPaga();
    }
}
