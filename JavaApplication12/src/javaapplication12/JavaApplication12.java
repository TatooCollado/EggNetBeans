/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication12;
import java.util.Scanner;
/**
 *
 * @author Ignacio
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
        e imprima el número ingresado seguido de tantos asteriscos
        como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
         */
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.println("ingrese 1 numero del 1 al 20 ");
            int num = scanner.nextInt();
            System.out.print(num + " ");
            for (int j = 1; j<= num ; j++) {
                System.out.print("*");
            }
        }
    }

}
    }

}
