/* Ejercicio: pedir al usuario que introsuzca 10 numeros 
comparar con la posicion que viene a continuacion y determinar
en cuantas situaciones es mayor menor o igual
 */
import java.util.Scanner;
public class posicionesConsecutivas {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int mayores = 0;
        int menores = 0;
        int iguales = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca 10 numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            }
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[i - 1]) {
                mayores++;
            }else if(numeros[i] < numeros[i - 1]){
                menores++;
            }else{
                iguales++;
            }
        } 
        if (mayores > menores && mayores > iguales) {
            System.out.println("la situacion que mas aparece mayores");
        }else if (menores > mayores && mayores > iguales) {
            System.out.println("la situacion que mas aparece menores"); 
        }else{
            System.out.println("la situacion que mas aparece iguales");
        }
        System.out.println("mayores: " + mayores);
        System.out.println("menores: " + menores);
        System.out.println("iguales: " + iguales);
    }
}
