/*

 */
package Entity;

/**
 *
 * @author Camil
 */
public class Ahorcado {

    private String[] vec;


    private int cantL, cantJ, op, asd;

    public Ahorcado() {
    }

    public Ahorcado(String[] vec, int cantL, int cantJ) {
        this.vec = vec;
        this.cantL = cantL;
        this.cantJ = cantJ;

    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public int getAsd() {
        return asd;
    }

    public void setAsd(int asd) {
        this.asd = asd;
    }

    public String[] getVec() {
        return vec;
    }

    public void setVec(String[] vec) {
        this.vec = vec;
    }

    public int getCantL() {
        return cantL;
    }

    public void setCantL(int cantL) {
        this.cantL = cantL;
    }

    public int getCantJ() {
        return cantJ;
    }

    public void setCantJ(int cantJ) {
        this.cantJ = cantJ;
    }

}
