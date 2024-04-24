package altas_bajas_modificaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

public class Cons implements IPersona {

	@Override
	public Connection openConnection() throws SQLException {
		String sURL = "jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASREmpresa";
		Connection con = DriverManager.getConnection(sURL, "alumno", "abc123..");
		System.out.println("Se ha realizado la conexion");
		return con;

	}
	
	public Connection openBasicConnection() throws SQLException {
		BasicDataSource dataSource = new BasicDataSource();
			 dataSource.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASREmpresa");
		        dataSource.setUsername("alumno");
		        dataSource.setPassword("abc123..");
		        dataSource.setInitialSize(5);
		        dataSource.setMaxTotal(10);
		        Connection conn = dataSource.getConnection();
		        System.out.println("conection done");
		return conn;
		
	}

	@Override
	public int insertPerson(Connection connection, Persona person) throws SQLException {
		try (PreparedStatement stmt = connection
				.prepareStatement("INSERT INTO person(id,name,lastname,age) values (?,?,?,?)")) {
			stmt.setInt(1, person.getId());
			stmt.setString(2, person.getName());
			stmt.setString(3, person.getLastName());
			stmt.setInt(4, person.getAge());

			return stmt.executeUpdate();
		}
	}

	@Override
	public void updatePersonAgeById(Connection connection, int id, int newAge) throws SQLException {
		try (PreparedStatement stmt = connection.prepareStatement("UPDATE person SET age = ? where id=  ? ")) {
			stmt.setInt(1, newAge);
			stmt.setInt(2, id);
			stmt.executeUpdate();
		}

	}

	@Override
	public List selectAllPeople(Connection connection) throws SQLException {
		String query = "SELECT id, name, lastname, age FROM person";
		List<Persona> personas = new ArrayList<>();
		try (Statement stmt = connection.createStatement()) {
			try (ResultSet res = stmt.executeQuery(query)) {

				while (res.next()) {
					Persona pTemp = new Persona();
					pTemp.setId(res.getInt(1));
					pTemp.setName(res.getString(2));
					pTemp.setLastName(res.getString(3));
					pTemp.setAge(res.getInt(4));
					personas.add(pTemp);
				}
			}
		}
		return personas;
	}

	@Override
	public int deletePerson(Connection connection, int id) throws SQLException {
		try (PreparedStatement stmt = connection.prepareStatement("DELETE FROM person WHERE id= ?")) {
			stmt.setInt(1, id);
			return stmt.executeUpdate();
		}
	}

	@Override
	public Persona maxAgePerson(Connection connection) throws SQLException {
		Persona pTemp = new Persona();
		try (Statement stmt = connection.createStatement()) {
			try (ResultSet res = stmt.executeQuery("SELECT id, name, lastname, age FROM person group by age desc limit 1")) {
				while (res.next()) {
					pTemp.setId(res.getInt(1));
					pTemp.setName(res.getString(2));
					pTemp.setLastName(res.getString(3));
					pTemp.setAge(res.getInt(4));

				}
			}	
		}
		return pTemp;
	}
public static void main(String[] args) {
	Cons c= new Cons();
	try (Connection con= c.openBasicConnection()) {
		Persona p= new Persona(7,"Miguel","Caamaño",3);
		c.insertPerson(con, p);
		c.updatePersonAgeById(con,7, 24);
		c.selectAllPeople(con);
		c.deletePerson(con, 35);
		c.maxAgePerson(con);
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
}
