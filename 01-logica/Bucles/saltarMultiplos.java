/* Ejercicio: Hacer un programa que recorra los numeros del 1 al 20
saltando los multiplos de 2 y contando cuantos numeros
aparecen en pantalla
 */
public class saltarMultiplos {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                continue;
                
            }
        contador++;
         System.out.println(i);
        }
        System.out.println("se han mostrado "+ contador);
    }
}
