package semana02_control_flujo;

public class Arrays {

	public static void main(String[] args) {

		System.out.println("===== EJERCICIO 1 =====");

		String[] cursos = {"Precálculo", "Álgebra Lineal", "Algoritmos"};

		System.out.println("Primer curso: " + cursos[0]);
		System.out.println("Segundo curso: " + cursos[1]);
		System.out.println("Tercer curso: " + cursos[2]);

		System.out.println();

		System.out.println("===== EJERCICIO 2 =====");

		for (int i = 0; i < cursos.length; i++) {

			System.out.println(cursos[i]);

		}

	}

}