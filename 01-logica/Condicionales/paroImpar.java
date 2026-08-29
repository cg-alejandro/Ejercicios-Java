/*
Ejercicio: numero par o impar
Pedir al usuario un numero y comprobar si es par o impar

*/
import java.util.Scanner;


public class paroImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int nmero = scanner.nextInt();
           if(nmero % 2 ==0){
            System.out.println("el numero es par");
           }else{
            System.out.println("el numero es impar");
           }
           scanner.close();
    }
    
}
