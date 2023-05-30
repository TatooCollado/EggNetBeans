/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recej2;

import Entity.Jugador;
import Service.RevolverService;
import java.util.ArrayList;

/**
 *
 * @author Camil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RevolverService rs1 = new RevolverService();
        ArrayList <Jugador> a1 = rs1.crearJugadores();        
        rs1.ronda(a1);
    }
    
}
