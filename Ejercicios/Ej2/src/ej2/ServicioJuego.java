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
public class ServicioJuego {
    
    public static void llenarJuego(ArrayList<Jugador> jugadores, Revolver r, Juego juego) {
        juego.setJugadores(jugadores);      
        juego.setRevolver(r);
    }
    
    public static void ronda(Juego juego) {
        
        boolean flag = false;
        while (flag == false) {
        for (Jugador jugador : juego.getJugadores()) {
            if (ServicioJugador.disparo(juego.getRevolver(), jugador)) {
                System.out.println("El jugador " + jugador.getNombre() + " se ha mojado ");
                flag = true;
                break;
                
            } else {                
                System.out.println("el jugador " + jugador.getNombre() + " no se mojó");
//                ServicioRevolver.siguienteChorro(revolver);
            }
        }
        }
    }
    
    
    
}
