/* Ejercicio: Crea un array de enteros y encuentra el número mayor y el segundo mayor sin ordenar el array 
muestra ambos valores por consola.
 */
public class segundoMayor {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 6, 8};
        int mayor = numeros[0];
        int segundoMayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]> mayor){
                segundoMayor = mayor;
                mayor = numeros[i];
            }else if (numeros[i]> segundoMayor && numeros[i]< mayor ) {
                segundoMayor = numeros[i];
            }
        }
        System.out.println("el mayor es "+ mayor + " el segundo mayor es "+ segundoMayor);
    }
} 