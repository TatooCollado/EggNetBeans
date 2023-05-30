/*
Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Entity;

/**
 *
 * @author Camil
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tama;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tama) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tama = tama;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tama=" + tama + '}';
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTama() {
        return tama;
    }

    public void setTama(String tama) {
        this.tama = tama;
    }
    
    
}
