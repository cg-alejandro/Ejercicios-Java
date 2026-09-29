/* Ejercicio: crear un menu para gestionar una cola debera de 
pedir un nombre y lo añade al final, atiende y elimina a la primera persona,
pide un nombre y lo añade al principio, simulando una prioridad
muestra quién será atendido próximamente, sin eliminarlo, muestra toda la cola.
muestra cuántas personas quedan y termina el programa.
 */
import java.util.LinkedList;
import java.util.Scanner;
public class GestorTurnos {
    public static void main(String[] args) {
        LinkedList<String> turnos = new LinkedList<>();
        int opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Gestor turnos----");
        System.out.println("1.- añadir persona al final de la cola");
        System.out.println("2.- atender siguiente persona");
        System.out.println("3.- añadir persona con prioridad");
        System.out.println("4.- mostrar siguiente persona");
        System.out.println("5.- mostrar todas las personas");
        System.out.println("6.- mostrar numero de personas");
        System.out.println("7.- salir");
        do {
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("introduzca un nombre");
                    turnos.addLast(scanner.nextLine());
                    System.out.println("añadido con exito");
                    break;
                case 2:
                    if (turnos.size() > 0) {
                    System.out.println(turnos.getFirst() + " esta siendo atendido");
                    turnos.removeFirst();
                    }else{
                        System.out.println("no hay nadie en la cola");
                    }
                    
                    break;
                case 3:
                    System.out.println("introduzca un nombre");
                    turnos.addFirst(scanner.nextLine());
                    System.out.println("persona con prioridad añadida");
                    break;
                case 4:
                    if (turnos.size() > 0) {
                        System.out.println("sera atendido enseguida " + turnos.get(0));
                    }else{
                        System.out.println("no hay nadie en la cola");
                    }
                    break;
                case 5:
                    System.out.println(turnos);
                    break;
                case 6:
                    System.out.println(turnos.size());
                    break;
                case 7:
                    System.out.println("hasta pronto");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opcion != 7);
        scanner.close();
    }
}
