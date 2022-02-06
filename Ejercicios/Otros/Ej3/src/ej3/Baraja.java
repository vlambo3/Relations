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
public class Baraja {
    private ArrayList<Carta> baraja;

    public Baraja() {
    }
    
    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }

    

    /*
    public static void barajar(ArrayList<Cartas> baraja) {
        barajar(b.getBaraja());
    }
    
    public static void cartasDisponibles(ArrayList<Cartas> baraja) {
     sout("quedan" + baraja.size() + "cartas");
    }
    
    Iterator<Cartas> it = baraja.iterator();
    while(it.hasNext()) {
    if (n == 0) {
    break;
    }
    
    cartasDadas.add(it.next());
    it.remove();
    n--;
    } 
    */

    

    

    
}
