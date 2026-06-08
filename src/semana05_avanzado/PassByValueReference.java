package semana05_avanzado;

public class PassByValueReference {

	public static void cambiarValor(int numero) {

		numero = 100;

	}

	public static void main(String[] args) {

		int numero = 50;

		cambiarValor(numero);

		System.out.println(numero);

	}

}