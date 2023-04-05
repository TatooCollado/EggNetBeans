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
public class ejguia4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda 
        elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
        tener una función para cada operación matemática y deben devolver sus 
        resultados para imprimirlos en el main.
        
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        float num1=leer.nextFloat(), num2=leer.nextFloat(), resultado=0;
        int eleccion;
        do{
        System.out.println("Qué operación desea realizar \n1-Sumar \n2-restar \n3-multiplicar \n4-Dividir");
        eleccion = leer.nextInt();
        switch (eleccion) {
            case 1:
               resultado = sumar(num1, num2);                
                break;
            case 2:
               resultado = restar(num1, num2);                
                break;
            case 3:
               resultado = multiplicar(num1, num2);                
                break;
            case 4:
               resultado = dividir(num1, num2);                
                break;
            default:
                System.out.println("El número ingresado no es válido, ingrese una opción correcta");;
        }
        }while(eleccion>4);
        
        System.out.println("El resultado de la operación es " + resultado);
    }
    
    public static float sumar(float n1, float n2) {
        float suma = n1 + n2;
        
        return suma;  
    }
    
    public static float restar(float n1, float n2) {
        float resta = n1 + n2;
        
        return resta;  
    }
    
    public static float multiplicar(float n1, float n2) {
        float mult = n1 + n2;
        
        return mult;  
    }
    
    
    public static float dividir(float n1, float n2) {
        float division = n1 + n2;
        
        return division;  
    }

}
