/* Ejercicio: Crear una lista cola, mientras queden personas en la cola
mostrar quien esta siendo atendido, eliminar a esa persona, mostrar cuantas quedan
mostrar un mensaje cuando no queden personas en la cola.
NO se puede utilizar for con un numero fijo de vueltas
 */
import java.util.LinkedList;
public class procesoCola {
    public static void main(String[] args) {
            LinkedList<String> cola = new LinkedList<>();
            cola.addLast("Ana");
            cola.addLast("Juan");
            cola.addLast("Pedro");
            cola.addLast("Laura");
            cola.addLast("Carlos");
            do{
                System.out.println(cola.get(0) + " esta siendo atendido");
                cola.removeFirst();
                System.out.println(cola.size() + " quedan por ser atendidos");
            
            }while(cola.size() != 0);
       System.out.println("la cola esta vacia");
  }
}
