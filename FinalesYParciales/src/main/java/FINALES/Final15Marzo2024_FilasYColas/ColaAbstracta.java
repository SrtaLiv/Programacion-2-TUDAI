package FINALES.Final15Marzo2024_FilasYColas;

public abstract class ColaAbstracta {
    public abstract int getCantElementos(); // get cant elementos
    public abstract ColaTerminal getTermiMasElem();
    public abstract boolean pertenece(ColaAbstracta colaAbstracta);
    public abstract ColaAbstracta copia(ColaAbstracta cola);
    public abstract int getCantTerminales(); // en sim
    public abstract void eliminar();
}
