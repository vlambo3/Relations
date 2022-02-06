/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Vanina
 */
public class Baraja {
    private String nombre;
    private List<Carta> cartas; //atributo lista de objetos

    public Baraja() {
    }

    public Baraja(String nombre, List<Carta> cartas) {
        this.nombre = nombre;
        this.cartas = cartas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "nombre=" + nombre + 
                " cartas=" + "\n" + " " + cartas + '}';
    }
    
    /* 
    uso el comparataro para mostrarlos ordenados
    porque estoy usando un random para llenar la lista
    y quiero controlar que no falte ninguno
    */
    public static Comparator<Carta> compararPorNumero = (Carta o1, Carta o2) -> o1.getNumero().compareTo(o2.getNumero());
}
