package Guia3.newpackage;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ignacio
 */
public class Ej6EstructurasDeControl1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese dos numeros enteros");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
            
            boolean salida = true;
            
            do {
                System.out.println("Que desea hacer");
                System.out.println("Menu \n 1-Sumar \n 2-Restar \n 3-Multiplicar \n 4-Dividir \n 5-Salir \n Elija opción:" );
                int eleccion = leer.nextInt();
                
                switch (eleccion){
                    case 1: 
                        System.out.println("La suma de los numeros es: " + (num1 + num2)); 
                        break;
                    case 2:
                        System.out.println("La resta de los numeros es: " + (num1 - num2));
                        break;
                    case 3: 
                        System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("La division de los numeros es: " + (num1 / num2));
                        break;
                    case 5:
                        System.out.println("Desea salir? S/N");
                            String eleccion2 = leer.next();
                            if ("S".equalsIgnoreCase(eleccion2)) {
                                salida = false;
                            }
                }
                    
                
           }while (salida);
    }

}
    


