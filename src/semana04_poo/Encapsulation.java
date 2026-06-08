package semana04_poo;

public class Encapsulation {

	public static void main(String[] args) {

		CuentaBancaria cuenta = new CuentaBancaria();

		cuenta.depositar(500);

		System.out.println("Saldo: Q" + cuenta.getSaldo());

	}

}