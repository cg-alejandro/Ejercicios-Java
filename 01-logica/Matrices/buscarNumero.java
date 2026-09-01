import java.util.Scanner;
public class buscarNumero {

    public static void main(String[] args) {
       int[][] matriz = {
        {4, 8, 2},
        {7, 1, 9},
        {3, 6, 5}
     };
     int numeroIntroducido;
        Scanner scanner = new Scanner(System.in);
          System.out.println("introduzca un numero");
        numeroIntroducido = scanner.nextInt();
        boolean encontrado = false; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numeroIntroducido == matriz[i][j]) {
                   encontrado = true;
                   break;
            }
            if (encontrado) {
                break;
            }
        } 
    }
    if (encontrado) {
        System.out.println("el numero esta en la matriz");
    }else{
        System.out.println("el numero no esta en la matriz");
    }
    scanner.close();
  }
}