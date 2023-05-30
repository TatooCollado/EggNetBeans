/*

 */
package Entity;

/**
 *
 * @author Camil
 */
public class Jugador {
   private Integer id;
   private String nombre;
   private Boolean vivo;
   private Revolver r1;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, Boolean vivo, Revolver r1) {
        this.id = id;
        this.nombre = nombre;
        this.vivo = vivo;
        this.r1 = r1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public Revolver getR1() {
        return r1;
    }

    public void setR1(Revolver r1) {
        this.r1 = r1;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", vivo=" + vivo + ", r1=" + r1 + '}';
    }

   
    
}
