/*Ejercicio : Pedir al usuario un numero entre 1 y 10 
si esta fuera de ranfo volver a pedirlo 
*/
import java.util.Scanner;
public class numeroEntre {
   public static void main(String[] args) {
    int numeroIntroducido;
    Scanner scanner =new Scanner(System.in);
    do{
        System.out.println("introduzca un numero");
        numeroIntroducido = scanner.nextInt(); 
        if (numeroIntroducido >= 1 && numeroIntroducido <= 10) {
            System.out.println("el numero esta en el rango correcto");
        }
    }while(numeroIntroducido < 1 || numeroIntroducido > 10);
   scanner.close();
}
    
}