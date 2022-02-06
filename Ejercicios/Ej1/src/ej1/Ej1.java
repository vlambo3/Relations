/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Perro pe1 = new Perro("Chiquito", "Beagle", 2, "pequeño");
        Perro pe2 = new Perro("Branca", "Labradora", 12, "grande");

        ArrayList<Perro> aux = new ArrayList();
        aux.add(pe1);
        aux.add(pe2);

        Persona p1 = new Persona("Cuellar", "Lee", 39, 39000, aux);
        Persona p2 = new Persona("Godoy", "Vanina", 39, 39001, aux);

        System.out.println("Ingrese su nombre");
        String nombreAux = sc.next();

        if (p1.getNombre().equalsIgnoreCase(nombreAux)) {
            System.out.println("Que perro desea adoptar (Chiquito/Branca)");
            String perroAux = sc.next();

            for (Perro perro : p1.getPerros()) {
                if (perro.equals(perroAux)) {
                    System.out.println("Adoptó el perro");
                    p1.getPerros().remove(pe2);
                    System.out.println(p1 + "\n" + p2);
                } else {
                    System.out.println("Adoptó el perro");
                    p1.getPerros().remove(pe1);
                    System.out.println(p1 + "\n" + p2);
                }

            }
        } else {
            System.out.println("Que perro desea adoptar (Chiquito/Branca)");
            String perroAux1 = sc.next();
            for (Perro perro : p2.getPerros()) {
                if (perro.equals(perroAux1)) {
                    System.out.println("Adoptó el perro");
                    p2.getPerros().remove(pe2);
                    System.out.println(p2 + "\n" + p1);
                } else {
                    System.out.println("Adoptó el perro");
                    p2.getPerros().remove(pe1);
                    System.out.println(p2 + "\n" + p1);
                }

            }

        }

    }
}
