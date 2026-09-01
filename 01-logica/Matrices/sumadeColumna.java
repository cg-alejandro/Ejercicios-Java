public class sumadeColumna {

    public static void main(String[] args) {
        int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
      };
      for (int j = 0; j < matriz[0].length; j++) {
        int total =0;
        for (int i = 0; i < matriz.length; i++) {
            total = total + matriz[i][j];
        }
       System.out.println("el total de la columna "+ j + " es " + total);
      }
    }
}