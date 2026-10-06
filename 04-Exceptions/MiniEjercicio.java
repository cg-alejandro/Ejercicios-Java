/* Ejercicio: Crear un programa que pida un numero a un usuario 
comprobar si es entero y capturar el error si introduce algo distinto
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class MiniEjercicio {

    public static void main(String[] args) {
        System.out.println("introduzca un numero entero");
        int numero = 0;
        boolean entero = false;
         Scanner scanner =new Scanner(System.in);
        do {
            try {
            numero = scanner.nextInt();
            entero = true;
        } catch (InputMismatchException e) {
            System.out.println("debe introducir un numero entero");
            scanner.nextLine();
        }
        } while (!entero);
       System.out.println(numero);
        
       
    }
}