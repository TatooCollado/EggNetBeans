/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.




 */
package Services;

import Entity.Cadena;

/**
 *
 * @author Camil
 */
public class CadenasService {

    public int mostrarVocales(Cadena c1) {
        int c = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getCadena().substring(i, i + 1).equalsIgnoreCase("a") || c1.getCadena().substring(i, i + 1).equalsIgnoreCase("e") || c1.getCadena().substring(i, i + 1).equalsIgnoreCase("i") || c1.getCadena().substring(i, i + 1).equalsIgnoreCase("o") || c1.getCadena().substring(i, i + 1).equalsIgnoreCase("u")) {
                c++;
                    
            }
        }
        return c;
    }

    public String invertirFrase(Cadena c1) {
        int i;
        String aux = "";
        for (i = (c1.getLongitud() - 1); i >= 0; i--) {
            aux = aux + c1.getCadena().substring(i, i + 1);
        }
        return aux;
    }

    public int vecesRepetido(Cadena c1, String L) {
        int c = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getCadena().substring(i, i + 1).equalsIgnoreCase(L)) {
                c++;
            }
        }

        return c;
    }

    public void compararLongitud(Cadena c1, String Fr1) {
        if (Fr1.length() > c1.getLongitud()) {
            System.out.println("La frase ingresada tiene una mayor longitud");
        } else if (Fr1.length() == c1.getLongitud()) {
            System.out.println("La frase ingresada tiene la misma longitud");

        } else {
            System.out.println("La frase ingresada tiene una menor longitud");
        }

    }

    public String unirFrases(Cadena c1, String Fr1) {
        String aux;
        aux = c1.getCadena().concat(" " + Fr1);
        return aux;
    }

    public String reemplazar(Cadena c1, String L) {
        String aux = "";
        for (int i = 0; i <= c1.getLongitud() - 1; i++) {
            if (c1.getCadena().substring(i, i + 1).equalsIgnoreCase("A")) {
                aux += L;
            } else {
                aux += c1.getCadena().substring(i, i + 1);
            }

        }
        return aux;
    }

    public boolean contiene(Cadena c1, String L) {
        boolean c = false;
        for (int i = 0; i <= c1.getLongitud() - 1; i++) {

            if (c1.getCadena().substring(i, i + 1).equalsIgnoreCase(L)) {
                c = true;

            }

        }
        return c;
    }
}
