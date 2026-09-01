import java.util.Scanner;
public class filaColumna {
    public static void main(String[] args) {
        int[][] matriz = {
        {4, 8, 2},
        {7, 1, 9},
        {3, 6, 5}
      };
      int numeroIntroducido;
      int contadorPares = 0;
        Scanner scanner = new Scanner(System.in);
          System.out.println("introduzca un numero de fila");
        numeroIntroducido = scanner.nextInt();
        if (numeroIntroducido < 0 || numeroIntroducido >= matriz.length) {
                System.out.println("la fila introducida no existe");
            }else{
         for (int j = 0; j < matriz[numeroIntroducido].length; j++){
            if(matriz[numeroIntroducido][j] % 2 == 0){
            contadorPares++;
            }
         }
    }
    System.out.println("la fila tiene " + contadorPares + " numeros pares");
  }
}