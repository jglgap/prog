package record;

public class Ejemplo {
	public record Person (String name, String address) {}
	public static void main(String[] args) {
		Person person = new Person("John Doe", "100 Linda Ln.");
		
}
}
