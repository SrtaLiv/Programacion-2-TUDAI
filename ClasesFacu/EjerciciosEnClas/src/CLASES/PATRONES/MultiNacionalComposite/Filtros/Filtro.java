package CLASES.PATRONES.MultiNacionalComposite.Filtros;


import CLASES.PATRONES.MultiNacionalComposite.Empleado;

public interface Filtro {

    boolean cumple(Empleado empleado);
}
