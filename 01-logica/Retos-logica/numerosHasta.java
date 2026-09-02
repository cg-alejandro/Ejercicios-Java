/* Ejercicio: Crear un programa que pida numeros al usuario
continuamente al terminar debe mostrar Cuántos números se introdujeron.
el numero mayor el numero menor y la suma de todos los números
el 0 no cuenta como numero introducido no participa en la suma,
mayor o menor el programa finaliza cuando se instrodce 0
 */
import java.util.Scanner;
public class numerosHasta {

    public static void main(String[] args) {
        int mayor;
        int menor;
        int contador = 0;
        int suma = 0;
        int numeroIntroducido;
         Scanner scanner = new Scanner(System.in);
         System.out.println("introduzca un numero");
         numeroIntroducido = scanner.nextInt();
            mayor = numeroIntroducido;
            menor = numeroIntroducido;
        if (numeroIntroducido == 0) {
            System.out.println("programa finalizado sin valores");
        }else{
            contador++;
            suma = numeroIntroducido;
         do{
            System.out.println("introduzca un numero");
            numeroIntroducido = scanner.nextInt();
            if (numeroIntroducido == 0) {
                System.out.println("programa finalizado");
                break;
            }else{
            contador++;
            suma = suma + numeroIntroducido;
            if (numeroIntroducido > mayor && numeroIntroducido != 0 ) {
                mayor = numeroIntroducido;
            }if(numeroIntroducido < menor && numeroIntroducido != 0) {
               menor = numeroIntroducido;
            }
        }
         }while(numeroIntroducido != 0);
        
         System.out.println("cantidad de numeros: " + contador);
         System.out.println("numero menor: " + menor);
         System.out.println("numero mayor: " + mayor);
         System.out.println("el total de la suma de los numeros: " + suma);
         
         } 
         scanner.close();
    }
}