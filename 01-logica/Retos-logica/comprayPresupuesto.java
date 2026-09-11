/* Ejercicio: pedir al usuario 10 productos y su precio,
pedir el presupuesto que tiene el usuario y calcular cuantos
productos puede comprar, cuanto dinero ha gastado y cual
es el primer producto de la lista que no pudo comprar
 */
import java.util.Scanner;
public class comprayPresupuesto {
    public static void main(String[] args) {
        String[] productos = new String[10];
        double[] precios = new double[10];
        String productoIntroducido;
        double precioIntroducido;
        double presupuesto;
        int posicion = 0;
        int contadorProductos = 0;
        double dineroGastado = 0;
        boolean sinDinero = false;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < precios.length; i++) {
            System.out.println("introduzca un producto");
            productoIntroducido = scanner.nextLine();
            productos[i] = productoIntroducido;
            System.out.println("introduzca su precio");
            precioIntroducido = scanner.nextDouble();
            precios[i] = precioIntroducido;
            scanner.nextLine();
        }
        System.out.println("introduce el presupuesto");
        presupuesto = scanner.nextDouble();
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] <= presupuesto) {
                presupuesto = presupuesto - precios[i];
                contadorProductos++;
                posicion = i + 1;
                dineroGastado =  dineroGastado + precios[i];
            }else{
                sinDinero = true;
                break;
            }

        }
        System.out.println("puede comprar " + contadorProductos + " productos");
        System.out.println("gastado " + dineroGastado + "€");
        if (sinDinero) {
           System.out.println("no puede comprar " + productos[posicion]); 
        }else{
            System.out.println("alcanzo para comprar todos los productos");
        }
        
       scanner.close(); 
    }
}
