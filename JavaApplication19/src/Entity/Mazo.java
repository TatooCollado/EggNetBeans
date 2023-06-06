/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author Camil
 */
public class Mazo {
    ArrayList <Cartas> mazo;

    public Mazo(ArrayList<Cartas> a1) {
        this.mazo = a1;
    }

    public ArrayList<Cartas> getA1() {
        return mazo;
    }

    public void setA1(ArrayList<Cartas> a1) {
        this.mazo = a1;
    }

    @Override
    public String toString() {
        return "Mazo{" + "a1=" + mazo + '}';
    }
    
}
