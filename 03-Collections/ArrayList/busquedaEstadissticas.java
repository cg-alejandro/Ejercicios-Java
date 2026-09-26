/* Ejercicio: Crear un arrayList pedir 8 numeros al usuario y añadirlos a la lista
debe calcular la suma, la media, el numero mayor y el menor ademas
de utilizar busqueda que pida numero al usuario, contar cuantas veces 
aparece y mostrar la posicion de su primera aparicion 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class busquedaEstadissticas {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        double suma = 0;
        double media = 0; 
        int contador = 0;
        int posicionAparicion = -1;
        Scanner scanner = new Scanner(System.in);
         System.out.println("introduzca 8 numeros");
         for (int i = 0; i < 8; i++) {
            numeros.add(scanner.nextDouble());
         }
        double numeroMayor = numeros.get(0);
        double numeroMenor = numeroMayor;
         for (int i = 0; i < numeros.size(); i++) {
            suma = numeros.get(i) + suma;
            media = suma / 8;
            if (numeros.get(i) > numeroMayor) {
                numeroMayor = numeros.get(i);
            }
            if (numeroMenor > numeros.get(i)) {
                numeroMenor = numeros.get(i);
            }
         }
        System.out.println("la suma es " + suma);
        System.out.println("la media es " + media);
        System.out.println("el numero mayor es " + numeroMayor);
        System.out.println("el numero menor es " + numeroMenor);
        System.out.println("Introduzca un numero para buscar");
        double numeroBusqueda = scanner.nextDouble();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeroBusqueda == numeros.get(i)) {
                contador++;
                if (contador == 1) {
                    posicionAparicion = i;
                }
            }
     }
     System.out.println("aparece " + contador + " veces");
     System.out.println("aparece pro primera vez " + posicionAparicion);
     scanner.close();
    }
}
