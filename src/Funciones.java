/**
 * funciones utilizadas en la clase principal
 */

import java.util.Scanner;

/**
 * Funciones utilizadas en la clase main
 * @author Cristian Regueiro
 * @version v1.0
 */


public class Funciones {
  /**
   * comprueba si el sueldo está entre 1000 y 1750
   *
   * @param sueldo del trabajador
   * @return si está dentro del rango
   */

  public static Boolean obtenerSueldo1750(Double sueldo) {
    if (sueldo > 1000 && sueldo < 1750) {
      return true;
    }
    return false;
  }

  /**
   * @param sueldo de menos de 1000
   * @return si esta dentro del rango
   */
  public static Boolean obtenerSueldo1000(Double sueldo) {
    if (sueldo < 1000 && sueldo > 0) {
      return true;
    }
    return false;
  }

  /**
   * @param sueldo de mas de 1750
   * @return si esta dentro del rango
   */
  public static Boolean obtenerSueldoMas1750(Double sueldo) {
    if (sueldo > 1750) {
      return true;
    }
    return false;
  }

  /**
   * damos valores a los sueldos y nombres del trabajador
   *
   * @return los trabajadores con sus valores
   */
  public static Trabajador darAltaTrabajador() {
    Trabajador obxTrabajador = new Trabajador();
    /*obxTrabajador.setNombre("Pepe");
    obxTrabajador.setSueldo(1200d);
    obxTrabajador.setNombre("Mario");
    obxTrabajador.setSueldo(900d);
    obxTrabajador.setNombre("Alejandro");
    obxTrabajador.setSueldo(2000d);*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime nombre: ");
    obxTrabajador.setNombre(sc.nextLine());
    System.out.println("Dime sueldo: ");
    obxTrabajador.setSueldo(sc.nextDouble());
    return obxTrabajador;
  }


}
