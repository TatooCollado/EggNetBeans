/*



 */
package Service;

import Entity.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);
    Ahorcado a1 = new Ahorcado();
    String[] dsa;

    public void crearJuego(Ahorcado a1) {

        System.out.println("Ingrese la palabra a adivinar para comenzar su juego.");
        String aux = leer.next();
        System.out.println("Ingrese cantidad de jugadas máximas: ");
        a1.setCantJ(leer.nextInt());
        a1.setOp(a1.getCantJ());
        //System.out.println(a1.getOp());
        a1.setAsd(0);
        String[] veca = new String[aux.length()];

        for (int i = 0; i < aux.length(); i++) {
            veca[i] = aux.substring(i, i + 1);
        }
        a1.setVec(veca);
        a1.setCantL((aux).length());
        a1.setAsd(aux.length());
        dsa = new String[a1.getAsd()];
        for (int i = 0; i < a1.getAsd(); i++) {
            dsa[i] = "_";
        }
    }

    public void longitud(Ahorcado a1) {
        System.out.println("La longitud de la palabra es: " + a1.getVec().length);

    }

    public void buscar(Ahorcado a1, String letra) {
        int c = 0;
        //System.out.println(a1.getAsd());
        for (String vec : a1.getVec()) {
            if (letra.equalsIgnoreCase(vec)) {
                c++;
            }
        }
        if (c > 0) {

            a1.setCantL((a1.getCantL() - c));
            System.out.println("La letra está");

        } else {
            System.out.println("La letra no está");
        }

    }

    public boolean encontradas(Ahorcado a1, String letra) {
        boolean aux = false;
        //String[] fa = new String[a1.getAsd()];
        for (int i = 0; i < a1.getAsd(); i++) {

            if (letra.equalsIgnoreCase((a1.getVec()[i]))) {
                aux = true;
                dsa[i] = letra;
            }
        }
        if (aux == true) {
            System.out.println("Fueron encontradas " + ((a1.getAsd()) - (a1.getCantL())) + " letras y faltan encontrar " + a1.getCantL() + ".");
            System.out.println("");
        }

        if (aux == false) {
            a1.setOp((a1.getOp() - 1));
        }

        return aux;
    }

    public void intentos(Ahorcado a1) {
        System.out.println("Te quedan " + a1.getOp() + " intentos.");
    }

    public void juego(Ahorcado a1) {
        for (int i = 0; i < a1.getAsd(); i++) {
            dsa[i] = "_";
        }
        int win = 2;
        String letra;
        crearJuego(a1);
        longitud(a1);
        do {
            System.out.println("");
            System.out.print(Arrays.toString(dsa));
            System.out.println("");
            System.out.println("Ingrese una letra");
            letra = leer.next();
            buscar(a1, letra);
            if (encontradas(a1, letra) == false) {
                intentos(a1);
            }
            if (a1.getOp() == 0) {
                win = 0;

            }
            if (a1.getCantL() == 0) {
                a1.setOp(0);
                win = 1;
            }
        } while ((a1.getOp() > 0));
        if (win == 0) {
            System.out.println("Juego terminado. Ha perdido");

        } else if (win == 1) {
            System.out.println("");
            System.out.print(Arrays.toString(dsa));
            System.out.println("");
            System.out.println("Juego terminado. Ha Ganado!");
        }
        System.out.println("Gracias x jugar!");
    }

}

//Método juego(): el método juego se encargará de llamar todos los métodos previamente
//mencionados e informará cuando el usuario descubra
//toda la palabra o se quede sin intentos. 
//Este método se llamará en el main.
