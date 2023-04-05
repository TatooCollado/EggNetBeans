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
public class Ej12 {

    /**
     * @param args the command line arguments
     * Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese largo de escalera");
        int n= leer.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print("");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println("");
        }
        
    }

}
