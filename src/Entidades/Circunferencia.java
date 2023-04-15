/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Camil
 */
public class Circunferencia {
    private float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public Circunferencia() {
        
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
public void crearCir(float radio){
    this.radio=radio;
}
public float area(float radio){
    float area= (float)Math.PI*(radio*radio);
    return area;
}
public float perimetro(float radio){
    float perim= (float)Math.PI*2*radio;
    return perim;
}
}
