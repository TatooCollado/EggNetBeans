/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Date;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeDate.getYear;

/**
 *
 * @author Camil
 */
public class FechaService {
        Scanner leer = new Scanner(System.in);
      public Date FechaNacimiento(){
          Date f = new Date();
          System.out.println("Ingrese dia de nacimiento");
          int dia = leer.nextInt();
          System.out.println("Ingrese mes de nacimiento");
          int mes= leer.nextInt();
          System.out.println("Ingrese año de nacimiento");
          int ano= leer.nextInt();
            return new Date(ano-1900,mes-1,dia);
        }
      public Date FechaActual(){
          Date f = new Date();
          return new Date();
      }
    public int Referencia(){
          Date f = new Date();
          int c=0;
          System.out.println("Ingrese dia de nacimiento");
          int dia = leer.nextInt();
          System.out.println("Ingrese mes de nacimiento");
          int mes= leer.nextInt();
          System.out.println("Ingrese año de nacimiento");
          int ano= leer.nextInt();
          int dif;
            dif=f.getYear()-ano+1900;
          if(f.getMonth()< mes){
              c++;
          }
          if(f.getMonth()==mes && dia > f.getDay()){
              c++;
          }
          if(c>0){
              dif--;
          }
        return dif;
    }
}
