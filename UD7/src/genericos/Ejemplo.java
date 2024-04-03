package genericos;

public class Ejemplo {
	public static <V> void imprimeArray(V[] arr) {
		for (V val : arr)
			System.out.printf("%s ", val);
		System.out.println();
	}

	public static void main(String[] args) {
		Double[] a1 = { 3.5, 2.0, (double) 4, -1.67 };
		Integer[] a2 = { 5, 0, 4, -1 };
		String[] a3 = { "mi", "casa,", "teléfono " };
		imprimeArray(a1);
		imprimeArray(a2);
		imprimeArray(a3);
	}
}
