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
public class SmartWatch {
   public int hora;
   public boolean luz;

    public SmartWatch() {
    }

    public SmartWatch(int hora, boolean luz) {
        this.hora = hora;
        this.luz = luz;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public boolean isLuz() {
        return luz;
    }

    public void setLuz(boolean luz) {
        this.luz = luz;
    }

    @Override
    public String toString() {
        return "SmartWatch{" + "hora=" + hora + ", luz=" + luz + '}';
    }
}
