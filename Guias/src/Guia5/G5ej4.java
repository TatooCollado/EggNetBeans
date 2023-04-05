/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guia5;
import java.util.Random;
/**
 *
 * @author Ignacio
 */
public class G5ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int aux=0;
        int [][] matrizA = new int [4][4];
        int [][] matrizB = new int [4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {          
        
            for (int j = 0; j < 4; j++) {              
            
                matrizA[i][j]=random.nextInt(9);
                System.out.print(matrizA[i][j]+ " ");
            }
                  System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j]=matrizA[j][i];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizB[i][j]+ " ");
            }
            System.out.println("");
        }      
              
        
        
    }
    
}