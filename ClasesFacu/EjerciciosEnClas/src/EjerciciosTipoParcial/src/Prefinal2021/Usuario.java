package EjerciciosTipoParcial.src.Prefinal2021;

public class Usuario implements Comparable<Usuario>{
    String nombre;
    int anio;
    String email;

    public Usuario(String nombre, int anio, String email) {
        this.nombre = nombre;
        this.anio = anio;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Usuario o) {
        int result = nombre.compareTo(o.getNombre());
        if (result != 0 ) { //no son iguales
            return email.compareTo(o.getEmail());
        }
        return result;
    }
}
