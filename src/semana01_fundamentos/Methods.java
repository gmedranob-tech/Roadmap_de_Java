package semana01_fundamentos;

public class Methods {

	public static void main(String[] args) {

		System.out.println("===== EJERCICIO 1 =====");

		saludar(); 

		System.out.println();
		

		System.out.println("===== EJERCICIO 2 =====");

		int resultado = sumar(10, 5); 

		System.out.println("Resultado: " + resultado);

	}

	public static void saludar() { // Metodo sin retorno

		System.out.println("Hola, bienvenido");

	}

	public static int sumar(int num1, int num2) { // Metodo con retorno

		return num1 + num2;

	}

}
