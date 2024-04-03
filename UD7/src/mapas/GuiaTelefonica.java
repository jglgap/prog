package mapas;

import java.util.TreeMap;

public class GuiaTelefonica {
	public static void main(String[] args) {
		TreeMap<String, String> contactos = new TreeMap<>();
		contactos.put("Messi", "101010101");
		contactos.put("Cr7", "777777777");
		contactos.put("Alonso", "333333333");
		contactos.put("Topuria", "666666666");
		contactos.put("Nadal", "500500500");
		contactos.put("Pele", "999999999");

		contactos.forEach((nombre, numtelef) -> System.out.println(nombre + "=>" + numtelef));

		System.out.println("-".repeat(40));
		contactos.replace("Topuria", "El matador");
		System.out.println(contactos.get("Topuria"));

		System.out.println("-".repeat(40));
		contactos.forEach((nombre, numtelef) -> System.out.println(nombre + "=>" + numtelef));

	}

}
