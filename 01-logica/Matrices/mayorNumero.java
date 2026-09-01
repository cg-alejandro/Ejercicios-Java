public class mayorNumero {

    public static void main(String[] args) {
        int[][] matriz = {
        {12, 5, 8},
        {21, 3, 17},
        {9, 25, 6}
      }; 
    int mayorNumero = matriz[0][0];
    int menorNumero = matriz[0][0];
    int posicionFilamayor = 0;
    int posicionColumnamayor = 0;  
    int posicionFilamenor = 0;
    int posicionColumnamenor = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] > mayorNumero) {
                mayorNumero = matriz[i][j];
                posicionFilamayor = i;
                posicionColumnamayor = j;
            }
            if (matriz[i][j] < menorNumero) {
                menorNumero = matriz[i][j];
                posicionFilamenor = i;
                posicionColumnamenor = j;
            }
        }
    }
    System.out.println("el numero mayor es " + mayorNumero);
    System.out.println("esta en la fila " + posicionFilamayor);
    System.out.println("y la columna " + posicionColumnamayor);
    System.out.println("el numero menor es " + menorNumero);
    System.out.println("esta en la fila " + posicionFilamenor);
    System.out.println("y la columna " + posicionColumnamenor);
    }
}