/* Ejercicio: Pedir al usuario 10 numeros calcular la racha
positiva mas larga y en que posicion empieza
 */
import java.util.Scanner;
public class numerosPositivos {

    public static void main(String[] args) {
         int[] numeros = new int[10];
         int rachaActual = 0;
         int rachaLarga = 0;
         int numeroIntroducido;
         int posicion = -1;
         int posicionDefinitiva = -1;
          Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca 10 numeros");
        for (int i = 0; i < numeros.length; i++) {
             numeroIntroducido = scanner.nextInt();
             numeros[i] = numeroIntroducido;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                    rachaActual++;
                    if (rachaActual == 1) {
                        posicion = i;
            }
                    if (rachaLarga < rachaActual) {
                        rachaLarga = rachaActual;
                        posicionDefinitiva = posicion;
                    }
              }else{
                    rachaActual= 0;
                }
            
            }      
  System.out.println("racha positiva mas larga: " + rachaLarga);
  System.out.println("empieza en la posicion: " + posicionDefinitiva);
   scanner.close();
 }
}