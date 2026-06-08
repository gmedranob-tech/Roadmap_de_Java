package proyecto;

public class ControlGastos {

	public static void main(String[] args) {

		Gasto gasto1 = new Gasto("Gasolina", 200);
		Gasto gasto2 = new Gasto("Alimentacion", 150);

		double total = gasto1.getMonto() + gasto2.getMonto();

		System.out.println("===== CONTROL DE GASTOS =====");

		System.out.println(gasto1.getDescripcion() + ": Q" + gasto1.getMonto());
		System.out.println(gasto2.getDescripcion() + ": Q" + gasto2.getMonto());

		System.out.println("----------------------------");

		System.out.println("Total gastado: Q" + total);

	}

}