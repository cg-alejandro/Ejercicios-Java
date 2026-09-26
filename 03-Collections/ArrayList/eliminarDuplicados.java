/*Ejercico: crear un programa que pida 10 numeros y añadirlos a una
lista, luego crera otra lista donde no esten los numeros duplicados
mostrar la lista y contar cuanos elementos se eliminaron
*/
import java.util.ArrayList;
import java.util.Scanner;
public class eliminarDuplicados {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> sinDuplicados = new ArrayList<>();
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
         System.out.println("introduzca 10 numeros");
         for (int i = 0; i < 10; i++) {
            numeros.add(scanner.nextInt());
    }
        System.out.println(numeros);
        for (int i = 0; i < numeros.size(); i++) {
           if (sinDuplicados.contains(numeros.get(i))) {
            contador++;
           }else{
            sinDuplicados.add(numeros.get(i));
           }
        }
        System.out.println(sinDuplicados);
        System.out.println("se eliminaron " + contador);
        scanner.close();
    }
}