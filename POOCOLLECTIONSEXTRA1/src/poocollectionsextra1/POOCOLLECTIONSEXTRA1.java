/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocollectionsextra1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class POOCOLLECTIONSEXTRA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int aux=0;
        int c=0;
        int sum=0;
        do{
            System.out.println("Ingrese un entero a guardar en la lista");
            aux=leer.nextInt();
            if(!(aux==-99)){
                lista.add(aux);
                c++;
                sum+=aux;
            }else if(aux==-99){
                break;
            }
        }while(true);
        for (Integer integer : lista) {
            System.out.println(integer);
        }
        System.out.println("Su suma es :" + sum + " Y su promedio es " + sum/c);
    }
    
}
