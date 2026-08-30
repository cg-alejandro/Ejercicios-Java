import java.util.Scanner;
public class opcionesSwitch {
    public static void main(String[] args) {
        int numeroIntroducido;
        Scanner scanner = new Scanner(System.in);
        System.out.println("seleccione un numero");
        numeroIntroducido = scanner.nextInt();
        switch (numeroIntroducido) {
            case 1:
                System.out.println("Hola mundo");
                break;
            case 2:
                System.out.println("Estoy aprendiendo java");
                break;
            case 3: 
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Numero no valido");
                break;
        }
        scanner.close();
    }
}
