package Practicos.practico2.EJ2.AgendaPersonal;

public class Reunion {
    private String lugar;
    private Practicos.practico2.EJ2.AgendaPersonal.Usuario[] usuarios;
    private String tema;
    private int duracion;

    public Reunion(String lugar, String tema, int duracion) {
        this.lugar = lugar;
        this.usuarios = new Practicos.practico2.EJ2.AgendaPersonal.Usuario[0]; //por defecto empieza en cero
        this.tema = tema;
        this.duracion = duracion;
    }

    //METODO PARA AGREGAR PARTICIPANTES
    public void addUsuario(Practicos.practico2.EJ2.AgendaPersonal.Usuario usuario) {
        int posicion = -1;
        for(int i = 0; i < this.usuarios.length; i++) {
            if(this.usuarios[i] == null) { //se actualiza la variable posicion con el valor de i.
                // Esto es importante para saber dónde agregar el nuevo participante.
                posicion = i;
            }
        }
        if (posicion != -1) {
            this.usuarios[posicion] = usuario;
        }
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Practicos.practico2.EJ2.AgendaPersonal.Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
