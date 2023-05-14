/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocolecciones.Entity;

import java.util.ArrayList;

/**
 *
 * @author Camil
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> nota;

     public Alumno(ArrayList<Integer> nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }

}
