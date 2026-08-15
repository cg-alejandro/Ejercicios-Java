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
} 

