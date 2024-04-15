import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		String sURL = "jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASREmpresa";
		try (Connection connection = DriverManager.getConnection(sURL, "alumno", "abc123..")) {

			System.out.println("Conexion realizda");

			try {
				
				String consulta = "select posicion, salary from employees where emp_id = ?";
				PreparedStatement sentencia = connection.prepareStatement(consulta);
				sentencia.setInt(1, 100);
				sentencia.executeQuery();

				try (ResultSet resultSet = sentencia.executeQuery()) {
					while (resultSet.next()) {
						System.out.println(resultSet.getDouble(2)); //tambien funciona "salary"
						System.out.println(resultSet.getString("posicion"));
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}

			} catch (Exception e) {
				System.out.println("Error al conectar: " + e.toString());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
