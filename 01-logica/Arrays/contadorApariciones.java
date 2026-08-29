public class contadorApariciones {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 4, 2, 4, 9, 7, 4};
        int apariciones = 0;
        for (int i = 0; i < numeros.length; i++) {
         if (numeros[i] == 4){
            apariciones++;
         }
      }
      System.out.println("el numero 4 aparece "+ apariciones + " veces");
    }
}
