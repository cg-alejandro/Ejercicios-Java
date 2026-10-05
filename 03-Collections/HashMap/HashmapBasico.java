/* Ejercicio: Crear un HashMap añadir 5 alumnos con sus notas
pedir el nombre de un alumno, si existe mostrar su nota y si no existe indicarlo.
mostrar cuantos alumnos hay. 
 */
import java.util.HashMap;
import java.util.Scanner;

public class HashmapBasico {
    public static void main(String[] args) {
        HashMap<String , Double> alumnos = new  HashMap<>();
        alumnos.put("Ana" , 6.4);
        alumnos.put("Rosa" , 3.3);
        alumnos.put("Miguel" , 5.9);
        alumnos.put("Pepe" , 3.4);
        alumnos.put("Rocio" , 9.4);
        System.out.println("Introduzca el nombre de un alumno para buscar");
        Scanner scanner = new Scanner(System.in);
        String busqueda = scanner.nextLine();
        if (alumnos.containsKey(busqueda)) {
            System.out.println("el alumno tiene nota de " + alumnos.get(busqueda));
        }else{
            System.out.println("el alumno no se encontró");
        }
        System.out.println("hay " + alumnos.size() + " alumnos");
        scanner.close();
    }
}
