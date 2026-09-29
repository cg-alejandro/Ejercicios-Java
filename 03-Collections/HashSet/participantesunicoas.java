/* Ejercicio: crear un programa que gestione participantes de una actividad
al finalizar debe Mostrar todos los participantes, mostrar cuántos participantes únicos hay
y pedir un nombre y comprobar si está participando.
 */
import java.util.HashSet;
import java.util.Scanner;
public class participantesunicoas {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca nombres");
        String nombreIntroducido;
        do {
            nombreIntroducido = scanner.nextLine();
            if (nombres.contains(nombreIntroducido)) {
                System.out.println("el nombre esta ya en la lista");
            }else if (! nombreIntroducido.equals("fin")) {
                nombres.add(nombreIntroducido);
            }
        } while (! nombreIntroducido.equals("fin"));
        System.out.println(nombres);
        System.out.println("hay " + nombres.size() + " participantes");
        System.out.println("introduzca un participante para buscar");
        nombreIntroducido = scanner.nextLine();
        if (nombres.contains(nombreIntroducido)) {
            System.out.println("esta participando");
        }else{
            System.out.println("no esta participando");
        }
    }
}
