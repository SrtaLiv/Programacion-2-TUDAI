import java.time.LocalDate;
import java.time.Month;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int edad;
    private String sexo;
    private int altura;
    private double peso;
    LocalDate actual = LocalDate.now();



    //CONSTRUCTORES
    public Persona(int dni) {
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.edad = 1;
        this.sexo = "Femenino";
        this.altura = 1;
        this.peso = 1;
        this.fechaNacimiento = LocalDate.of(2000, Month.AUGUST, 16);
    }

    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        edad = getCalcularEdad();
    }

    //METODOS Getters y Setters
    public int getDni() {
        return dni;
    }

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public int getCalcularEdad() {
        return actual.getYear() - fechaNacimiento.getYear();
    }


    //RESPONSABILIDADES
    public double getIMC() {
        return peso / ( altura * altura );
    }
    public boolean getForma() {
        double resultado = getIMC();
        return resultado >= 18.5 && resultado <= 25;
    }
    public boolean getCumplirAnio() {
        return actual.getMonth() == fechaNacimiento.getMonth() &&
                actual.getDayOfMonth() == fechaNacimiento.getDayOfMonth();
    }
    public boolean getVotar(){
        return getCalcularEdad() >= 16;
    }
    public boolean esCoherente() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getYear() - edad == fechaNacimiento.getYear();
    }

    public String getObtenerDatos(){
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nFecha de Nacimiento: " + fechaNacimiento +
                "\nDNI: " + dni +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }
}
