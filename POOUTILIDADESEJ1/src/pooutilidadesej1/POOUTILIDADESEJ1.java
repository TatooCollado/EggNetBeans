/*
 *
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud.
Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. 
El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:

 */
package pooutilidadesej1;

import Entity.Cadena;
import Services.CadenasService;
import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class POOUTILIDADESEJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String L, S="";
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su frase");
        Cadena c1 = new Cadena(leer.next());
        CadenasService cs1 = new CadenasService();
        System.out.println("La cantidad de vocales es: " + cs1.mostrarVocales(c1));
        System.out.println("La frase invertida es : " + cs1.invertirFrase(c1));
        System.out.println("Ingrese la letra a buscar si se repite");
        L = leer.next();
        System.out.println("La cantidad de veces que el caracter " + S + " se repite es: " + cs1.vecesRepetido(c1, L));
        System.out.println("Ingrese una frase a comparar:");
        String fr1=leer.next();
        cs1.compararLongitud(c1, fr1);        
        System.out.println("Ingrese una frase a concatenar");
        String fr2=leer.next();
        System.out.println("Las frases concatenadas quedan: " + cs1.unirFrases(c1, fr2));
        System.out.println("Ingrese el caracter repetido");
        S = leer.next();
        System.out.println("La frase reemplazada con el caracter " + S + " es : " + cs1.reemplazar(c1, S));
        System.out.println("Ingrese un caracter a buscar");
        String A = leer.next();
        System.out.println(cs1.contiene(c1, A));
    }

}
