/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocolecciones;

import java.util.ArrayList;
import poocolecciones.Entity.Alumno;
import poocolecciones.Service.AlumnoService;

/**
 *
 * @author Camil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlumnoService as1 = new AlumnoService();
        ArrayList <Alumno> a1 = as1.crearAlumno(new ArrayList());        
        as1.buscarAlumno(a1);
       
    }
         
  }


