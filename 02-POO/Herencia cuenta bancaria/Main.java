public class Main{
public static void main(String[] args){
    cuentaAhorro miCuentaahorro = new cuentaAhorro ("Ale", "13456",500 ,0.035);
      System.out.println( miCuentaahorro.getSaldo() );
        miCuentaahorro.ingresarDinero(100); 
         System.out.println( miCuentaahorro.getSaldo() );
         miCuentaahorro.abonarInteres();
         System.out.println(miCuentaahorro.getSaldo());
       cuentaCorriente miCuentacorriente = new cuentaCorriente("Manolo","14568", 300, 0.02);
        System.out.println( miCuentacorriente.getSaldo());
         miCuentacorriente.ingresarDinero(300);
       System.out.println(miCuentacorriente.getSaldo());
}}