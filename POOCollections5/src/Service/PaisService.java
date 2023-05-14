/*

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Service;

import Entity.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class PaisService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> D = new HashSet();

    public HashSet<Pais> crearPais() {
        String aux = "";
        do {
            Pais pais = new Pais();
            System.out.println("Ingrese pais: ");
            pais.setPais(leer.next());
            D.add(pais);
            System.out.println("Desea agregar otro pais? pulse n/N para no");
            aux = leer.next();
            if (aux.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
        for (Pais pais1 : D) {
            System.out.println(pais1);
        }
        System.out.println("------------------------");
        return D;
    }

    public void ordenar(HashSet<Pais> D) {
        ArrayList<Pais> D1 = new ArrayList<>(D);
        System.out.println("");
        D1.sort((Pais pais1, Pais pais2) -> pais1.getPais().compareTo(pais2.getPais()));

        for (Pais pais : D1) {
            System.out.println(pais);
        }
    }

    public void eliminar(HashSet<Pais> D) {
        String aux = "";
        System.out.println("Ingrese pais a buscar y eliminar:");
        aux = leer.next();
        Iterator<Pais> iterator = D.iterator();
        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            if (pais.getPais().equals(aux)) {
                iterator.remove();
            }
        }
        for (Pais pais : D) {
            System.out.println(pais);
        }
    }

}
