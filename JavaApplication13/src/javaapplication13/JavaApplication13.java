/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication13;
import java.util.Scanner;
/**
 *
 * @author Ignacio
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    //Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al
    //usuario hasta que la suma de los números introducidos supere el límite inicial.

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su numero limite");
        int lim = leer.nextInt();
        int suma=0;
        while   (lim>suma){
            System.out.println("Ingrese un numero a sumar");
            int a= leer.nextInt();
            suma=suma+a;
            
        }   
        System.out.println("La suma es: "+suma + ", Y el limite era de: " +lim);
    }

}
