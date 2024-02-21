package Ej3_Electoral;

import java.time.LocalDateTime;

public class Voto {
    private LocalDateTime horaEmision;
    private Candidato candidato;

    public Voto( Candidato candidato, LocalDateTime horaEmision) {
        this.horaEmision = horaEmision;
        this.candidato = candidato;
    }

    public Candidato getCandidato() {
        return candidato;
    }
}
