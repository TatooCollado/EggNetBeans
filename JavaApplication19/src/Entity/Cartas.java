/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Camil
 */
public class Cartas {
   private String palo;
   private int num;

    public Cartas(String palo, int num) {
        this.palo = palo;
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Cartas{" + "palo=" + palo + ", num=" + num + '}';
    }

    public Cartas() {
    }
   
}
