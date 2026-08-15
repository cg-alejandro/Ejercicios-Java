public class cuentaAhorro extends Cuenta {
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