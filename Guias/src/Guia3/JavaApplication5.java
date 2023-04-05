package Guia3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
    System.out.println("Ingrese Temp en grados C");      
    float cel = scanner.nextFloat();
    float far = 32+(9*(cel/5));
        System.out.println("La temperatura en grados Farenheit es: " + far);
          // public static void main(String[] args) {
        // TODO code application logic here
    }
   
                
                        
    
}

 
