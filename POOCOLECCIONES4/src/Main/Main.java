/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entity.Pelicula;
import Service.PeliculaService;
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
        PeliculaService ps1 = new PeliculaService();
        ArrayList <Pelicula> p = ps1.crearPelicula();
        ps1.menu();
    }
    
}
