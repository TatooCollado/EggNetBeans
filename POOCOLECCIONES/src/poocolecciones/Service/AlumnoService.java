/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.


Después de ese bucle tendremos el siguiente método en el servicio de Alumno:


Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package poocolecciones.Service;

import java.util.ArrayList;
import java.util.Scanner;
import poocolecciones.Entity.Alumno;

/**
 *
 * @author Camil
 */
public class AlumnoService {

    ArrayList<Alumno> a1 = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String resp = "";

    public ArrayList<Alumno> crearAlumno(ArrayList<Integer> c2) {
    String aux = "";
    do {
        System.out.println("Ingrese nombre del alumno");
        aux = leer.next();
        ArrayList<Integer> notas = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese " + (i + 1) + " nota");
            notas.add(leer.nextInt());
        }
        a1.add(new Alumno(notas, aux));
        System.out.println("Desea agregar otro alumno? ingrese 'n' para no");
        resp = leer.next();
        
        if (resp.equalsIgnoreCase("n")) {
            break;
        }
    } while (true);
    System.out.println(a1);
    return a1;
}

    public double notaFinal(Alumno a2) {
        int aux = 0;
        for (int i = 0; i < 3; i++) {
            aux = aux + a2.getNota().get(i);            
        }
        return aux / 3;
    }

   public void buscarAlumno(ArrayList<Alumno> a1) {
    String aux = "";
    System.out.println("Ingrese el nombre del alumno a buscar");
    aux = leer.next();

    boolean encontrado = false; // Variable para rastrear si se encuentra el alumno

    for (Alumno a2 : a1) {
        if (a2.getNombre().contains(aux)) {
            System.out.println("La nota final es: " + notaFinal(a2));
            encontrado = true; // Establecer la variable como true cuando se encuentra el alumno
        }
    }

    if (!encontrado) {
        System.out.println("El Alumno no se encuentra en la lista");
    }
}

}
