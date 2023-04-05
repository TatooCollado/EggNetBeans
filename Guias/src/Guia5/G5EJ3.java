/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guia5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Ignacio
 */
public class G5EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {Scanner leer = new Scanner(System.in);
        int[] vector1 = new int[6];
        Random random = new Random();
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;
        for (int b:vector1) {
            vector1[b]=random.nextInt(45);
            System.out.print(vector1[b] + " ");
            do {
                vector1[b]= (int) (vector1[b] / 10);
                cont1 ++;
            }while(vector1[b]>0);
            switch (cont1) {
                case 1:
                    cont2++;
                    break;
                case 2:
                    cont3++;
                    break;
                case 3:
                    cont4++;
                    break;
                case 4:
                    cont5++;
                    break;
                case 5:
                    cont6++;
                    break;    
                
            }
            cont1=0;
        }
        System.out.println(" ");
        System.out.println("Hay " + cont2 + " numeros de 1 digito.");
        System.out.println("Hay " + cont3 + " numeros de 2 digitos.");
       
    }

}