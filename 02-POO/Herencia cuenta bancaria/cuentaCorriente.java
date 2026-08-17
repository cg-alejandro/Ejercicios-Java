public class cuentaCorriente extends Cuenta{
    private double comision;
    public cuentaCorriente(String titular, String numeroCuenta, double saldo, double comision){
        super(titular, numeroCuenta, saldo);
        this.comision= comision;
    }public double getComision() {
            return comision;
    }public double calcularComision(double cantidad){
         double cantidadCalculada= cantidad * getComision();
         return cantidadCalculada;
}@Override
    public void ingresarDinero(double cantidad){
     double cantidadIngresada = cantidad- calcularComision(cantidad);
    super.ingresarDinero(cantidadIngresada);

    }
}