package semana04_poo;

public class MethodOverloading {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		System.out.println("Suma enteros: " + calculadora.sumar(10, 5));

		System.out.println("Suma decimales: " + calculadora.sumar(10.5, 5.2));

	}

}