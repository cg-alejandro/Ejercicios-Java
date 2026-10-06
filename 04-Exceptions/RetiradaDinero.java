/* Ejercicio: Crear un programa de retiro de dinero, pide cuanto retirar
al usuario controlar las cantidades no validas con excepciones
si todo es correcto, realizar el retiro y muestra el nuevo saldo
 */
import java.util.Scanner;
public class RetiradaDinero {
    public static void main(String[] args) {
        double cuentaSaldo = 500;
        double cantidadRetirar;
        boolean retiradaExitosa = false;
        System.out.println("Introduzca la cantidad para retirar");
        Scanner scanner = new Scanner(System.in);
        try {
            cantidadRetirar = scanner.nextDouble();
            if (cantidadRetirar <= 0){
                throw new  IllegalArgumentException("cantidad no valida");
            }
            if (cantidadRetirar > cuentaSaldo) {
                throw new  IllegalArgumentException("No hay suficiente saldo");
            }
            if (cantidadRetirar <= cuentaSaldo && cantidadRetirar > 0) {
              cuentaSaldo = cuentaSaldo - cantidadRetirar;
              retiradaExitosa = true;  
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        if (retiradaExitosa) {
        System.out.println("el nuevo saldo es de: " + cuentaSaldo);

        }
    }
}
