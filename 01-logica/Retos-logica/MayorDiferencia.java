import java.util.Scanner;
public class MayorDiferencia {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int mayorDiferencia = 0;
        int mayorDiferenciatemporal = 0;
        int posicionPrimera = 0;
        int posicionSegunda = 0;
          Scanner scanner = new Scanner(System.in);
           System.out.println("introduzca 10 numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        for (int i = 1; i < numeros.length; i++) {
            mayorDiferenciatemporal = Math.abs(numeros[i]-numeros[i-1]);
            if (mayorDiferencia < mayorDiferenciatemporal) {
                mayorDiferencia = mayorDiferenciatemporal;
                 posicionPrimera = i-1;
                 posicionSegunda = i;
        }
            }
            
        System.out.println("mayor diferencia: " + mayorDiferencia);
        System.out.println("posicion " + posicionPrimera + " y " + posicionSegunda);
    }
    }   

