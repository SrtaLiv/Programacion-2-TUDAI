public class AgendaMain {

    public static void imprimir(Agenda agenda){
        System.out.println("EL DUENIO ES:");
    }
    public static void main(String[] args) {
        Agenda ag1 = new Agenda("Bardo");

        Reunion r1 = new Reunion("Maipu", "Culo", 23);
        Reunion r2 = new Reunion("Neco", "Teta", 232);

        Usuario user1 = new Usuario("Pepe", 23, "os0ad.com");
        Usuario user2 = new Usuario("Ca", 2, "koq");

        //AGREGANDO LA REUNION A LA AGENDA
        ag1.addReunion(r1);

        //AGREGANDO LOS PARTICIPANTES A LA REUNION
        r1.addUsuario(user1);
        r1.addUsuario(user2);

        System.out.println(user1.getMail());

    }

}