/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Carta;
import Enum.TipoDeCartas;

/**
 *
 * @author Vanina
 */
public class CartaService {
    /*
    voy a crear el OBJETO CARTA
    y le voy a setear los atributos
    y que me retorne la carta
    */
     public Carta crearCarta(int numero, TipoDeCartas tipoDeCartas){ 
        Carta carta = new Carta();
        carta.setNumero(numero);
        carta.setTipoDeCartas(tipoDeCartas);
        return carta;
    }
}
