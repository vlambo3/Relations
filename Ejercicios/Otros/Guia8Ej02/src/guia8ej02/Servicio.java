package guia8ej02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Servicio {

    static Scanner leer = new Scanner(System.in);

    public static ArrayList crearJugador() {
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Cuantos jugadores van a jugar?");
        int num = leer.nextInt();
        if (num > 6 || num < 1) { //por defecto
            num = 6;
        }
        for (int i = 0; i < num; i++) {
            Jugador jugador = new Jugador();
            jugador.setIdJugador(i + 1); //1 al 6 seteo automatico
            System.out.println("Ingrese el nombre del jugador " + (i + 1));
            jugador.setNombre("Jugador: " + jugador.getIdJugador() + " - " + leer.next());
            jugador.setMojado(false); //seteo automatico
            jugadores.add(jugador);  //PROBLEMA - ERROR
        }
        return jugadores;
    }

    //seteamos la posicion inicial de la rueda y donde esta el disparo
    public static Revolver crearRevolver() {
        Revolver revolver = new Revolver();
        Integer pos = (int) (Math.random() * 6) + 1; //devolvemos entre 1 y 6
        revolver.setPosActual(pos);
        Integer pos2 = (int) (Math.random() * 6) + 1; //devolvemos entre 1 y 6
        revolver.setPosTamborAgua(pos2);
        return revolver;
    }

    //devuelve true si la posición del agua coincide con la posición actual
    public static boolean mojar(Revolver r) {
        boolean mojar = false;
        if (r.getPosActual() == r.getPosTamborAgua()) {
            mojar = true;
        }
        return mojar;
    }

    //siguienteChorro(): cambia a la siguiente posición del tambor (posActual)
    public static void siguienteChorro(Revolver r) {
        if (r.getPosActual() < 6) {
            r.setPosActual(r.getPosActual() + 1);
        } else {
            r.setPosActual(1);
        }
    }

    /*
    disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
     */
    public static boolean disparo(Revolver r, Jugador jug) {
        
        System.out.println("\nApuntando... y... Disparando al jugador "+jug.getNombre()+"!!!");
        if (mojar(r)) {
            jug.setMojado(true); //le setea true al jugador i que le enviamos desde ronda

        } else {
            siguienteChorro(r); //sube en uno la ruleta rusa
            jug.setMojado(false);
        }

        return jug.isMojado(); //getMojado
    }

    /*
    llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
     */
    public static void llenarJuego(Juego juego) {
        juego.setJugadores(crearJugador());
        juego.setRevolver(crearRevolver());
    }

    /*
    ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
     */
    public static void ronda(Juego juego) {
        Revolver revolver = juego.getRevolver();
        ArrayList<Jugador> jugadores = juego.getJugadores();
        
        boolean bandera = false;
        
            for (Jugador i : jugadores) {
                if (disparo(revolver, i)) {
                    System.out.println("\nEl jugador " + i.getNombre() + " fue mojado y eliminado");
                    System.out.println("\nFIN DEL JUEGO");
                    bandera = true;
                    break;
                } else {
                    System.out.println("\nZafó... " + i.getNombre() + " aún sigue vivo");
                    siguienteChorro(revolver);
                }
            }
            
            if (bandera == false){
                System.out.println("TUVIERON SUERTE, TODOS SIGUEN VIVOS!. FIN DEL JUEGO");
            }
   
        
    }
}
