/* Ejercicio: Crear un programa que muestre un menu pero 
que el programa no termine hasta que el usuario no decida salir
 */
import java.util.Scanner;
public class menuRepetido {
    public static void main(String[] args) {
        int opcion;
        int numeroIntroducido;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----MENU----");
        System.out.println("1. Saludar");
        System.out.println("2. Mostrar numero");
        System.out.println("3. Comprobar si es par");
        System.out.println("4. Salir");
        do{
           opcion = scanner.nextInt();
           switch (opcion) {
            case 1:
                System.out.println("Hola mundo");
                break;
            case 2:
                System.out.println("introduce un numero");
                numeroIntroducido = scanner.nextInt();
                System.out.println("Tu numero es " + numeroIntroducido);
                break;
            case 3:
                System.out.println("introduce un numero");
                numeroIntroducido = scanner.nextInt();
                if (numeroIntroducido % 2 == 0) {
                    System.out.println("el numero es par");
                }else{
                    System.out.println("el numero es impar");
                }
                break;
            case 4: 
                System.out.println("hasta luego");
                break;
            default:
                System.out.println("opcion no valida");
                break;
           }
        }while (opcion != 4);
        scanner.close();
    }
}
