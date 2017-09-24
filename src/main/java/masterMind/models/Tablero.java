package masterMind.models;

import java.util.ArrayList;

import masterMind.utils.IO;

public class Tablero {
    private Combinacion secreto;

    private Combinacion intento;

    public Tablero(Combinacion secreto, Combinacion intento) {
        super();
        this.secreto = secreto;
        this.intento = intento;
    }

    ArrayList<Integer> muertos() {
        ArrayList<Integer> muertos = new ArrayList<Integer>();
        for (int i = 0; i < Combinacion.DIMENSION; i++) {
            if (intento.getCombinacion().charAt(i) == secreto.getCombinacion().charAt(i)) {
                muertos.add(i);
            }
        }
        return muertos;
    }

    public String intento() {
        ArrayList<Integer> muertos = this.muertos();
        int heridos = 0;
        for (int i = 0; i < Combinacion.DIMENSION; i++) {
            for (int j = 0; j < Combinacion.DIMENSION; j++) {
                if (i == j) {

                }
                if (muertos.contains(i) || muertos.contains(j)) {

                }
                if (intento.getCombinacion().charAt(i) == secreto.getCombinacion().charAt(j)) {
                    heridos++;
                }
            }
        }
        return " " + muertos.size() + " muertos " + heridos + " heridos";

    }

    public boolean resuelto() {
        IO io = new IO();

        if (intento.getCombinacion() == secreto.getCombinacion()) {
            io.writeln("ganaste");
            return true;
        }

        return false;

    }

}
