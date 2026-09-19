/* Ejercicio: pide al usuario 10 numeros y guardalos en una lista
luego filtra los numeros introducidos y meterlos en una lista de numeros pares
debe mostrar las 2 listas, calcular la suma, mostrar cuantos pares hay
y finalmente pedir al usuario un numero y buscarlo en la lista de pares
 */
import java.util.ArrayList;
import java.util.Scanner;
public class filtrarLista {
    public static void main(String[] args) {
       ArrayList<Integer> numeros = new ArrayList<>();
       ArrayList<Integer> pares = new ArrayList<>();
       int sumaPares = 0;
       int contadorPares = 0;
       Scanner scanner = new Scanner(System.in);
       for (int i = 0; i < 10; i++) {
        numeros.add(scanner.nextInt());
       }
       for (int i = 0; i < numeros.size(); i++) {
        if(numeros.get(i) % 2 == 0){
           pares.add(numeros.get(i)); 
           contadorPares++;
          }
       }
       for (int i = 0; i < pares.size(); i++) {
        sumaPares = sumaPares + pares.get(i);
       }
       System.out.println(numeros);
       System.out.println(pares);
       System.out.println("hay " + contadorPares + " pares");
       System.out.println("la suma de los pares es " + sumaPares);
       System.out.println("introduce un numero para buscar en la lista de pares");
       int numeroBusqueda = scanner.nextInt();
       if (pares.contains(numeroBusqueda)) {
         System.out.println("el numero esta en la lista");
       }else{
        System.out.println("el numero no esta en la lista");
       }
    }
}
