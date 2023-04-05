/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication9;
import java.util.Scanner;
/**
 *
 * @author Ignacio
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está 
        //entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
        Scanner leer = new Scanner(System.in);
        int nota;
        boolean esvalida = false;

        while (!esvalida) {
            System.out.println("ingresar una nota entre 0 y 10");
            nota = leer.nextInt();
            if (nota >= 0 && nota <= 10) {
                System.out.println("la nota es correcta");
                break;
            }
        }
    }

}