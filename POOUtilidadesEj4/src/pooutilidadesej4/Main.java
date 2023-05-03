/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooutilidadesej4;

import Service.FechaService;

/**
 *
 * @author Camil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService f = new FechaService();
        System.out.println(f.FechaNacimiento());
        System.out.println(f.FechaActual());       
        System.out.println(f.Referencia());
    }
    
    
}
