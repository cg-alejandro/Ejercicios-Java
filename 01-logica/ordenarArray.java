public class ordenarArray {

    public static void main(String[] args) {
        int[] numeros = {7, 2, 9, 4, 1};
        int temporal = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
           for (int j = i + 1; j < numeros.length; j++) {
            if(numeros[i] > numeros[j]){
                temporal = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temporal;
                
            }
           } 
        }for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}