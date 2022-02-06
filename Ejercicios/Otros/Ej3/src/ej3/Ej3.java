/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.ArrayList;

/**
 *
 * @author Vanina
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       

        ArrayList<Carta> cartas = new ArrayList();
        ServicioBaraja.crearBaraja(cartas);
        System.out.println("********");
        
        ServicioBaraja.barajar(cartas);
//        ServicioBaraja.siguienteCarta(cartas);
        ServicioBaraja.siguienteCarta(cartas);
        ServicioBaraja.cartasDisponibles(cartas);
        
        
    }
    
    
}
