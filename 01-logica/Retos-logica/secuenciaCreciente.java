/* Ejercio: Crear un programa que pida numeros al usuario
continuamente al terminar debe mostrar si la secuencia fue creciente o no
 */
import java.util.Scanner;
public class secuenciaCreciente {
    public static void main(String[] args) {
        int numeroIntroducido;
        int numeroAnterior;
        boolean creciente = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un numero");
           numeroAnterior = scanner.nextInt();
        do{
        System.out.println("introduzca un numero");
           numeroIntroducido = scanner.nextInt();
           if (numeroIntroducido == 0) {
             System.out.println("programa finalizado");
           }else{
           if (numeroIntroducido > numeroAnterior) {
             numeroAnterior = numeroIntroducido;
           }else if(numeroIntroducido <= numeroAnterior){
            creciente = false;
            numeroAnterior = numeroIntroducido;
           }
         }
        }while(numeroIntroducido != 0);
        if (creciente) {
            System.out.println("la secuencia es creciente");
           }else{
            System.out.println("la secuencia no es creciente");
           }
       scanner.close();
    }
}
