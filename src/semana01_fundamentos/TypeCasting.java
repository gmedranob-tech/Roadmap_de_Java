package semana01_fundamentos;

public class TypeCasting {

	public static void main(String[] args) {

		// Ejercicio 1: Conversión de double a int
		System.out.println("===== EJERCICIO 1 =====");

		double precio = 25.99;
		int precioEntero = (int) precio;

		System.out.println("Precio original: " + precio);
		System.out.println("Precio convertido: " + precioEntero);

		System.out.println();

		// Ejercicio 2: Conversión automática de int a double
		System.out.println("===== EJERCICIO 2 =====");

		int edad = 20;
		double edadDecimal = edad;

		System.out.println("Edad entera: " + edad);
		System.out.println("Edad decimal: " + edadDecimal);

	}

}