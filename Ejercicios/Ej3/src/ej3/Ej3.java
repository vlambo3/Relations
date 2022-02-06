/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Entity.Baraja;
import Enum.TipoDeCartas;
import Service.BarajaService;
import java.util.Collections;

/**
 *
 * @author Vanina
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarajaService barajaService = new BarajaService();
        //ServicioBaraja.menu
        Baraja baraja = barajaService.crearBaraja();
        barajaService.llenarBaraja(baraja);
        System.out.println(baraja);

//        Collections.sort(baraja.getCartas(),Baraja.compararPorNumero);
        
        System.out.println("Cantidad de cartas:" + baraja.getCartas().size());
        System.out.println("----------");
        
        barajaService.siguienteCarta(baraja);
        System.out.println("----------");
        
        barajaService.cartasDisponibles(baraja);
        System.out.println("----------");
                
        barajaService.darCartas(baraja);//40
        System.out.println("----------");//6 --> 34
        
        barajaService.mostrarCartasMaso(baraja, 0, 0);
        System.out.println("----------");//8 -->32
        
//        barajaService.mostrarBaraja(baraja);
//        System.out.println("----------");
//        
//        barajaService.cartasMonton(baraja);
    }

}
