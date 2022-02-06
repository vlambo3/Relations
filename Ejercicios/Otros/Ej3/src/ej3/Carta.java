/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author Vanina
 */
public class Carta {
    
    private Integer num;
    private EnumPalo palo; //String puede ser objeto T --> es decir que es genérico

    public Carta() {
    }

    public Carta(Integer num, EnumPalo palo) {
        this.num = num;
        this.palo = palo;
    }   

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public EnumPalo getPalo() {
        return palo;
    }

    public void setPalo(EnumPalo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palo=" + palo + '}';
    }
    
    
}
