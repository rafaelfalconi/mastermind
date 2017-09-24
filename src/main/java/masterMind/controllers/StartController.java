package masterMind.controllers;

import masterMind.models.Combinacion;
import masterMind.models.Tablero;
import masterMind.utils.IO;
import masterMind.utils.LimiteDeDialogo;

public class StartController {
    private Tablero tablero;

    IO io = new IO();

    public void interactuar() {

        io.writeln("1. Partida");
        io.writeln("2. Demo");
        if (this.seleccionar() == 1) {
            this.jugarPartida();
        }
        if (this.seleccionar() == 2) {
            this.jugarDemo();
        }

    }

    int seleccionar() {
        int opcion;
        return opcion = new LimiteDeDialogo("opción?", 1, 2).read();
    }

    public void jugarPartida() {
        int turnos = 0;
        Combinacion secreto = new Combinacion();
        Combinacion intentos = new Combinacion();
        secreto.setSecreto();
        String intento = "";
        boolean flag = false;
        do {
            if (turnos == 10) {
                flag = true;
            }
            intento = io.readString("Intento[cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul,B-blanco, N-negro]");
            intentos.setCombinacion(intento);
            tablero = new Tablero(secreto, intentos);
            flag = tablero.resuelto();
            io.writeln(tablero.intento());
            if(flag==false) {
                io.writeln(tablero.intento());
            }
            turnos++;
        } while (false);
        
    }

    public void jugarDemo() {
        
        int turnos = 0;
        Combinacion secreto = new Combinacion();
        Combinacion intentos = new Combinacion();
        secreto.setSecreto();
        
        boolean flag = false;
        do {
            if (turnos == 10) {
                flag = true;
            }
            
            
            intentos.setSecreto();
            io.writeln("la computador prueba con la siguiente combinación "+intentos.getCombinacion());
            tablero = new Tablero(secreto, intentos);
            flag = tablero.resuelto();
            io.writeln(tablero.intento());
            if(flag==false) {
                io.writeln(tablero.intento());
            }
            turnos++;
        } while (false);
    }

   
}
