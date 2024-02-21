package Ej1_Agroquimicos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmpresaAgricola emp = new EmpresaAgricola("Empresa");

        ArrayList<String> estado1 = new ArrayList<>();
        estado1.add("Fiebre");
        estado1.add("Dolor de cabeza");
        estado1.add("Mareo");

        ArrayList<String> estado2 = new ArrayList<>();
        estado2.add("Gripe");
        estado2.add("Dolor de panza");
        estado2.add("Vomito");

        ArrayList<String> estado3 = new ArrayList<>();
        estado3.add("Diarrea");
        estado3.add("Vertigo");
        estado3.add("Escalofrio");

        Enfermedad enf1 = new Enfermedad("COVID", estado1);
        Enfermedad enf2 = new Enfermedad("CHICUM", estado2);
        Enfermedad enf3 = new Enfermedad("ASMA", estado3);

        ArrayList<Enfermedad> listadoEnfermedades = new ArrayList<>();
        listadoEnfermedades.add(enf1);
      //  listadoEnfermedades.add(enf2);

        ArrayList<Enfermedad> listadoEnfermedades2 = new ArrayList<>();
        listadoEnfermedades2.add(enf1);
        listadoEnfermedades2.add(enf3);

        ArrayList<Enfermedad> listadoEnfermedades3 = new ArrayList<>();
        listadoEnfermedades3.add(enf2);
        listadoEnfermedades3.add(enf3);

        ArrayList<Cultivo> listadoCultivos = new ArrayList<>();
        listadoCultivos.add(new Cultivo("Maiz", listadoEnfermedades));
        listadoCultivos.add(new Cultivo("Soja", listadoEnfermedades2));
        listadoCultivos.add(new Cultivo("Girasol", listadoEnfermedades3));

        ArrayList<Producto> listadoProductos = new ArrayList<>();
        Producto p1 = new Producto("Paracetamol");
        p1.agregarEstadosPatologicos("Fiebre");
        p1.agregarEstadosPatologicos("Dolor de cabeza");
        p1.agregarEstadosPatologicos("Mareo");
        p1.agregarCultivoDesaconsejado(new Cultivo("Soja", listadoEnfermedades));

        Producto p2 = new Producto("Amoxi");
        p2.agregarEstadosPatologicos("Diarrea");
        p2.agregarEstadosPatologicos("Vertigo");
        p2.agregarEstadosPatologicos("Escalofrio");
        p2.agregarCultivoDesaconsejado(new Cultivo("Maiz", listadoEnfermedades2));

        emp.agregarProductosQuimicos(p1);
        emp.agregarProductosQuimicos(p2);

        emp.listadoProductos(enf1);
        emp.listadoProductos(enf2);
        emp.listadoProductosNoDesaconsejado(enf1, new Cultivo("Girasol", listadoEnfermedades));

    }
}
