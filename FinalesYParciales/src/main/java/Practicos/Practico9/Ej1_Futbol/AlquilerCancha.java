package Practicos.Practico9.Ej1_Futbol;

import java.time.LocalDate;

public class AlquilerCancha {
    //Atributos
        private LocalDate fecha;
        private int id;
        private double precio;

        //Constructor
            public AlquilerCancha(LocalDate fecha, int id, double precio) {
                this.fecha = fecha;
                this.id = id;
                this.precio = precio;
            }

            //Metodos
                public LocalDate getFecha() {
                    return fecha;
                }
                public void setFecha(LocalDate fecha) {
                    this.fecha = fecha;
                }
                public int getId() {
                    return id;
                }
                public void setId(int id) {
                    this.id = id;
                }
                public double getPrecio() {
                    return precio;
                }
                public void setPrecio(double precio) {
                    this.precio = precio;
                }

                public String toString(){
                    return fecha + "/" + id + "/" + precio;
                }
}
