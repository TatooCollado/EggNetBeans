/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooutilityejextra2;

import Entity.Ahorcado;
import Service.AhorcadoService;

/**
 *
 * @author Camil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AhorcadoService as1 = new AhorcadoService();
       Ahorcado a = new Ahorcado();
       as1.juego(a);       
    }
    
}
