/**
 * Clase trabajador usada en la clase main
 * @author Cristian Regueiro
 * @version v1.0
 */

public class Trabajador {

  /**
   * atributos de la clase trabajador
   */
  private String nombre;
  private double sueldo;

  /**
   * metodos getter y setter de la clase trabajador en el que damos sueldos y nombres
   * @return sueldo y nombres
   */
  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
