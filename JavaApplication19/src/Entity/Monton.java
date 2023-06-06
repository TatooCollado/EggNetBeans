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
public class Monton {
    ArrayList <Cartas> monton;

    public Monton(ArrayList<Cartas> a1) {
        this.monton = a1;
    }

    public ArrayList<Cartas> getA1() {
        return monton;
    }

    public void setA1(ArrayList<Cartas> a1) {
        this.monton = a1;
    }

    @Override
    public String toString() {
        return "Monton{" + "a1=" + monton + '}';
    }
    
}
