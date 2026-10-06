/* Ejercicio: Crear un programa que pida 2 numeros enteros, los divida
y muestre el resultado debe capturar si el usuario no escribe un entero
o intenta dividir entre 0
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class VariosTipos {
    public static void main(String[] args) {
        int numero1;
        int numero2;
      Scanner scanner = new Scanner(System.in);
      try{
      System.out.println("introduzca 2 numeros enteros");
      numero1 = scanner.nextInt();
      numero2 = scanner.nextInt();
      int resultado = numero1 / numero2;
      System.out.println("el resultado es " + resultado);
      }catch(ArithmeticException e){
        System.out.println("no se puede dividir entre 0");
      }catch(InputMismatchException e){
        System.out.println("Tiene que ser un numero entero");
      }
    }
}
