package Cliente;
import Banco.Cuenta;
import Banco.Banco;

public class App {
    public static void main(String[] args) {
    Cuenta c  = new Cuenta("Ana torres", 500000, "Ahorros", AH-001");
System.out.println(c.umeroCuenta());
System.out.println(c.getTitular());
System.out.println(c.getSaldo());

c.depositar(100000);
c.motrarInfo();

System.out.println("---");

cuentaVIP vip =new CcuentaVIP("Carlos Rios, 2000000, 500000");
vip.mostrarInfo();

System.out.println("---");
banco banco = new Banco();
banco.operar(c);
    }
}

