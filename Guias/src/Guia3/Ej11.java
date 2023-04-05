/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guia3;
import java.util.Scanner;
/**
 *
 * @author Ignacio
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
  
    Scanner consola = new Scanner(System.in);
    String frase; 
    String fraseFinal = ""; 
        do {
        System.out.println("Ingrese palabra");
        frase = consola.nextLine();
            if (frase.equals(".") ) {
                break;                
            }
   
    fraseFinal = fraseFinal + frase + " ";  
     
                 
        } while (true);
         //System.out.println(cambio(fraseFinal));
     String asd = cambio(fraseFinal);
        System.out.println(asd);
 
      }
    public static String cambio(String fraseFinal) {
        String FraseN = "";
        for (int i = 0; i < fraseFinal.length(); i++) {

            switch (fraseFinal.substring(i,i+1)) {
                case "a":
                    FraseN += "@";
                    break;
                case "e":
                    FraseN += "#";
                    break;
                case "i":
                    FraseN += "$";
                    break;
                case "o":
                    FraseN += "%";
                    break;
                case "u":
                    FraseN += "*";
                    break;
                default: 
                     FraseN+=fraseFinal.substring(i,i+1);
                     break;
            }
        }
        return FraseN;
        
    }
}


