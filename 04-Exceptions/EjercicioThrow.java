/* Ejercicio: Hacer un programa que pida una edad, si la edad
es menor que 0 debes lanzar una IllegalArgumentException si
es valida muestra la edad
 */
import java.util.Scanner;
public class EjercicioThrow {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    int edad = 0;
    boolean valida = false;
    System.out.println("introduzca su edad");
    try {
        edad = scanner.nextInt();
        valida = true;
        if (edad < 0) {
            throw new  IllegalArgumentException("edad no valida");
        } //controla excepiones personalizadas.
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        }
        if (valida) {
            System.out.println("la edad es de " + edad + " años");
        }
    }
}
