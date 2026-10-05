import java.util.ArrayList;
import java.util.Scanner;
public class carritoDecompra {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();
        int opcion;
        double importeTotal = 0;
        double precioMayor;
        String productoMascaro;
        double precioMedio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Carrito de compra----");
        System.out.println("1.- añadir producto");
        System.out.println("2.- mostrar carrito");
        System.out.println("3.- eliminar producto");
        System.out.println("4.- buscar un producto");
        System.out.println("5.- mostrar estadísticas");
        System.out.println("6.- salir");
        do {
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("introduzca un producto");
                    productos.add(scanner.nextLine());
                    System.out.println("introduzca su precio");
                    precios.add(scanner.nextDouble());
                   
                    break;
                case 2:
                    System.out.println(productos);
                    System.out.println(precios);
                    importeTotal = 0;
                    for (int i = 0; i < productos.size(); i++) {
                        importeTotal = importeTotal + precios.get(i);
                    }
                    System.out.println("el importe total es:" + importeTotal);
                    break;
                case 3:
                    System.out.println("introduzca el nombre de un producto");
                       String nombreProducto = scanner.nextLine(); 
                       if (productos.contains(nombreProducto)) {
                        int indice = productos.indexOf(nombreProducto);
                        productos.remove(indice);
                        precios.remove(indice);
                        System.out.println("producto borrado del carrito");
                       }else{
                        System.out.println("el producto no esta en la lista");
                       }
                    break;
                case 4:
                    System.out.println("introduzca el nombre de un producto");
                    nombreProducto = scanner.nextLine();
                    if (productos.contains(nombreProducto)) {
                        int indice = productos.indexOf(nombreProducto);
                        System.out.println("su precio es " + precios.get(indice));
                    }else{
                        System.out.println("el producto no esta en la lista");
                    }
                    break;
                case 5:
                    if (precios.size() == 0) {
                        System.out.println("no hay productos aun");
                    }else{
                    importeTotal = 0;
                    productoMascaro = productos.get(0);
                    precioMayor = precios.get(0);
                    System.out.println("hay " + productos.size() + " productos en total");
                    for (int i = 0; i < precios.size(); i++) {
                        importeTotal = importeTotal + precios.get(i);
                        if (precios.get(i) > precioMayor) {
                            precioMayor = precios.get(i);
                            productoMascaro = productos.get(i);
                        }
                      }
                      System.out.println("el producto mas caro es " + productoMascaro + " cuesta " + precioMayor);
                      precioMedio = importeTotal / precios.size();
                      System.out.println(precioMedio);
                    }
                    
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("opción no valida");
                    break;
            }
        } while (opcion != 6);
        scanner.close();
    }
}
