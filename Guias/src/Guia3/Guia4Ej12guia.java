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
public class Guia4Ej12guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para ver si son multiplos");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        multiplo (num1, num2);
                
    }
    public static void multiplo(int num1, int num2){
        if (num1 % num2 ==0){
            System.out.println(num1 + " es multiplo de " + num2);    
        }
        else {
            System.out.println(num1 + " no es multiplo de " + num2); 
        }
    } 
    
}