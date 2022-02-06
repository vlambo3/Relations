/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.ArrayList;

/**
 *
 * @author Vanina
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        ArrayList<Jugador> auxJugadores = new ArrayList();
        Jugador jugador = new Jugador();
        Revolver rAux = new Revolver();
        Juego juegoAux = new Juego();
        
        
        ServicioRevolver.llenarRevolver(rAux);
        
        ServicioJugador.crear(auxJugadores, jugador);
        
        ServicioJuego.llenarJuego(auxJugadores, rAux, juegoAux);
        
        ServicioJuego.ronda(juegoAux);    }
    
}
