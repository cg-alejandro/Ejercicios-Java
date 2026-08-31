/*
Ejercicio: Suma de numeros enteros 
Pedir al usuario qe ingrese 2 numeros y realizar el calculo

*/
import java.util.Scanner;


public class suma{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numa = scanner.nextInt();
        System.out.println("ingrese otro numero " );
       int numb = scanner.nextInt();
      int totalnm = numa + numb;
    
    System.out.println("el resultado es " + totalnm );
       
        scanner.close();
    }
}