/**
 * Clase principal donde llamamos a la clase Funciones y a los atributos de la clase Trabajador
 * @author Cristian Regueiro
 * @version v1.0
 */

public class Main {
  /**
   * numero de trabajadores con sueldo entre 1000 y 1750
   */
  static Integer contador1750=0;
  /**
   * numero de trabajadores con sueldo menor de 1000
   */
  static Integer contador1000=0;
  /**
   * sueldo de trabajadores con sueldo mayor de 1750
   */
  static Integer contadorMas1750=0;

  /**
   * aumenta contador según rango del sueldo del trabajador
   *
   * @param args no recibe parámetros
   */
  public static void main(String[] args) {
    //Funciones obxFunciones=new Funciones();
    Trabajador auxTrabajador;
    do{
      auxTrabajador=Funciones.darAltaTrabajador();

      actualizarContadores(auxTrabajador);

    } while(auxTrabajador.getSueldo()>0);
    mostrarContadores();

  }

  /**
   * aumenta contadores según rango
   */
  public static void actualizarContadores(Trabajador auxtrabajador) {

    if(Funciones.obtenerSueldo1750(auxtrabajador.getSueldo())){
      contador1750++;
    } else if(Funciones.obtenerSueldo1000(auxtrabajador.getSueldo())){
      contador1000++;
    } else if(Funciones.obtenerSueldoMas1750(auxtrabajador.getSueldo())){
      contadorMas1750++;
    }
  }

  /**
   * nos muestra el número de contadores en base a los sueldos establecidos
   */
  public static void mostrarContadores() {

    System.out.println("Entre 1000 y 1750: "+contador1750);
    System.out.println("Menos de 1000: "+contador1000);
    System.out.println("Más de 1750: "+contadorMas1750);

  }


}
