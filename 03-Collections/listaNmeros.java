/* Ejercicio: Crear un programa que cree una arraylist vacia
y añadir los numeros. Debe mostrar la lista, pedir
una posicion e introducir un nuevo numero en ella, pedir otra posicion
eliminar el elemento de esa posicion y mostrar la lista final y su tamaño
 */
import java.util.ArrayList;
import java.util.Scanner;
public class listaNmeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros= new ArrayList<>();
        int posicion;
        int nuevoNumero;
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
         System.out.println(numeros);
         Scanner scanner = new Scanner(System.in);
         System.out.println("introduzca una posicion");
          posicion = scanner.nextInt();
         System.out.println("introduzca un nuevo numero");
          nuevoNumero = scanner.nextInt();
          numeros.set(posicion, nuevoNumero);
         System.out.println(numeros);
         System.out.println("que posicion quiere eliminar");
          posicion = scanner.nextInt();
          numeros.remove(posicion);
         System.out.println(numeros);
         System.out.println("tiene tamaño de " + numeros.size());
        scanner.close();
    }
}
