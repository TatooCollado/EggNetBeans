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
public class Ej4Guia4 {

    /**
     * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique si es o no un número primo
     * , debe devolver true si es primo
     * , sino false.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es primo");
        double num = leer.nextInt();
        System.out.println(primo(num));

    }

    //separacion
    public static boolean primo(double num) {
        int c = 0;
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                c++;
            }
        }
        if(c <= 1) {
            return true;
        } else {
            return false;
        }
    }
}
