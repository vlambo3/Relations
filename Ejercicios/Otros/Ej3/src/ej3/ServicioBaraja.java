/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.shuffle;
import java.util.List;

/**
 *
 * @author Vanina
 */
public class ServicioBaraja {

//    public static void barajar (ArrayList<Carta> baraja) {
//        
//        Collections.shuffle(baraja);
//        
//        System.out.println(baraja);
//        
//    }
    
    public static ArrayList<Carta> crearBaraja(ArrayList<Carta> cartas) {

//        ArrayList<Carta> cartas = new ArrayList();

        for (EnumPalo aux : EnumPalo.values()) {

            for (int i = 0; i < 10; i++) {
                
                Carta cartaObj = new Carta();
                
                if (i >= 0 && i < 7) {
                    
                    cartaObj.setNum(i + 1);

                    if (aux.ordinal() == 0) {
                        cartaObj.setPalo(EnumPalo.values()[0]);
                    }
                    if (aux.ordinal() == 1) {
                        cartaObj.setPalo(EnumPalo.values()[1]);
                    }
                    if (aux.ordinal() == 2) {
                        cartaObj.setPalo(EnumPalo.values()[2]);
                    }
                    if (aux.ordinal() == 3) {
                        cartaObj.setPalo(EnumPalo.values()[3]);
                    }

                    System.out.println(cartaObj);
                    cartas.add(cartaObj);

                } else {
                    cartaObj.setNum(i + 3);
                if (aux.ordinal() == 0) {
                    cartaObj.setPalo(EnumPalo.values()[0]);
                }
                if (aux.ordinal() == 1) {
                    cartaObj.setPalo(EnumPalo.values()[1]);
                }
                if (aux.ordinal() == 2) {
                    cartaObj.setPalo(EnumPalo.values()[2]);
                }
                if (aux.ordinal() == 3) {
                    cartaObj.setPalo(EnumPalo.values()[3]);
                }
                System.out.println(cartaObj);
                cartas.add(cartaObj);
            }

        }
        System.out.println("-----------------------");
        System.out.println(cartas);
    }
        return cartas;
}
    
    public static void barajar(ArrayList<Carta> cartas) {
        Collections.shuffle(cartas);
        System.out.println(cartas);
        System.out.println("Las cartas se han barajado!");
    }
    
    public static void siguienteCarta(ArrayList<Carta> cartas) {
        System.out.println("-----");
        System.out.println("La siguiente carta es:");
        
        Carta cartaVer = cartas.get(0);        
        System.out.println(cartaVer.toString());
        cartas.remove(0);
    }
    
    public static void cartasDisponibles(ArrayList<Carta> cartas) {
        System.out.println("Cant cartas sin la otra");
        System.out.println(cartas.size());
    }
    
    
}
