import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Rowset {
public static void main(String[] args) {
	
	try(JdbcRowSet rowSet= RowSetProvider.newFactory().createJdbcRowSet()){
		rowSet.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASREmpresa");

	    rowSet.setUsername("alumno");
	    rowSet.setPassword("abc123..");

	    // Asignamos consulta y ejecutamos 
	    rowSet.setCommand("select id, name, lastname, age from person");
	    rowSet.execute();
	    while(rowSet.next()) {
	    	System.out.println("Id: "+ rowSet.getInt(1));
	    	System.out.println("Name: "+rowSet.getString(2));
	    	System.out.println("LastName: "+rowSet.getString(3));
	    	System.out.println("Age: "+ rowSet.getInt(4));
	    }
	    System.out.println("-".repeat(40));
	    while(rowSet.previous()) {
	    	System.out.println("Id: "+ rowSet.getInt(1));
	    	System.out.println("Name: "+rowSet.getString(2));
	    	System.out.println("LastName: "+rowSet.getString(3));
	    	System.out.println("Age: "+ rowSet.getInt(4));
	    }
	    System.out.println("-".repeat(40));
	   rowSet.absolute(3);
	    System.out.println("Id: "+ rowSet.getInt(1));
   		System.out.println("Name: "+rowSet.getString(2));
   		System.out.println("LastName: "+rowSet.getString(3));
   		System.out.println("Age: "+ rowSet.getInt(4));
   		
   		rowSet.moveToInsertRow();
   		rowSet.updateInt("id",5);
   		rowSet.updateString("name", "PAco");
   		rowSet.updateString("lastname", "Buyo");
   		rowSet.updateInt("age", 66);
   		rowSet.insertRow();
   		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
