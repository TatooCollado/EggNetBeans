/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class G5Extras7Fibonacc {

    /**
     * Realizar un programa que complete un vector con los N primeros números de
     * la sucesión de Fibonacci. Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para
     * todo n>1 1, 1, 2, 3, 5, 8,
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int n = leer.nextInt();
        int[] vec = new int[n];
        int num1 = 0;
        int num2 = 1;
            vec[0]=1;
            for (int i = 1; i < n; i++) {

                vec[i] = (num1) + (num2);
                num1 = num2;
                num2 = vec[i];
               // num1=num2;
            }
        
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + " ");

        
    }
    }
}












