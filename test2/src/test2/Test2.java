/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author Camil
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int precio =500;
        System.out.println(iva(precio));
       
    }
    public static int iva(int precio){
           int finasl;
          finasl=(int) (precio*1.21);
           return finasl;
       }
}
