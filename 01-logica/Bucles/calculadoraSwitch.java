import java.util.Scanner;
public class calculadoraSwitch {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        String opcion;
        double resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un numero");
        numero1 = scanner.nextDouble();
        System.out.println("introduzca otro numero");
        numero2 = scanner.nextDouble();

        System.out.println("que operacion desea realizar");
        opcion = scanner.next();
        switch (opcion) {
            case "sumar":
                resultado = numero1 + numero2;
                System.out.println("el resultado es " + resultado);
                break;
            case "restar":
                resultado = numero1 - numero2;
                 System.out.println("el resultado es " + resultado);
                break;
            case "multiplicar":
                resultado = numero1 * numero2;
                 System.out.println("el resultado es " + resultado);
                break;
            case "dividir":
                if (numero2 == 0) {
                    System.out.println("no se puede dividir entre 0");
                    break;
                }else{
                resultado = numero1 / numero2;
                 System.out.println("el resultado es " + resultado);
                break;
            }
            default:
                System.out.println("la operación no se puede realizar");
                break;
        }
        scanner.close();
    }
}
