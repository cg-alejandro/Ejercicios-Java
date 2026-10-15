/* Ejercicio: Crear array de enteros y comprobar con bucles for si contiene números repetidos
mostrar por consola si existen o no valores duplicados.
 */
public class repeticion {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 4, 9, 7};
        boolean repetido = false;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1 ; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]){
                    repetido = true;
                }
            }if(repetido){
            break;
        }
        }if(repetido){
            System.out.println("hay numeros repetidos");
        }else{
            System.out.println("no hay numeros repetidos");
        }
       
    }
}
