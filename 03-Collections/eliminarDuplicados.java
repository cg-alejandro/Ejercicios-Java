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
        for (int i = 1; i < 10; i++) {
            int contadorRepetido = 0;
            if (numeros.get(i) != numeros.get(i - 1)) {
               sinDuplicados.add(numeros.get(i));
               contador++;
            }
        }
        int eliminados = contador - 10;
        System.out.println(sinDuplicados);
        System.out.println("se eliminaron " + eliminados);
    }
}