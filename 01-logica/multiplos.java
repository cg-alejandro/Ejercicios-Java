/*
Ejercicio: multiplo
pedir al usuario un numero, comprobar varias condiciones y determinar
si el numero ingresado es multiplo de 2 y 3
*/
import java.util.Scanner;


public class multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
           System.out.println ("ingrese un numero");
         int numero = scanner.nextInt();  
      if(numero % 2 == 0 && numero % 3 == 0 ) {
        System.out.println("el numero es multiplo de 2 y 3");
      }else if (numero % 2 == 0 || numero % 3 == 0){
        System.out.println("el numero es multiplo de 2 o 3 ");
       }
      else{
        System.out.println("no es multiplo ni de 2 ni de 3");
         }
       scanner.close();
    }
    
}
