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
public class Revolver {

    private Integer PosicionActual;

    public Revolver(Integer PosicionActual, Integer PosicionBala) {
        this.PosicionActual = PosicionActual;
        this.PosicionBala = PosicionBala;
    }
    private Integer PosicionBala;

    public Revolver() {
    }

    public Integer getPosicionActual() {
        return PosicionActual;
    }

    public void setPosicionActual(Integer PosicionActual) {
        this.PosicionActual = PosicionActual;
    }

    public Integer getPosicionBala() {
        return PosicionBala;
    }

    public void setPosicionBala(Integer PosicionBala) {
        this.PosicionBala = PosicionBala;
    }

    @Override
    public String toString() {
        return "Revolver{" + "PosicionActual=" + PosicionActual + ", PosicionBala=" + PosicionBala + '}';
    }

}
