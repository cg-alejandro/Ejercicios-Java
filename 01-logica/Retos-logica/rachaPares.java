/*Crear un programa que pida numeros al usuario
continuamente al terminar debe mostrar cual fe la racha mas alta
*/
import java.util.Scanner;
public class rachaPares {
    public static void main(String[] args) {
        int numeroIntroducido;
        int contadorRacha = 0;
        int rachaAlta = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un numero");
        do{
           numeroIntroducido = scanner.nextInt();
        if (numeroIntroducido == 0) {
             System.out.println("programa finalizado");
             break;
           }
           
            {
                if (numeroIntroducido % 2 == 0 && numeroIntroducido % 2 == 0) {
                    contadorRacha++;
                    if (rachaAlta < contadorRacha) {
                        rachaAlta = contadorRacha;
                    }
                }else{
                    contadorRacha=0;
                }
            }
        }while(numeroIntroducido != 0);
           
      
      System.out.println("la racha mas alta es " + rachaAlta);
    scanner.close();
  }
}
