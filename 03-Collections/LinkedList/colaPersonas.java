/* Ejercicio: crear una lista de cola Mostrar la cola.
eliminar a la primera persona de la cola.
mostrar quién ha salido.
mostrar la cola resultante.
añadir "Marta" al final.
mostrar la cola final.
 */
import java.util.LinkedList;
public class colaPersonas {

    public static void main(String[] args) {
        LinkedList<String> cola = new LinkedList<>();
        cola.addLast("Ana");
        cola.addLast("Juan");
        cola.addLast("Pedro");
        cola.addLast("Laura");
        cola.addLast("Carlos");
        System.out.println(cola);
        System.out.println(cola.getFirst() + " ha salido de la cola");
        cola.removeFirst();
        System.out.println(cola + "siguen en la cola");
        cola.addLast("Marta");
        System.out.println(cola);
    }
}