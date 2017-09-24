package masterMind.models;

class Turno {
    private int valor = 0;

    public Turno() {
        valor = 0;
    }

    public Jugador escoger() {
        return Jugador.values()[valor];
    }

    public void cambiar() {
        valor = (valor + 1) % (Jugador.values().length - 1);
    }

}
