package Ej1_Futbol;
import java.util.ArrayList;

public class Socio implements Comparable<Socio>{
    //Atributos
        private String nombre;
        private String apellido;
        private int edad;
        private boolean ultimaCuota;
        private ArrayList<AlquilerCancha> canchasAlquiladas;

        //Constructor
            public Socio(String nombre, String apellido, int edad, boolean ultimaCuota) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.edad = edad;
                this.ultimaCuota = ultimaCuota;
                this.canchasAlquiladas = new ArrayList<>();
            }

            //Metodos
                public String getNombre() {
                    return nombre;
                }

                public void setNombre(String nombre) {
                    this.nombre = nombre;
                }

                public String getApellido() {
                    return apellido;
                }

                public void setApellido(String apellido) {
                    this.apellido = apellido;
                }

                public int getEdad() {
                    return edad;
                }

                public void setEdad(int edad) {
                    this.edad = edad;
                }

                public boolean isUltimaCuota() {
                    return ultimaCuota;
                }

                public void setUltimaCuota(boolean ultimaCuota) {
                    this.ultimaCuota = ultimaCuota;
                }

                public ArrayList<AlquilerCancha> getCanchasAlquiladas() {
                    return new ArrayList<>(canchasAlquiladas);
                }

                public void addCanchaAlquilada(AlquilerCancha cancha) {
                    boolean encontrado = false;
                    int i = 0;
                    while(i < canchasAlquiladas.size() && !encontrado){
                        if(canchasAlquiladas.get(i).getFecha() == cancha.getFecha()){
                            encontrado = true;
                        }
                        i++;
                    }
                    if(encontrado){
                        this.canchasAlquiladas.add(i, cancha);
                    } else{
                        this.canchasAlquiladas.add(cancha);
                    }
                }

                public String toString(){
                    return nombre + " " + apellido + "\n" + "Edad: " + edad + "\n" 
                    + "Pagó última cuota?: " + ultimaCuota + "\n" + "Canchas Alquiladas: " 
                    + getCanchasAlquiladas() + "\n";
                }

                @Override
                public int compareTo(Socio otro) {
                    // int res = this.getApellido().compareTo(otro.getApellido());
                    // if (res!=0){
                    //     return res;
                    // } else {
                    //     return this.getNombre().compareTo(otro.getNombre());
                    // }

                    return this.getNombre().compareTo(otro.getNombre());
                }

                public int contarCanchas(int param) {
                    int contador = 0;
                    for(int i = 0; i < canchasAlquiladas.size(); i++){
                        if(canchasAlquiladas.get(i).getId() == param){
                            contador++;
                        }
                    }
                    return contador;
                }

                public int canchaPrecio(int param) {
                    int encontro = 0;
                    for(int i = 0; i < canchasAlquiladas.size(); i++){
                        if(canchasAlquiladas.get(i).getPrecio() > param){
                            encontro = 1;
                            return encontro;
                        }
                    }
                    return encontro;
                }

                public int obtenerCuota() {
                    if(ultimaCuota){
                        return 1;
                    } else{
                        return 0;
                    }
                }
}