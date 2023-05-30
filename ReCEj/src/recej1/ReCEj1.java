/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recej1;

import Entity.Persona;
import Service.MascotaService;
import java.util.ArrayList;

/**
 *
 * @author Camil
 */
public class ReCEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Persona> p1;
        MascotaService ms1 = new MascotaService();
        p1 = ms1.crearPersona();
    }
    
}
