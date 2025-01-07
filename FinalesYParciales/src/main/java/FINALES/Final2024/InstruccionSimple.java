package FINALES.Final2024;

public class InstruccionSimple {

    private static int consumoFijo = 10;            // atributo de clase
    private static int umbralBateria = 50;          // atributo de clase

    private int consumo;
    private String instruccion;


    public InstruccionSimple(String instruccion, int consumo){
        this.instruccion = instruccion;
        this.consumo = consumo;
    }

    public int getConsumo(){
        
        Kiko.getInstance(); // instancia de singleton
        
        if (Kiko.getInstance().nivelBateria < umbralBateria){
            return this.consumo + consumoFijo * 2;
        }
        return this.consumo + consumoFijo;

    }

}