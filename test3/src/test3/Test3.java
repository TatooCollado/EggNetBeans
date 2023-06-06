/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

/**
 *
 * @author Camil
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] nombres = {"aaasd", "dddss", "fgfff", "hhhhh"};
       String concat="";
        for (int i = 0; i < nombres.length; i++) {
            concat=concat + " " + nombres[i];
            System.out.println(concat);
        }
    }
    
}
