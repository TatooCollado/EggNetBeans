/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocollections5;

import Entity.Pais;
import Service.PaisService;
import java.util.HashSet;

/**
 *
 * @author Camil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisService ps1 = new PaisService();
        HashSet<Pais> p = ps1.crearPais();
        ps1.ordenar(p);
        ps1.eliminar(p);
    }
    
}
