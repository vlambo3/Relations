/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Skpp
 */
public class ServicioJuego {
    
    public static void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver, Juego juego) {
        juego.setJugadores(jugadores);
        juego.setRevolver(revolver);
    }
    
    public static void ronda(Juego juego) {
        for (Jugador jugador : juego.getJugadores()) {
            if (ServicioJugador.disparar(jugador, juego.getRevolver())) { 
                System.out.println("El jugador " + jugador.getNombre() + " se mojo, k pena.");
                System.out.println(jugador.toString());
                return;
            } else {
                System.out.println("El jugador " + jugador.getNombre() + " safo del agua, le toca al otro.");
//                ServicioRevolver.siguienteChorro(juego.getRevolver());
            }
        }
    }    
    
    public static void juego(ArrayList<Jugador> jugadores,Juego juego) {
        ArrayList<Boolean> mojados = new ArrayList<>();
        for (Jugador elemento : jugadores) {
            mojados.add(elemento.isMojado());
        }
        while (!mojados.contains(true)) {
            ronda(juego);
        }
    }
    
}
