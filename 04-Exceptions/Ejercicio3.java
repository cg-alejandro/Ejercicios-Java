/* Ejercicio: Hacer un programa que pida un entero y lo muestre
introducir finally que muestre el final de la operacion
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 0;
        boolean entero = false;
        Scanner scanner =new Scanner(System.in);
        System.out.println("introduzca un numero entero");
        try {
            numero = scanner.nextInt();
            entero = true;
        } catch (InputMismatchException e) {
            System.out.println("debe introducir un numero entero");
        }finally{
            System.out.println("programa finalizado");
            //finally se ejecuta siempre independentemente
        }
        if(entero){
            System.out.println("el numero es " + numero);
        }
    }
}
