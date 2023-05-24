/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Perro;
import Entity.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class MascotaService {
    
    
    public ArrayList <Persona> crearPersona(){
       Perro pe2 = new Perro();
       String nombre="", apellido="";
       int edad=0, dni=0; 
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       ArrayList <Persona> lista = new ArrayList();
       System.out.println("Ingrese nombre de la persona");
       nombre = leer.next();       
        System.out.println("Ingrese apellido: ");
        apellido=leer.next();
        System.out.println("Ingrese la edad: ");
        edad=leer.nextInt();
        System.out.println("Ingrese DNI: ");
        dni=leer.nextInt();
        Persona p1 = new Persona(nombre, apellido, edad, dni);
        crearPerro(pe2);
        p1.setDog(pe2);
        lista.add(p1);
        System.out.println(p1);
        return lista;
    }
    
    public Perro crearPerro(Perro pe2){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");        
        String nombre="",raza="",tama="";
        int edad;
        System.out.println("Ingrese nombre del perro");
        nombre=leer.next();
        System.out.println("Ingrese raza: ");
        raza=leer.next();
        System.out.println("Ingrese tamaño: ");
        tama=leer.next();
        System.out.println("Ingrese Edad: ");
        edad=leer.nextInt();
        pe2.setEdad(edad);
        pe2.setNombre(nombre);
        pe2.setRaza(raza);
        pe2.setTama(tama);
        return pe2;
    }
}
