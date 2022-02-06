package Main;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;
import Servicio.Servicio;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Perro p1 = new Perro();
        Perro p2 = new Perro();

        Servicio.cargarPerro(p1);
        Servicio.cargarPerro(p2);

        Persona per1 = new Persona();
        Persona per2 = new Persona();

        Servicio.cargarPersona(per1, p1);
        Servicio.cargarPersona(per2, p2);
        System.out.println(" ");
        System.out.println("La persona 1 queda: ----");
        Persona.mostrar(per1);
        System.out.println(" ");
        System.out.println("La persona 2 queda: ----");
        Persona.mostrar(per2);
        
        
    }
}
