/* Ejercicio: Crea un array de enteros y calcula la suma de todos sus elementos y su media aritmética utilizando un bucle for 
muestra ambos resultados por consola.
 */
public class sumayMedia {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 6};
        int suma = 0;
        double media = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        double sumaDecimal = suma;
        media = sumaDecimal / numeros.length;
        System.out.println("La suma total es " + suma + " y la media es "  + media );

    }
    
}
