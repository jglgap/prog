package altas_bajas_modificaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface IPersona {
	   public  Connection openConnection() throws SQLException;
	    public  int insertPerson(Connection connection, Persona person) throws SQLException;
	    public  void updatePersonAgeById(Connection connection, int id, int newAge) throws SQLException;
	    public  List selectAllPeople(Connection connection) throws SQLException;
	    public int deletePerson(Connection connection, int id) throws SQLException;
	    public Persona maxAgePerson(Connection connection) throws SQLException;
}
