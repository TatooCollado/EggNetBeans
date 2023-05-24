/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};

        int c = 0;
        Arrays.sort(statues);
        for (int i = 0; i < statues.length - 1; i++) {
            System.out.print(statues[i] + " ");
            if (!((statues[i] + 1) == statues[i + 1])) {
                c++;
            }
        }
        System.out.println(c);

    }
}
