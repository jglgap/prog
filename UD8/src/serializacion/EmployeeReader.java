package serializacion;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EmployeeReader {
	public static ObjectInputStream ois;
public static void main(String[] args) throws ClassNotFoundException, IOException {
	ArrayList<Employee> employees= new ArrayList<>();
	try {
		 ois= new ObjectInputStream(Files.newInputStream(Paths.get("empleados.txt")));
	}catch (IOException ioException) {
		   System.err.println("Erro abrindo ficheiro.");
	         System.exit(1);
	}
	
		ArrayList Employee = (ArrayList) ois.readObject();
		System.out.println(Employee);
	
}}
