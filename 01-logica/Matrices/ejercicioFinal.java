public class ejercicioFinal {
    public static void main(String[] args) {
        double[][] notas = {
        {5, 8, 7},
        {9, 4, 6},
        {10, 3, 8}
      };
      double notaMasalta = notas[0][0]; 
      int posicionFilamayor = 0;
      int posicionColumnamayor = 0;
      int contadorAprobados = 0;
      int contadorSuspendidos = 0;
       for (int i = 0; i < notas.length; i++) {
             double sumaNotas = 0;
            double notaMedia = 0;
        for (int j = 0; j < notas[i].length; j++) {
            sumaNotas = sumaNotas + notas[i][j]; 
            notaMedia = sumaNotas / notas[i].length;
            if(notas[i][j] > notaMasalta){
                notaMasalta = notas[i][j];
                posicionFilamayor = i;
                posicionColumnamayor = j;
            }
            if ( notas[i][j] >= 5) {
                contadorAprobados++;
            }else{
                contadorSuspendidos++;
            }
        }
        System.out.println("alumno " + i +  " media: "+ notaMedia);
    }
     System.out.println("la nota mas alta es " + notaMasalta + " en la fila " + posicionFilamayor + " y columna " + posicionColumnamayor);
     System.out.println("hay " + contadorAprobados + " aprobados y " + contadorSuspendidos + " suspendidos");
  }
}
