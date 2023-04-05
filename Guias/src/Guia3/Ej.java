package Guia3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *Escribir un programa que pida dos números enteros por teclado 
 * y calcule la suma de los dos. El programa deberá después 
 * mostrar el resultado de la suma
 * 
 * @author Ignacio
 */
public class Ej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n1;
       // int n2;
        System.out.println("Ingrese primer numero");
        int n1;
        n1 = scanner.nextInt();
        System.out.println("Ingrese segundo numero");
        int n2;
        n2 = scanner.nextInt();
        int suma = n1 + n2;
        System.out.println("La suma es " + suma + ".");
        
                
        
        
        
        
    }
    
}
