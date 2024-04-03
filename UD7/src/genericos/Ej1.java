package genericos;

import java.util.Iterator;

public class Ej1<T, V> {
	private T first;
	private V second;

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public V getSecond() {
		return second;
	}

	public void setSecond(V second) {
		this.second = second;
	}

	public static void main(String[] args) {
		Ej1<Integer, Float> obj1 = new Ej1<Integer, Float>();
		obj1.setFirst(2);
		obj1.setSecond((float) 0.5);
		System.out.println("integer: " + obj1.getFirst());
		System.out.println("float: " + obj1.getSecond());

		int[] array = { 1, 2, 3, 4 };
		Ej1<String, int[]> obj2 = new Ej1<String, int[]>();
		obj2.setFirst("Hola");
		obj2.setSecond(array);
		System.out.println(obj2.getFirst());
		for (int x = 0; x < array.length; x++) {
			System.out.print(array[x] + " ");
		}

	}
}
