public class Agenda {
    private Reunion[] reuniones;
    private String duenio;

    public Agenda(String duenio) {
        this.reuniones = new Reunion[0]; //por defecto
        this.duenio = duenio;
    }

    //responsabiliad agregar reuniones
    public void addReunion(Reunion newReunion) {
        int posicion = -1;
        for(int i = 0; i < this.reuniones.length; i++) {
            if (this.reuniones[i] == null) {
                posicion = i;
            }
        }
        if (posicion != -1) {
            reuniones[posicion] = newReunion;
        }
    }

}
