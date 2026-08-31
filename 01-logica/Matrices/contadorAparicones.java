import java.util.Scanner;
public class contadorAparicones {
    public static void main(String[] args) {
        int[][] matriz = {
         {2, 5, 2},
         {7, 2, 9},
         {2, 4, 6}
        };
        int contador = 0;
        int numeroIntroducido;
        Scanner scanner = new Scanner(System.in);
          System.out.println("introduzca un numero");
        numeroIntroducido = scanner.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(numeroIntroducido == matriz[i][j]){
                    contador++;
                }
            }
        }
        if (contador == 0) {
            System.out.println("el numero no aparece en la matriz");
        }else{
        System.out.println("el numero aparece " + contador + " veces");
        }
    }
}
