package serializacion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class EmployeeWriter implements Serializable{
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArrayList<Employee> employees= new ArrayList<>();
		Employee e1= new Employee("1","Manolo","Lama");
		Employee e2= new Employee("2","Diego","Lomo");
		Employee e3= new Employee("3","Arturo","Perez");
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
	
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("empleados.txt"));
			oos.writeObject(employees);
			oos.close();
	
		
			
	}
}
