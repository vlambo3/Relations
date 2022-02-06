/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author Vanina
 */
public class Revolver {
    private Integer posActual;
    private Integer posAgua;

    public Revolver() {
    }

    public Revolver(Integer posActual, Integer posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    
    
}
