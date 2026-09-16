import java.util.ArrayList;
import java.util.Scanner;
public class listaNombres {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nombreIntroducido;
        System.out.println("introduzca 5 nombres");
            for (int i = 0; i < 5; i++) {
              nombreIntroducido = scanner.nextLine();
              nombres.add(nombreIntroducido);
            }
            
            System.out.println(nombres);
            System.out.println("hay " + nombres.size() + " nombres en la lista");
            System.out.println("introduzca un nombre para buscar");
            nombreIntroducido = scanner.nextLine();
            if (nombres.contains(nombreIntroducido)) {
                System.out.println("esta en la lista");
            }else{
                System.out.println("no esta en la lista");
            }
        }
}