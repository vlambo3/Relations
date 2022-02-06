/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author Skpo
 */
public class ServicioRevolver {

    public static void llenarRevolver(Revolver revolver) {
        int aux = (int) (Math.random() * 6 + 1);
        revolver.setPosAct(aux);
        aux = (int) (Math.random() * 6 + 1);
        revolver.setPosAwa(aux);
    }

    public static boolean mojar(Revolver revolver) {
        return Objects.equals(revolver.getPosAwa(), revolver.getPosAct());
    }

    public static void siguienteChorro(Revolver revolver) {
        revolver.setPosAct(revolver.getPosAct()+1);
        if (revolver.getPosAct() > 6) {
            revolver.setPosAct(1);
        }
    }
}
