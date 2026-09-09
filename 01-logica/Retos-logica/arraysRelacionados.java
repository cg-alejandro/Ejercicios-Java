/* Ejercicio: pedir al usuario 10 productos y su precio
calcular precio medio, cuantos productos hay sobre la media 
y cual es el primero que esta sobre la media
*/
import java.util.Scanner;
public class arraysRelacionados {

    public static void main(String[] args) {
        String[] productos = new String[8];
        double[] precios = new double[8];
        String productoIntroducido;
        double precioIntroducido;
        double suma = 0;
        double precioMedio = 0;
        int sobreMedia = 0;
        int primeroSobre = 0; 
        boolean ningunoSobre = true;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < precios.length; i++) {
            System.out.println("introduzca un producto");
            productoIntroducido = scanner.nextLine();
            productos[i] = productoIntroducido;
            System.out.println("introduzca su precio");
            precioIntroducido = scanner.nextDouble();
            precios[i] = precioIntroducido;
            suma = suma + precios[i];
            precioMedio = suma / 8;
            scanner.nextLine();
        }
          for (int i = 0; i < precios.length; i++) {
          if (precios[i] > precioMedio) {
            sobreMedia++;
          }
          
        }
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > precioMedio) {
              primeroSobre = i;
              ningunoSobre = false;
              break;
        }
      }
        System.out.println("precio medio: " + precioMedio);
        System.out.println("productos sobre la media: " + sobreMedia);
        if (ningunoSobre) {
          System.out.println("no hay productos sobre la media");
        }else{
          System.out.println(productos[primeroSobre] + " es el primer producto sobre la media con precio de: " + precios[primeroSobre]);
        }
        scanner.close();
    }
}