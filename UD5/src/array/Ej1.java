package array;

public class Ej1 {

	public static void main(String[] args) {

		int [] ListaEnteros = {1, 2, 3, 4, 5, 6};

		Ej1 recorrer = new Ej1();

		recorrer.ParesImpares(ListaEnteros);
		}

		public void ParesImpares(int [] ListaEnteros) {
		int pares = 0;
		int impares = 0;

		for (int n = 0; n < ListaEnteros.length; n++) {
		if (n % 2 == 0) {
		pares++;
		} else {
		impares++;
		}
		}
		System.out.println("Hay " + pares + " numeros pares.");
		System.out.println("Hay " + impares + " numeros impares.");
		}
}


