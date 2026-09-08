/* Ejercicio: pedir al usuario 10 numeros compararlos
y determinar cuales son mayores, menores e iguales
que el anterior y cual es la mayor diferencia
 */
import java.util.Scanner;
public class numerosRepetidos {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int mayores = 0;
        int menores = 0;
        int iguales = 0;
        int mayorDiferencia = 0;
        int mayorTemporal;
        int numeroIntroducido;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un numero");
        numeros[0] = scanner.nextInt();
        contador++;
         for (int i = 1; i < numeros.length; i++) {
             numeroIntroducido = scanner.nextInt();
            numeros[i] = numeroIntroducido;
           if (numeros[i] > numeros[i - 1]) {
                    mayores++;
                    contador++;
                }else if (numeros[i] == numeros[i - 1]) {
                    iguales++;
                }else{
                    menores++;
                    contador++; 
                }
              mayorTemporal = Math.abs(numeros[i] - numeros[i - 1]);
            if (mayorTemporal > mayorDiferencia) {
                mayorDiferencia = mayorTemporal;

            }    
         } 
            System.out.println(mayores + " son mayores que el anterior");
             System.out.println(menores + " son menores que el anterior");
             System.out.println(iguales + " son iguales que el anterior");
             System.out.println(mayorDiferencia + " es la mayor diferencia");
 }
}