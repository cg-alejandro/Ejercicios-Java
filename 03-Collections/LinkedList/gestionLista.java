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
    }
}
