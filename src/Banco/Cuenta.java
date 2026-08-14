package Banco;

public class Cuenta {
 private String titular;
 double saldo;
 protected String tipo;
 public String numeroCuenta;

 public Cuenta(String titular, double saldo, String tipo, String numeroCuenta) {
     this.titular = titular;
     this.saldo = saldo;
     this.tipo = tipo;
     this.numeroCuenta = numeroCuenta;
 }
 public String getTitular() {
     return titular;
 }
 public double getSaldo() {
     return saldo;
 }
 public void depositar (double monto) {
     saldo += monto;
 }
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de cuenta: " + numeroCuenta);
    }
    
}
