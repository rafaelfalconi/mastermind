package masterMind.models;

import masterMind.utils.Longitud;

public class Combinacion {
    private masterMind.utils.Combinacion combinacion;

    public static final int DIMENSION = 4;

    private static final Longitud LIMITE = new Longitud(4);

    public Combinacion() {
        combinacion = new masterMind.utils.Combinacion();
    }

    public Combinacion(String colores) {
        super();
        this.setCombinacion(colores);
    }

    public Combinacion(Combinacion combinacion) {
        this(combinacion.combinacion.getCombinacion());
    }

    public void setCombinacion(String colores) {
        assert LIMITE.incluye(colores);
        combinacion.setCombinacion(colores);
    }

    public void setSecreto() {
        Aleatorio aleeatorio = new Aleatorio();
        this.setCombinacion(aleeatorio.generar(4));
    }

    public String getCombinacion() {
        return combinacion.getCombinacion();
    }

}
