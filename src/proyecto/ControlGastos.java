package proyecto;

public class ControlGastos {

	public static void main(String[] args) {

		Gasto[] gastos = {
				new Gasto("Gasolina", 200),
				new Gasto("Alimentacion", 250),
				new Gasto("Internet", 150),
				new Gasto("Universidad", 809)
		};

		double total = 0;

		System.out.println("===== CONTROL DE GASTOS =====");

		for (int i = 0; i < gastos.length; i++) {

			System.out.println(
					gastos[i].getDescripcion()
					+ ": Q"
					+ gastos[i].getMonto());

			total += gastos[i].getMonto();

		}

		System.out.println("----------------------------");
		System.out.println("Total gastado: Q" + total);

	}

}