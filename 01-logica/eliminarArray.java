/*
Ejercicio: Dado un array, eliminar la segunda posición
 */
public class eliminarArray {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 6};
        int[] numerosPeqeño = new int [numeros.length-1];
        int posicion = 0;
        for (int i = 0; i < numeros.length; i++){
            if (i != 2){
              numerosPeqeño[posicion] = numeros[i];
              posicion++;
        }
            }
        for ( int nuevaPosicion = 0; nuevaPosicion <numerosPeqeño.length; nuevaPosicion++){
            System.out.println(numerosPeqeño[nuevaPosicion]);
        }      
            
    }
}
