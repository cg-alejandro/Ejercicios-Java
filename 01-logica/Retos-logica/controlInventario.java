import java.util.Scanner;
public class controlInventario {
    public static void main(String[] args) {
        String[] productos = new String[8];
        int[] stock = new int[8];
        String productoIntroducido;
        int stockIntroducido;
        int posicionProducto;
        int stockNormal = 0;
        boolean noDisponible = true;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < productos.length; i++) {
            System.out.println("introduzca un producto");
            productoIntroducido = scanner.nextLine();
            productos[i] = productoIntroducido;
            System.out.println("introduzca su stock");
            stockIntroducido = scanner.nextInt();
            stock[i] = stockIntroducido;
            scanner.nextLine();
        }
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == 0) {
                posicionProducto = i;
                System.out.println("no hay stock de " + productos[i]);
            }else if(stock[i] >= 1 && stock[i] <= 3) {
                System.out.println("stock bajo de " + productos[i]);
            }else{
                stockNormal++;
            }
        }
        System.out.println("productos con stock normal " + stockNormal);
        System.out.println("nombre del producto que desea");
        String bscador = scanner.nextLine();
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equals(bscador)){
                System.out.println("quedan " + stock[i] + " unidades del producto");
                noDisponible = false;
                break;
                }
    }    
    if (noDisponible) {
         System.out.println("Producto no disponible");
    }
}
}
