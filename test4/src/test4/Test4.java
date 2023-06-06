/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

import SmartDevice.SmartPhone;
import SmartDevice.SmartWatch;

/**
 *
 * @author Camil
 */
public class Test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartPhone sm1 = new SmartPhone();
        SmartWatch sw1 = new SmartWatch();
        sm1.setNumero(45715565);
        sm1.setWhatsapp(true);
        sw1.setHora(12);
        sw1.setLuz(true);
        System.out.println(sm1 + " " + sw1);
    }
    
}
