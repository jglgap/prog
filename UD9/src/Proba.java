import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Proba {
	public static void main(String[] args) {
		Connection con = null;
		String sURL = "jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASREmpresa";
		try {

			con = (Connection) DriverManager.getConnection(sURL, "alumno", "abc123..");
			System.out.println("¡Conexión exitosa!");
			try {
				String consulta = "select * from employees where name = ? ";
				PreparedStatement sentencia= con.prepareStatement(consulta);
				sentencia.setString(1,"Pedro Martin");
				sentencia.executeQuery();
				ResultSet res= sentencia.executeQuery();
				while(res.next()) {
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		} catch (Exception e) {
			System.out.println("Error en la conexión:" + e.toString());
		} finally {
			try {
				// Cerramos posibles conexiones abiertas
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println("Error cerrando conexiones: " + e.toString());
			}
		}
		
		
	}
}
