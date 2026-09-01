public class contadoParimpar {
    public static void main(String[] args) {
       int[][] matriz = {
       {4, 7, 2},
       {9, 6, 1},
       {8, 3, 5}
      };
      int contadorPar = 0;
      int contadorImpar = 0;
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] % 2 == 0) {
                contadorPar++;
            }else{
                contadorImpar++;
            }
        }
      }
      System.out.println("hay " + contadorPar + " numeros pares y " + contadorImpar + " numeros impares" );
    }
}
