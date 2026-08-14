/* Ejercicio: mayor de
Solicita al usuario su edad y altura si cumple las restricciones
 permite el acceso
*/
import java.util.Scanner;
 
public class mayorde { 
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
       System.out.println ("Ingrese su edad");
       int edad = scanner.nextInt();
       if (edad < 18 ){
            System.out.println("no puede acceder");
          }if(edad >= 18 ){
       System.out.println("ingrese su altura");
       int altura = scanner.nextInt();
          if (altura >= 140 ){
            System.out.println("puede acceder");
          }else{
            System.out.println("no puede acceder");
          }
          }
          scanner.close();
  }
}
