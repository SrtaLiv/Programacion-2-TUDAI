package CLASES.CLASE9;

public class CondicionLaboratorio extends Condicion{
    private String nombreBuscado;

    public CondicionLaboratorio(String nombreBuscado) {
        this.nombreBuscado = nombreBuscado.toLowerCase();
    }

    @Override
    public boolean cumple(Medicamento medicamento) {
        return medicamento.getLaboratorio().toLowerCase().equals(nombreBuscado);
    }
}
