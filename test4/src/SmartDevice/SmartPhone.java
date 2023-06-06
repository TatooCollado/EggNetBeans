/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartDevice;

/**
 *
 * @author Camil
 */
public class SmartPhone {
    private int numero;
    private boolean whatsapp;

    public SmartPhone() {
    }

    public SmartPhone(int numero, boolean whatsapp) {
        this.numero = numero;
        this.whatsapp = whatsapp;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "numero=" + numero + ", whatsapp=" + whatsapp + '}';
    }
    
}
