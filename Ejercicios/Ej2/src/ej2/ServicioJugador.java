/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class ServicioJugador {

    public static Boolean disparo(Revolver r, Jugador jugador) {
        if (ServicioRevolver.mojar(r)) {
            jugador.setMojado(true); // duda es TRUE?
        } else {
            ServicioRevolver.siguienteChorro(r);            
        }
        return jugador.getMojado();
    }
    
    public static void crear(ArrayList<Jugador> jugadores, Jugador jugador) {
        Scanner sc = new Scanner(System.in);       
        System.out.println("Ingrese la cantidad de jugadores");
        int n = sc.nextInt();
        
        if (n > 6 || n <= 1) {
            System.out.println("La cantidad de jugadores será de 6");
            n = 6; 
        } 
        
        for (int i = 0; i < n; i++) {
            Jugador jug = new Jugador();                        
            jug.setId(i + 1);
            jug.setNombre("Jugador " + jug.getId());
            jug.setMojado(false);
            jugadores.add(jug);
        }
        
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }
    }
    
    
    

}


