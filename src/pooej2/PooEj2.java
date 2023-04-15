/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class PooEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese radio");
      Circunferencia c1 = new Circunferencia();
        //System.out.println("Ingrese el radio");
        float radio = leer.nextFloat();
        c1.crearCir(radio);
        System.out.println(c1.area(radio));        
        System.out.println( c1.perimetro(radio));
    }      
}
   