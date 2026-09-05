/* Ejercicio: Pedir al usuario 10 numeros y calcular la media el numero
mas cercano a la media y su posicion 
 */
import java.util.Scanner;
public class numeroCercano {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        double media = 0;
        double suma = 0;
        double numeroCercano = 0;
        double primeraDiferencia = 0;
        int posicion = 0;
        Scanner scanner = new Scanner(System.in);
           System.out.println("introduzca 10 numeros");
           for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
             suma = numeros[i] + suma;
             media = suma / 10;
           }
           primeraDiferencia = Math.abs(numeros[0] - media);
           for (int i = 0; i < numeros.length; i++) {
           double diferenciaTemporal = Math.abs(numeros[i] - media);
           if (diferenciaTemporal < primeraDiferencia) {
             primeraDiferencia = diferenciaTemporal;
             posicion = i;
             numeroCercano = numeros[i];
           }
           
        }
        System.out.println("media: " + media);
        System.out.println("numero mas cercano: " + numeroCercano);
        System.out.println("posicion: " + posicion);
  }
}
