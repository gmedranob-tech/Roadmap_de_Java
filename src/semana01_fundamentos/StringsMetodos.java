package semana01_fundamentos;

public class StringsMetodos {

	public static void main(String[] args) {

		// Ejercicio 1: Obtener longitud de una cadena
		System.out.println("===== EJERCICIO 1 =====");

		String nombre = "Gaby Medrano";

		System.out.println("Nombre: " + nombre);
		System.out.println("Cantidad de caracteres: " + nombre.length());

		System.out.println();

		// Ejercicio 2: Convertir a mayúsculas
		System.out.println("===== EJERCICIO 2 =====");

		String universidad = "Universidad Mariano Galvez";

		System.out.println("Texto original: " + universidad);
		System.out.println("Mayúsculas: " + universidad.toUpperCase());

		System.out.println();

		// Ejercicio 3: Convertir a minúsculas
		System.out.println("===== EJERCICIO 3 =====");

		String curso = "PROGRAMACION I";

		System.out.println("Texto original: " + curso);
		System.out.println("Minúsculas: " + curso.toLowerCase());

	}

}