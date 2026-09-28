/* Ejercicio: crear una lista de tareas que muestre la lista, busque una tarea
indicar si existe y mostrar su posicion, pedir una tarea nueva y
sustituirla en la posicion que se haya elegido, pedir una tarea para eliminar y mostrar la lista final
 */
import java.util.LinkedList;
import java.util.Scanner;
public class gestionLista {
    public static void main(String[] args) {
        LinkedList<String> tareas = new LinkedList<>();
        tareas.add("estudiar Java");
        tareas.add("hacer ejercicio");
        tareas.add("comprar");
        tareas.add("practicar Git");
        tareas.add("leer");
        String bscar;
         Scanner scanner = new Scanner(System.in);
         System.out.println("que tarea desea buscar");
         bscar = scanner.nextLine();
         if (tareas.contains(bscar)) {
            System.out.println("esta en la posicion " + tareas.indexOf(bscar));  
         }else{
            System.out.println("no esta la tarea en la lista");
         }
        System.out.println("introduzca una tarea para sustituirla");
          String otraBusqueda = scanner.nextLine();
          System.out.println("en que posicion desea introducirla");
          int posicion = scanner.nextInt();
          scanner.nextLine();
          tareas.set(posicion, otraBusqueda);
        System.out.println("que tarea desea eliminar");
        String busquedaEliminar = scanner.nextLine();
        if (tareas.contains(busquedaEliminar)) {
            tareas.remove(busquedaEliminar);
        }else{
            System.out.println("la tarea no esta en la lista");
        }
        System.out.println(tareas);
        scanner.close();
    }
}
