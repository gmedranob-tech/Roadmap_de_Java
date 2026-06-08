package semana03_arreglos_poo;

public class ClassesAndObjects {

	public static void main(String[] args) {

		Estudiante estudiante1 = new Estudiante();

		estudiante1.nombre = "Gabriela Medrano";
		estudiante1.carrera = "Ingeniería en Sistemas";

		System.out.println("Nombre: " + estudiante1.nombre);
		System.out.println("Carrera: " + estudiante1.carrera);

	}

}
