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
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        int suma = 0;
        
        do {
             System.out.println("Ingresa un numero");
             num = leer.nextInt();
             cont++;
             if (num > 0) {
                 suma = suma + num;
             }
             if (num == 0 ) {
            System.out.println("Se capturo el numero 0");
            break;
        }
        } while (cont <= 20);
        System.out.println("ingresaste " + cont + " numeros y su suma es: " + suma);
        
    }

}