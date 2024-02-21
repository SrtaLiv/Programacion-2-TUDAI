package Ej3_Electoral;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        SistemaGestion arg = new SistemaGestion("Argentina");
        Candidato c1 = new Candidato("Milei", "A", "1");
        Candidato c11 = new Candidato("Compa Milei", "A", "1");
        Candidato c2 = new Candidato("Patricia", "B", "2");
        Candidato c3 = new Candidato("Macri", "C", "3");
        Candidato c4 = new Candidato("Patricia", "C", "3");

        Mesa m1 = new Mesa("Escuela Normal");
        /*mesas especiales que no pertenezcan a
        un establecimiento educativo sino al barrio o localidad directamente.*/

        //VOTANTES EJEMPLOS
        Votante oli = new Votante(234);
        Votante agu = new Votante(213);
        Votante ma = new Votante(23);
        Votante pa = new Votante(123);

        m1.agregarVotanteAlPadron(oli);
        m1.agregarVotanteAlPadron(agu);
        m1.agregarVotanteAlPadron(ma);

        Condicion co = new CondicionPadron(m1);
        System.out.println(m1.buscar(co));

        Comparator<Candidato> nombre = new ComparadorNombre();
        Comparator<Candidato> politico = new ComparadorPartidoPolitico();
        Comparator<Candidato> agrupacion = new ComparadorAgrupacion();
        ComparadorCompuesto co1 = new ComparadorCompuesto(nombre, politico);

        ComparadorCompuesto co2 = new ComparadorCompuesto(co1, agrupacion);

        //Candidatos del sistema
        arg.agregarCandidatos(c1);
        arg.agregarCandidatos(c11);
        arg.agregarCandidatos(c2);
        arg.agregarCandidatos(c3);
        arg.agregarCandidatos(c4);

        //Votar
        m1.votar(oli, new Voto(c2, LocalDateTime.now()));
        m1.votar(agu, new Voto(null,  LocalDateTime.now()));
        m1.votar(ma, new Voto(c2, LocalDateTime.now()));

        m1.votar(oli, new Voto(c1, LocalDateTime.now()));
        m1.votar(agu, new Voto(c1,  LocalDateTime.now()));
        m1.votar(ma, new Voto(c1, LocalDateTime.now()));

        // 1) Calcular porcentaje de votos para un candidato particular
        double porcentajeVotosCandidato1 = m1.calcularPorcentajeVotosCandidato(c1);
        System.out.println("Porcentaje de votos para " + c1.getNombre() + ": " + porcentajeVotosCandidato1 + "%");

        double porcentajeVotosCandidato2 = m1.calcularPorcentajeVotosCandidato(c2);
        System.out.println("Porcentaje de votos para " + c2.getNombre() + ": " + porcentajeVotosCandidato2 + "%");

    }
}