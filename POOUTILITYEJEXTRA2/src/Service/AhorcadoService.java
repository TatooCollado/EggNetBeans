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

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado a1 = new Ahorcado();
    String[] dsa;
    int x = 0;
    String[] erradas = new String[15];

    public void crearJuego(Ahorcado a1) {

        System.out.println("Ingrese la palabra a adivinar para comenzar su juego.");
        String aux = leer.next().toUpperCase();
        System.out.println("Ingrese cantidad de jugadas máximas: ");
        a1.setCantJ(leer.nextInt());
        a1.setOp(a1.getCantJ());        
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
        for (int k = 0; k < 15; k++) {
            erradas[k] = "KK";
        }
    }

    public void longitud(Ahorcado a1) {
        System.out.println("La longitud de la palabra es: " + a1.getVec().length);

    }

    public void buscar(Ahorcado a1, String letra) {
        int c = 0;
        int d = 0;
        int r = 0;
        for (int j = 0; j < a1.getAsd(); j++) {
            if (a1.getVec()[j].equalsIgnoreCase(letra)) { 
                c++;
                if (letra.equals(dsa[j])) {
                    d++;
                    if (d == 1) {
                        System.out.println("La letra ya fue ingresada, pruebe otra");
                        r = 0;
                    }
                } else {
                    dsa[j] = letra.toUpperCase();
                    if (c == 1) {
                        System.out.println("La letra está");
                        r = 0;
                    }
                }
            } else {
                r = 1;
            }
        }
        if (r == 1 && c == 0) {
            for (int i = 0; i < 15; i++) {
                if (erradas[i].equals(letra)) {
                    System.out.println("La letra ya fue elegida y no es parte de la palabra!");
                    a1.setOp((a1.getOp() + 1));
                    break;
                } else {
                    erradas[i] = letra;
                    if (a1.getOp() > 1) {
                        System.out.println("La letra no es parte de la palabra, ha perdido un intento");
                        break;
                    }
                }
            }
        }
        a1.setCantL((a1.getCantL() + d));
        if (c > 0) {
            a1.setCantL((a1.getCantL() - c));
        }
    }

    public boolean encontradas(Ahorcado a1, String letra) {
        boolean aux = false;
        for (int i = 0; i < a1.getAsd(); i++) {

            if (letra.equalsIgnoreCase((a1.getVec()[i]))) {
                aux = true;
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
     public void grafico(Ahorcado a1) {
        String[][] grafico = new String[6][6];
        int opc = a1.getOp();       

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0 || j == 4 && i == 1) {
                    grafico[i][j] = "|";
                } else {
                    grafico[i][j] = " ";
                }
                if (i == 0) {
                    grafico[i][j] = "_";
                }
                
                if (opc <= 5) {
                    grafico[2][4] = "o";
                }
                if (opc <= 4) {
                    grafico[2][4] = "o";
                    grafico[3][3] = "|";
                }
                if (opc <= 3) {
                    grafico[2][4] = "o";
                    grafico[3][3] = "|";
                    grafico[3][4] = "|";
                }
                if (opc <= 2) {
                    grafico[2][4] = "o";
                    grafico[3][3] = "|";
                    grafico[3][4] = "|";
                    grafico[3][5] = "|";
                }
                if (opc <= 1) {
                    grafico[2][4] = "o";
                    grafico[3][3] = "|";
                    grafico[3][4] = "|";
                    grafico[3][5] = "|";
                    grafico[4][3] = "|";
                }
                if (opc <= 0) {
                    grafico[2][4] = "o";
                    grafico[3][3] = "|";
                    grafico[3][4] = "|";
                    grafico[3][5] = "|";
                    grafico[4][3] = "|";
                    grafico[4][5] = "|";
                }

            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(grafico[i][j]);
            }
            System.out.println("");
        }
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
            grafico(a1);
            System.out.println("");
            System.out.println("Ingrese una letra");
            letra = leer.next().toUpperCase();
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
            grafico(a1);

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
