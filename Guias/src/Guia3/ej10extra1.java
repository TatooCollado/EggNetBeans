/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guia3;
import java.util.Scanner;
/**
 *
 * @author Ignacio
 */
public class ej10extra1 {

    /**Realice un programa para que el usuario adivine el resul
     * tado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta.
     * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
     * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2,mult,resp;
        num1= Math.floor(Math.random()*10);
        num2= Math.floor(Math.random()*10);
        mult=num1*num2;
        System.out.println(mult);
        System.out.println("Ingrese su respuesta");
        resp=leer.nextDouble();
        while(resp!=mult){
            System.out.println("Respuesta incorrecta, ingrese su respuesta nuevamente");
            resp=leer.nextDouble();
            
            
        }
        System.out.println("Respuesta correcta, gracias x jugar");
    }

}
