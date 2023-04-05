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
public class G5Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matrizA = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int [][] matrizB = new int [3][3];
        Scanner leer = new Scanner(System.in);
        
        for (int [] i: matrizA) {
            for (int j : i) {
                System.out.print(j + " ");                
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j]=matrizA[j][i];
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
        boolean antisim = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    if (matrizB[i][j]!= (matrizA[i][j])*(-1)) {
                    antisim = false;
                }
            }
         }
                    if (antisim) {
                System.out.println("La matriz es antisimétrica");
            }else{
                System.out.println("La matriz no es antisimétrica");
            }
}
}