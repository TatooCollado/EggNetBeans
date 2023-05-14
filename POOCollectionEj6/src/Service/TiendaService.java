package Service;

import Entity.Tienda;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class TiendaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> T1 = new HashMap();

    public HashMap<String, Integer> crearArticulo() {
        String aux = "";
        //Integer num = 0;
        do {
            Tienda tienda = new Tienda();
            System.out.println("Ingrese producto:");
            tienda.setProducto(leer.next());
            System.out.println("Ingrese precio producto:");
            tienda.setPrecio(leer.nextInt());
            T1.put(tienda.getProducto(), tienda.getPrecio());
            System.out.println("Desea agregar otro articulo? pulse n/N para no");
            aux = leer.next();
            if (aux.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);

        return T1;
    }

    public void menu() {
        int resp = 0;
        boolean ban = false;

        do {
            System.out.println("");
            System.out.println("MENU : ");
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("1- Agregar un producto.\n"
                    + "2- Modificar precio articulo.\n"
                    + "3- Eliminar producto.\n"                   
                    + "4- Mostrar lista productos.\n"
                    + "5- Salir");
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("Ingrese una opcion del 1 al 7: ");
            resp = leer.nextInt();
            switch (resp) {
                case 1:
                    crearArticulo1(T1);
                    break;
                case 2:
                    modificarArticulo(T1);
                    break;
                case 3:
                    eliminarArticulo(T1);
                    break;
                case 4:
                    mostrarProductos(T1);
                    break;
                case 5:
                    ban = true;
                    break;

                default:
                    System.out.println("Ingrese un valor valido");
                    break;
            }

        } while (!ban);

    }

    public void crearArticulo1(HashMap<String, Integer> T1) {
        String aux = "";
        //Integer num = 0;
        do {
            Tienda tienda = new Tienda();
            System.out.println("Ingrese producto:");
            tienda.setProducto(leer.next());
            System.out.println("Ingrese precio producto:");
            tienda.setPrecio(leer.nextInt());
            T1.put(tienda.getProducto(), tienda.getPrecio());
            System.out.println("Desea agregar otro articulo? pulse n/N para no");
            aux = leer.next();
            if (aux.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);

    }

    public void modificarArticulo(HashMap<String, Integer> T1) {
        System.out.println("Ingrese el producto a modificar su precio:");
        String aux = leer.next();
        if (T1.containsKey(aux)) {
            System.out.println("Ingrese nuevo precio.");
            Integer aux1 = leer.nextInt();
            T1.put(aux, aux1);
            System.out.println("Se ha actualizado el precio.");
        } else {
            System.out.println("El producto ingresado no existe.");
        }

    }

    public void eliminarArticulo(HashMap<String, Integer> T1) {
        System.out.println("Ingrese el producto a eliminar:");
        String aux = leer.next();
        if (T1.containsKey(aux)) {
            T1.remove(aux);
            System.out.println("El producto ha sido eliminado.");
        } else {
            System.out.println("Error. Ingrese un producto correcto.");
        }
    }

    public void mostrarProductos(HashMap<String, Integer> T1) {
         for (Entry<String, Integer> entry : T1.entrySet()) {
        String clave = entry.getKey();
        Integer valor = entry.getValue();
        System.out.println("Producto: " + clave + ", Precio: " + valor);
    }
}}
/*
, eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
