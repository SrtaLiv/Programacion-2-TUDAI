package Practicos.Practico1.src;
import java.time.LocalDate;

public class ej1_PersonaMain {
        public static void main(String[] args) {
            //CLASES (MOLDES)
            Persona a = new Persona(1023);
            Persona b = new Persona(234, "Olivia", "Todesco");
            Persona c = new Persona(23324, "Bardo", "Lol", LocalDate.of(2020, 1, 1));

            //Llamamos al metodo get imc con peso/altura^2
            a.setPeso(90);
            a.setAltura(2);

            System.out.println("INDICE CORPORAL: " + a.getIMC());
            System.out.println("¿LA PERSONA ESTA EN FORMA? -> " + a.getForma());
            System.out.println("ES > DE 16 ANIOS? -> " + a.getVotar());
            System.out.println("Fecha de nacimiento: " + a.getFechaNacimiento());
            System.out.println("ESTA CUMPLIENDO ANIOS? : " + a.getCumplirAnio());
            System.out.println("LA EDAD ES: " + a.getCalcularEdad());
            System.out.println("ES COHERENTE: " + a.esCoherente());

            //METODO OBTENER DATOS:
            System.out.println("----------------");
            System.out.println("DATOS PERSONALES DE A: " + a.getObtenerDatos()); //DNI, VALORES POR DEFECTO..

            System.out.println("----------------");
            b.setEdad(243);
            System.out.println("EDAD DE B: " + b.getEdad());

            System.out.println("----------------");
            System.out.println("DATOS PERSONALES DE C: " + c.getObtenerDatos()); //DNI, BARDO, LOL, FECHA, MASCULINO


        }

    }

