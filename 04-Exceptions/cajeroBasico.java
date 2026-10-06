import java.util.InputMismatchException;
import java.util.Scanner;
public class cajeroBasico {
    public static void main(String[] args) {
        double cuentaSaldo = 500;
        double cantidadRetirar;
        double cantidadIngresar;
        int opcion = 0;
        System.out.println("---Operaciones---");
        System.out.println("1.-Consultar saldo");
        System.out.println("2.-Ingresar dinero");
        System.out.println("3.-Retirar dinero");
        System.out.println("4.-Salir");
        Scanner scanner = new Scanner(System.in);
        do {
           try {
            opcion = scanner.nextInt();
           switch (opcion) {
            case 1:
                System.out.println("su saldo es de: " + cuentaSaldo);
                break;
            case 2:
                System.out.println("seleccione la cantidad a ingresar");
                try{
                cantidadIngresar = scanner.nextDouble();
                if (cantidadIngresar <= 0) {
                    throw new IllegalArgumentException("cantidad no valida");
                }
                if (cantidadIngresar > 0) {
                    System.out.println("ingreso realizado");
                    cuentaSaldo = cuentaSaldo + cantidadIngresar;
                }
                }catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
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
                  }
                } catch (IllegalArgumentException e) {
                  System.out.println(e.getMessage());
                }
                break;
            case 4:
                System.out.println("Gracias hasta pronto");
                break;
            default:
                System.out.println("opcion no valida");
                break;
           }
           } catch (InputMismatchException e) {
            System.out.println("debe introducir un numero");
            scanner.nextLine();
        } 
        } while (opcion != 4);
    }
}
