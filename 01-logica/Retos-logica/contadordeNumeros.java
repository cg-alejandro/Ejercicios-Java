/* Ejercicio: Crear un programa que pida al usuario 10 numeros 
tras esto se debe ver en pantalla cuantos numeros positivos, negativos,
cuantos 0 y cual fue la suma total

 */
import java.util.Scanner;
public class contadordeNumeros {

    public static void main(String[] args) {
        int contadorNegativos = 0;
        int contadorPositivos = 0;
        int contador = 0;
        int contadorCero = 0;
        int sumaTotal = 0;
        int numeroIntroducido;
        Scanner scanner = new Scanner(System.in);
        do{
           System.out.println("introduzca un numero");
           numeroIntroducido = scanner.nextInt();
           contador++;
           sumaTotal = sumaTotal + numeroIntroducido;
           if (numeroIntroducido == 0) {
              contadorCero++;
           }else if (numeroIntroducido > 0) {
              contadorPositivos++;
           }else{
            contadorNegativos++;
           }
        }while(contador != 10);
        System.out.println(contadorCero + " numeros introducidos fueron 0");
        System.out.println(contadorPositivos + " numeros introducidos fueron positivos");
        System.out.println(contadorNegativos + " numeros introducidos fueron negativos");
        System.out.println(sumaTotal + " fue la suma total");
        scanner.close();
    }
}
