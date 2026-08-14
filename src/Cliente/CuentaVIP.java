package Cliente;
import Banco.Cuenta;
public class CuentaVIP extends Cuenta {
private double limiteCredito;


public CuentaVIP(String titular, double saldo, double limite) {
    super(titular, saldo, "VIP", "VIP-001");
    this.limiteCredito = limite;

}

public void mostrarInfo(){
    System.out.println("tipo:" + tipo);
    System.out.println("numero:" + numeroCuenta);
    System.out.println("titular:" + getTitular());
    System.out.println("limite de credito:" + limiteCredito);

}



}
