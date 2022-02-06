/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import Entidades.ServicioJuego;
import Entidades.ServicioJugador;
import Entidades.ServicioRevolver;
import java.util.ArrayList;

/**
 *
 * @author Skpo
 */
public class Main8_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Revolver revolver = new Revolver();
        Juego juego = new Juego();
        
        ServicioRevolver.llenarRevolver(revolver);
        
        ServicioJugador.crear(jugadores);
        
        ServicioJuego.llenarJuego(jugadores, revolver, juego);
        
        ServicioJuego.juego(jugadores, juego);
        
    }
    
}
