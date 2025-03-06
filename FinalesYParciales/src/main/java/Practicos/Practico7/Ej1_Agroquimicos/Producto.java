package Practicos.Practico7.Ej1_Agroquimicos;

import java.util.ArrayList;

public class Producto implements Tratable{
    String nombre;
    ArrayList<Cultivo> cultivosDesaconsejados;
    ArrayList<String> estadosPatologicos;

    public Producto(String nombre) {
        this.nombre = nombre;
        this.cultivosDesaconsejados = new ArrayList<>();
        this.estadosPatologicos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cultivo> getCultivosDesaconsejados() {
        return cultivosDesaconsejados;
    }

    public void setCultivosDesaconsejados(ArrayList<Cultivo> cultivosDesaconsejados) {
        this.cultivosDesaconsejados = cultivosDesaconsejados;
    }

    public ArrayList<String> getEstadosPatologicos() {
        return estadosPatologicos;
    }

    public void setEstadosPatologicos(ArrayList<String> estadosPatologicos) {
        this.estadosPatologicos = estadosPatologicos;
    }

    @Override
    public boolean esTratable(Enfermedad enfermedad) {
        int contadorEstados = 0;
        for (String estadoPatologico: estadosPatologicos) {

            for (String enfer: enfermedad.getEstadosPatologicos()) {
                if (enfer.equalsIgnoreCase(estadoPatologico)) {
                    contadorEstados++;
                }
            }
        }
        if (contadorEstados == enfermedad.getEstadosPatologicos().size()) {
            return true;
        } else return false;
    }

    @Override
    public boolean esTratable(Enfermedad e, Cultivo c) {
        boolean curaEnfermedad = esTratable(e);
        boolean contieneCultivo = cultivosDesaconsejados.contains(c);
        if (!(curaEnfermedad && contieneCultivo)){
            return false;
        } else return true;
    }

    @Override
    public String toString() {
       return nombre;
    }

    public void agregarCultivoDesaconsejado(Cultivo c){
        this.cultivosDesaconsejados.add(c);
    }

    public void agregarEstadosPatologicos(String estado){
        this.estadosPatologicos.add(estado);
    }
}
