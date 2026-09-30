import java.util.HashSet;
import java.util.Scanner;
public class usuariosRegistrados {
    public static void main(String[] args) {
        HashSet<String> ausuario = new HashSet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.- Registrar usuario");
        System.out.println("2.- Comprobar usuario");
        System.out.println("3.- Mostrar usuarios");
        System.out.println("4.- Mostrar cantidad");
        System.out.println("5.- Salir");
        int opcion;
        do {
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    boolean ocupado = false;
                    do{
                        System.out.println("elija su nombre de usuario");
                        String nombreIntroducido =scanner.nextLine();
                        if(ausuario.contains(nombreIntroducido)){
                           System.out.println("nombre ocupado inserte otro nombre");
                        }else{
                           ausuario.add(nombreIntroducido);
                           ocupado = true;
                        }
                    }while (ocupado != true);
                    
                    break;
                case 2:
                    System.out.println("introduce un nombre para comprobar");
                    if (ausuario.contains(scanner.nextLine())) {
                        System.out.println("el nombre esta ocupado");
                    }else{
                        System.out.println("el nombre no esta ocupado");
                    }
                    break;
                case 3:
                    System.out.println(ausuario);
                    break;
                case 4:
                    System.out.println(ausuario.size());
                    break;
                case 5:
                    System.out.println("hasta pronto");
                    break;
            
                default:
                    System.out.println("opcion no valida");
                    break;
            }

        } while (opcion != 5);
    }
}
