package semana04_poo;

public class CuentaBancaria {

	private double saldo;

	public void depositar(double monto) {

		saldo += monto;

	}

	public double getSaldo() {

		return saldo;

	}

}