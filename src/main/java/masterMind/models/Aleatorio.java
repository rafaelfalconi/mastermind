package masterMind.models;

public class Aleatorio {
    private String combinacion = "";

    public String generar(int repeticion) {
        for (int i = 0; i < repeticion; i++) {
            int aleatorio = (int) (Math.random() * (5-0) );
            combinacion = combinacion + (Color.values()[aleatorio]);
        }
        return combinacion;
    }
}
