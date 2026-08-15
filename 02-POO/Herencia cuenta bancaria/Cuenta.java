public class Cuenta{
    private String titular;
    private String numeroCuenta;
    private double saldo;

public Cuenta(String titular, String numeroCuenta, double saldo){
  this.titular = titular;
   this.numeroCuenta= numeroCuenta;
     this.saldo= saldo;
     
}public double getSaldo(){
     return saldo;
    }
    public void ingresarDinero(double cantidad){
        if( cantidad > 0){
            System.out.println("ingreso realizado con exito");
             this.saldo= cantidad + saldo;
        }else{
            System.out.println("cantidad no valida");
        }
    }
    public void retirarDinero(double cantidad){
        if( cantidad > 0 && cantidad <= this.saldo){
            System.out.println("retirada realizada con exito");
             this.saldo= saldo - cantidad;
        }else{
            System.out.println("cantidad no valida");
        }
    }
    public String getTitular(){
        return titular;

    }
    public String getNumeroCuenta(){
        return numeroCuenta;

    }
} public class cuentaAhorro extends Cuenta {
       private double interes;
    public cuentaAhorro(String titular, String numeroCuenta, double saldo, double interes){
       super(titular, numeroCuenta, saldo);
       this.interes = interes;
    }public double getInteres(){
        return interes;
       }public double calcularInteres(){
          return interes *getSaldo();
         }
         public double saldoFinal(){
            return calcularInteres()+getSaldo();
         }
         public void abonarInteres(){
            ingresarDinero(calcularInteres());
           
         }
}
public class main{
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
