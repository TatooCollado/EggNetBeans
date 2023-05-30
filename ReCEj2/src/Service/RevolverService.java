/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Jugador;
import Entity.Revolver;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Camil
 */
public class RevolverService {

    public Revolver llenarRevolver() {
        Random random = new Random();
        Revolver r1 = new Revolver();
        int n1, n2;
        n1 = random.nextInt(5);
        n2 = random.nextInt(5);
        if (n1 == 0) {
            n1 = 6;
        }
        if (n2 == 0) {
            n2 = 6;
        }
        r1.setPosicionActual(n2);
        r1.setPosicionBala(n1);
        System.out.println("Arma Cargada, listo para jugar");
        return r1;
    }

    public boolean gatillar(Revolver r1) {
        boolean r = false;        
        if ((r1.getPosicionActual()) == (r1.getPosicionBala())) {
            r = true;
        } else {
            siguienteBala(r1);
        }
        return r;
    }

    public void siguienteBala(Revolver r1) {
        Random random = new Random();
        int n1, n2;
        if (r1.getPosicionActual() <= 5) {
            r1.setPosicionActual(r1.getPosicionActual() + 1);
        } else if (r1.getPosicionActual() == 6) {
            r1.setPosicionActual(1);
        }

        System.out.println("Se ha cambiado de posicion");
    }

    public void mostrarPosiciones(Revolver r1) {
        System.out.println(r1);
    }

    public boolean disparo(Jugador r1) {
        boolean r = false;
        if (gatillar(r1.getR1()) == true) {
            r1.setVivo(false);
            r = true;
        }
        return r;
    }

    public ArrayList<Jugador> crearJugadores() {
        ArrayList<Jugador> a1 = new ArrayList();
        int id = 0;
        String nombre = "";
        Boolean vida = true;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cantidad de jugadores (max 6)");
        int resp = leer.nextInt();
        if (resp > 6) {
            resp = 6;
        } else if (resp < 1) {
            System.out.println("Ingrese un numero entre 1 y 6");
            resp = leer.nextInt();
        }
        for (int i = 1; i <= resp; i++) {
            id = i;
            System.out.println("Ingrese nombre del jugador: ");
            nombre = leer.next();
            vida = true;            
            System.out.println("Jugador creado");            
            a1.add(new Jugador(id, nombre, vida, llenarRevolver()));
        }
        return a1;
    }

    public void ronda(ArrayList<Jugador> a1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String c = "";
        boolean b = true;
        do {
            for (Jugador jugador : a1) {
                System.out.println("");
                System.out.println("Ingrese una s/S para gatillar");
                System.out.println(jugador.getId() + " " + jugador.getNombre());
                c = leer.next();
                if (c.equalsIgnoreCase("s")) {
                    if (disparo(jugador) == true) {                        
                        System.out.println("El jugador " + jugador.getNombre() + " ha muerto.");                        
                        a1.remove(jugador);
                        b = false;
                        break;

                    } else {                        
                        System.out.println("El jugador " + jugador.getId() + " " + jugador.getNombre() + " pasa a la siguiente ronda.");
                        System.out.println("");
                    }
                }
            }
        } while (b == true);
        System.out.println("----------------------");
        System.out.println("Ganador/es: ");
        System.out.println(a1);
    }
}
