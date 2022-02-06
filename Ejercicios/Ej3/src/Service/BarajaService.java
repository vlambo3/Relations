/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Baraja;
import Entity.Carta;
import Enum.TipoDeCartas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class BarajaService {
    /*
    creo el OBJETO BARAJA
    le setee el nombre, porque van a ser españolas
    por si después quiero hacer unas inglesas
    */
    public Baraja crearBaraja(){
        Baraja baraja = new Baraja();
        baraja.setNombre("Baraja Española");
        return baraja;
    }

    /*
    con este método lleno la baraja, 
    hice tres métodos más: uno para generar los números,     
    otro método para verificar que no haya 8 y 9,
    y otro para verificar la carta
    */
     public void llenarBaraja(Baraja baraja){
        CartaService cartaService = new CartaService();
        List<Carta> auxCartas = new ArrayList<>();
        while(auxCartas.size()<40){
            Carta carta = cartaService.crearCarta(generarNumero(), TipoDeCartas.randomCartas());
            if(!verificarNumero(carta.getNumero()) && !verificarCarta(carta,auxCartas)){
                auxCartas.add(carta);
            }
        }
        baraja.setCartas(auxCartas);
        auxCartas.sort(compararPorNumero);
    }

    public int generarNumero(){
        return (int) (Math.random()*12) + 1;
    }

    public Boolean verificarNumero(int numero){ // si hay 8 y 9
        return numero == 8 || numero == 9;
    }

    public Boolean verificarCarta(Carta carta, List<Carta> cartasCargadas){
        Boolean condition = false;
        for(Carta aux : cartasCargadas){
            condition = aux.getNumero() == carta.getNumero() && aux.getTipoDeCartas() == carta.getTipoDeCartas();  
            if(condition){                                                                                        
                break;
            }
        }
        return condition;
    }    
      
    public Comparator<Carta> compararPorNumero = (Carta o1, Carta o2) -> o1.getNumero().compareTo(o2.getNumero());

    public void siguienteCarta(Baraja baraja) {      
        System.out.println("La siguiente carta es:");        
        Carta cartaVer = baraja.getCartas().get(0);        
        System.out.println(cartaVer.toString());
//        baraja.getCartas().remove(0);
    }
    
    public void cartasDisponibles(Baraja baraja) {
        System.out.print("Cant cartas disponibles: ");
        System.out.println(baraja.getCartas().size());
    }
    
    public void darCartas(Baraja baraja) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántas cartas desea");
        int n = sc.nextInt();
        int cont = 0;          
        if (baraja.getCartas().size() > n) {            
            while (cont < n) {                                   
                Carta cartaDada = baraja.getCartas().get(cont);                
                System.out.println("Su carta " + (cont+1) + " es" + cartaDada.toString());   
                cont ++;                                           
            }      
            int tamaño = baraja.getCartas().size();
            System.out.println("La cantidad de cartas restantes: " + (tamaño - cont));
            removerCartas(baraja, cont, n);     
        } else {
            System.out.println("No hay suficientes cartas disponibles");
        }                         
    }
        
    public void removerCartas(Baraja baraja, int auxCont, int nUsuario) {
         while (auxCont < nUsuario) {                                
            baraja.getCartas().remove(auxCont);
            auxCont ++;   
            }    
    }       
         
    public List crearAux(Baraja baraja, int auxCont, int nUsuario) {        
//        Baraja auxBaraja = new Baraja();        
        baraja.setNombre("Baraja: Maso restante");
        Carta cartaDadaAGuardar = new Carta();
        List<Carta> cartasMaso = new ArrayList<>();
        while (auxCont < nUsuario) {    
            cartaDadaAGuardar = baraja.getCartas().get(auxCont);                                
                auxCont ++;    
            } 
        cartasMaso.add(cartaDadaAGuardar);
        baraja.setCartas(cartasMaso);  
        cartasMaso.sort(compararPorNumero);
        return cartasMaso;
    }    

    public void mostrarCartasMaso(Baraja baraja, int auxCont, int nUsuario) {
        System.out.println("Las cartas que ya salieron:");
        crearAux(baraja, auxCont, nUsuario);        
//        cartasMaso.sort(compararPorNumero);        
    }
    
    public void mostrarBaraja(int auxCont, int nUsuario, Carta cartasMaso) {        
        System.out.println("Las cartas que quedan:");
//        crearAux(auxCont, nUsuario);
        System.out.println();
//        System.out.println("Las nuevas cartas que quedan " + baraja.getCartas().size());
    }
    
    public void menu(Baraja baraja) {
        llenarBaraja(baraja);
        System.out.println(baraja);
        System.out.println("Cantidad de cartas:" + baraja.getCartas().size());
        System.out.println("----------");
        siguienteCarta(baraja);
        System.out.println("----------");
        
        cartasDisponibles(baraja);
        System.out.println("----------");
                
        darCartas(baraja);//40
        System.out.println("----------");       
       
        mostrarCartasMaso(baraja, 0, 0);
        System.out.println("----------");
    }
}
