/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.Objects;

/**
 *
 * @author Vanina
 */
public class ServicioRevolver {
    
    public static void llenarRevolver(Revolver revolver) {        
        int aux = (int) (Math.random() * 6 + 1);
        revolver.setPosActual(aux);
        
        aux = (int) (Math.random() * 6 + 1);
        revolver.setPosAgua(aux);        
    }
    
    public static boolean mojar(Revolver revolver) {        
        return Objects.equals(revolver.getPosActual(), revolver.getPosAgua());        //devuelve TRUE si la posAgua == posActual
    }
    
    public static void siguienteChorro(Revolver revolver) {
        if (revolver.getPosActual() > 6) { // cambié == por >
            revolver.setPosActual(1);
        } else {
            revolver.setPosActual(revolver.getPosActual() + 1);
        }
    }
    
}
