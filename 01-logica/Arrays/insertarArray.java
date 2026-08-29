/*
Ejercicio: Dado un array, insertar un elemento en la posicion 2
 */
public class insertarArray {

    public static void main(String[] args) {
        int[] numeros = {4, 7, 9, 6};
        int[] numerosMayores = new int [numeros.length+1];
        for (int i = 0; i < numeros.length; i++){
            if (i >= 2){
                numerosMayores[i+1]= numeros[i];
            }else {
                numerosMayores[i]= numeros[i];
            }
    }
    numerosMayores[2] = 5;
    for ( int i = 0; i <numerosMayores.length; i++){
            System.out.println(numerosMayores[i]);
  } 
 }
}