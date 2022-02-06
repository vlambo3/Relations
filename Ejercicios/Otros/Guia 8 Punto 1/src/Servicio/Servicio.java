package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

public class Servicio {
    
    static Scanner leer = new Scanner(System.in);
    
    public static Perro cargarPerro(Perro p) {
        System.out.print("Ingresar el nombre del perro ");
        p.setNombre(leer.next());
        System.out.print("Ingresar su raza: ");
        p.setRaza(leer.next());
        System.out.print("Ingresar la edad: ");
        p.setEdad(leer.nextInt());
        System.out.print("Ingresar su tamaño: ");
        p.setTamaño(leer.next());
        
        return p;
        
    }
    
    public static Persona cargarPersona(Persona per, Perro p) {
        
        System.out.print("Ingresar el nombre de la persona: ");
        per.setNombree(leer.next());
        System.out.print("Ingresar su apellido: ");
        per.setApellido(leer.next());
        System.out.print("Ingresar su edad: ");
        per.setEdadd(leer.nextInt());
        System.out.print("Ingresar su documento: ");
        per.setDocumento(leer.nextInt());
        System.out.print("A esta persona le corresponde el perro " + p.getNombre());
        per.setMascota(p);
        
        return per;
        
    }
    
}
