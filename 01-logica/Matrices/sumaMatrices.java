public class sumaMatrices {
    public static void main(String[] args) {
        int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int total = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            total = total + matriz[i][j];
            System.out.print(matriz[i] [j]);
        }
        System.out.println();
    }
    System.out.println("el total es " + total);
    }
}
