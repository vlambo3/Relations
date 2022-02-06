/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Skpo
 */
public class ServicioJugador {

    public static boolean disparar(Jugador jugador, Revolver revolver) {
        if (ServicioRevolver.mojar(revolver)) {
            jugador.setMojado(true);
        } else {
            ServicioRevolver.siguienteChorro(revolver);
        }
        return jugador.isMojado();
    }

    public static void crear(ArrayList<Jugador> jugadores) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cantidad de jugadores");
        int n = leer.nextInt();
        if (n > 6 || n < 1) {
            n = 6;
        }
        for (int i = 0; i < n; i++) {
            Jugador jugador = new Jugador();
            System.out.println("Ingrese nombre del jugador");
            String auxNombre = leer.next();
            jugador.setId(i + 1);
            jugador.setNombre(auxNombre + " " + (i + 1));
            jugadores.add(jugador);
        }
    }

}
