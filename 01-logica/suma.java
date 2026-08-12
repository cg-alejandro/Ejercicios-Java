import java.util.Scanner;


public class suma{
    public int sma() {
        int totalnm = numa + numb;
        return totalnm;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numa = scanner.nextInt();
        System.out.println("ingrese otro numero " );
       int numb = scanner.nextInt();
      int totalnm = numa + numb;
    
    System.out.println("el resultado es " + totalnm );
       
        scanner.close();

    }
    
}