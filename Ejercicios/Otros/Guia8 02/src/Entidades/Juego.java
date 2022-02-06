package Entidades;


import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;

    private Revolver revolver;

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }   
}
