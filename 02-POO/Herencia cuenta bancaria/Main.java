public class Main{
public static void main(String[] args){
    cuentaAhorro miCuentaahorro = new cuentaAhorro ("Ale", "13456",500 ,0.035);
      System.out.println( miCuentaahorro.getSaldo() );
        System.out.println(miCuentaahorro.calcularInteres()); 
         System.out.println( miCuentaahorro.getSaldo() );
         miCuentaahorro.abonarInteres();
         System.out.println(miCuentaahorro.getSaldo());
       Cuenta segndaCuenta = new Cuenta ("Manolo","14568", 300);
        System.out.println( segndaCuenta.getSaldo());
         segndaCuenta.retirarDinero(300);
       System.out.println(segndaCuenta.getSaldo());
}
}