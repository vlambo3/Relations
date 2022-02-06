/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.ArrayList;

/**
 *
 * @author Vanina
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private ArrayList<Perro> perros;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer dni, ArrayList<Perro> perros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perros = perros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perros=" + perros + '}';
    }
    
    
    
    
}
