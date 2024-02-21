public class Cancha {
    String tipoDeporte;
    private double costoPorHora;

    private static final int HORA_FUTBOL = 400;
    private static final int HORA_PADDLE = 100;

    public Cancha(String tipoDeporte, double costoPorHora) {
        this.tipoDeporte = tipoDeporte; //FUTBOL O PADDLE
        this.costoPorHora = costoPorHora;
    }

    public double calcularCosto(int horas) {
        return costoPorHora * horas;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

}