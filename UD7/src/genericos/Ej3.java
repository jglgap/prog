package genericos;

public class Ej3 {
	static <T> void imprimirArray(T[] t) {
		for (int i = 0; i < t.length; i++)
			System.out.println(t[i].toString());
	}

	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 3, 4 };
		Double[] dobles = { 2.5, 3.5, 4.8 };
		EjPersona pa = new EjPersona("Juan");
		EjPersona pb = new EjPersona("Pepe");
		EjPersona[] p1 = { pa, pb };
		Ej3 a1 = new Ej3();
		a1.imprimirArray(array1);
		a1.imprimirArray(dobles);
		a1.imprimirArray(p1);
	}
}
