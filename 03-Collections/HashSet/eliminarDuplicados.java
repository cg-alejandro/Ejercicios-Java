/* Ejercicio: Crear un programa que tenga un array, luego debe crear
un HasSet recorrer el array y añadir cada numero, mostrar el resultado
y cuantos numeros diferentes habia.
 */
import java.util.HashSet;
public class eliminarDuplicados {

    public static void main(String[] args) {
        int[] numeros = {4, 7, 4, 2, 7, 9, 2, 4, 1, 9};
        HashSet<Integer> sinDplicados = new HashSet();
        for (int i = 0; i < numeros.length; i++) {
            sinDplicados.add(numeros[i]);
        }
        System.out.println(sinDplicados);
        System.out.println(sinDplicados.size() + " numeros diferentes");
    }
}