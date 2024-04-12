package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Prueba {
	public static void main(String[] args) {
		try {
			Connection conex = DriverManager.getConnection("jdbc:sqlite:L:\\Programacion\\repos\\prog\\pr\\lite");
			System.out.println("Conectado lite");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			Connection conex2 = DriverManager.getConnection("jdbc:h2:L:\\Programacion\\repos\\prog\\pr\\h2");
			System.out.println("conectado h2");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
