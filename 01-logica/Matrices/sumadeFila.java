public class sumadeFila {
    public static void main(String[] args) {
        int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
      };
      for (int i = 0; i < matriz.length; i++) {
        int total = 0;
        for (int j = 0; j < matriz[i].length; j++) {
            total = total + matriz[i][j];
        }
        System.out.println("el total de la fila " + i +  " es "+ total);
    }
  }
}
