package Service;

import Entity.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {

    ArrayList<Pelicula> peliculas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearPelicula() {
        int c = 0;
        String auxT = "", auxD = "";
        double auxDu;
        String resp = "";
        do {
            System.out.println("Ingrese titulo de la pelicula:");
            auxT = leer.next();
            System.out.println("Ingrese director de la pelicula:");
            auxD = leer.next();
            System.out.println("Ingrese duracion de la pelicula en horas:");
            auxDu = leer.nextDouble();
            Pelicula pelicula = new Pelicula(auxT, auxD, auxDu);
            peliculas.add(c, pelicula);
            c++;
            System.out.println(pelicula);
            System.out.println("Desea agregar otra pelicula? pulse n/N para no");
            resp = leer.next();
            if (resp.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);

        return peliculas;
    }

    public void menu() {
        int resp = 0;
        boolean ban = false;

        do {
            System.out.println("");
            System.out.println("MENU : ");
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println(" 1- Mostrar en pantalla todas las películas.\n"
                    + "2- Mostrar en pantalla todas las películas con una duración mayor a 1 hora.\n"
                    + "3- Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en\n"
                    + "pantalla.\n"
                    + "4- Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en\n"
                    + "pantalla.\n"
                    + "5- Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.\n"
                    + "6- Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.\n "
                    + "7- Salir");
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("Ingrese una opcion del 1 al 7: ");
            resp = leer.nextInt();
            switch (resp) {
                case 1:
                    showMovies(peliculas);
                    break;
                case 2:
                    showM1Hs(peliculas);
                    break;
                case 3:
                    orderM(peliculas);
                    break;
                case 4:
                    orderM2(peliculas);
                    break;
                case 5:
                    orderT(peliculas);
                    break;
                case 6:
                    orderT2(peliculas);
                    break;
                case 7:
                    ban = true;
                    break;
                default:
                    System.out.println("Ingrese un valor valido");
                    break;
            }

        } while (!ban);

    }

    public void showMovies(ArrayList<Pelicula> peliculas) {
        System.out.println("Películas agregadas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void showM1Hs(ArrayList<Pelicula> peliculas) {
        System.out.println("Películas agregadas con mas de 1 hora de duracion:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }

        }
    }

    public void orderM(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas, (Pelicula pelicula1, Pelicula pelicula2) -> Double.compare(pelicula2.getDuracion(), pelicula1.getDuracion()) // Ordenar en orden descendente por duración
        );
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void orderM2(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas, (Pelicula pelicula1, Pelicula pelicula2) -> Double.compare(pelicula1.getDuracion(), pelicula2.getDuracion()) // Ordenar en orden ascendente por duración
        );
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void orderT(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas, (Pelicula pelicula1, Pelicula pelicula2) -> pelicula1.getTitulo().compareToIgnoreCase(pelicula2.getTitulo()));
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void orderT2(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas, (Pelicula pelicula1, Pelicula pelicula2) -> pelicula1.getDirector().compareToIgnoreCase(pelicula2.getDirector()));
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
}
