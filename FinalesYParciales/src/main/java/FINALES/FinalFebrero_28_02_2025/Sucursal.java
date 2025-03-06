package FINALES.FinalFebrero_28_02_2025;

import FINALES.FinalFebrero_14_02_2025.ElemAB;
import FINALES.FinalFebrero_14_02_2025.Filtro;

import java.util.ArrayList;

public class Sucursal extends LibroAB {
    private ArrayList<Libro> libros;


    public ArrayList<Libro> solicitarLibro(Socio s, RequisitoEspecial r){
        ArrayList<Libro> res = new ArrayList<>();
        for (LibroAB elem : libros){
            res.addAll(elem.solicitarLibro(s, r));
        }
        return res;
    }

    @Override
    public int getCantLibros() {
        int res = 0;
        for (Libro libro : libros){
            res += libro.getCantLibros();
        }
        return res;
    }

    @Override
    public int getLibrosDisponibles(RequisitoEspecial ff) {
        int res = 0;
        for (Libro libro : libros){
            res += libro.getLibrosDisponibles(ff);
        }
        return res;
    }

    @Override
    public int getPorcentajeLibros(RequisitoEspecial ff) {
        int porcentaje = 0;
        int cant = 0;
        for (Libro libro : libros){
            porcentaje += libro.getPorcentajeLibros(ff);
            cant += libro.getCantLibros();
        }
        return porcentaje / cant;
    }


}
