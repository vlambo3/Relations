/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Enum.TipoDeCartas;

/**
 *
 * @author Vanina
 */
public class Carta {
    private Integer numero;
    private TipoDeCartas tipoDeCartas; //atributo de tipo Enum

    public Carta() {
    }
    public Carta(Integer numero, TipoDeCartas tipoDeCartas) {
        this.numero = numero;
        this.tipoDeCartas = tipoDeCartas;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public TipoDeCartas getTipoDeCartas() {
        return tipoDeCartas;
    }

    public void setTipoDeCartas(TipoDeCartas tipoDeCartas) {
        this.tipoDeCartas = tipoDeCartas;
    }

    @Override
    public String toString() {
        return " tipoDeCartas: " + tipoDeCartas + " numero:" + numero + "\n";               
    }

    
}
