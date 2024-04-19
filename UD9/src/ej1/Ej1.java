package ej1;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Ej1 {
public static void main(String[] args) {
	try(JdbcRowSet rowSet= RowSetProvider.newFactory().createJdbcRowSet()){
		rowSet.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASREmpresa");
		rowSet.setUsername("alumno");
		rowSet.setPassword("abc123..");
		rowSet.setCommand("SELECT id,name,lastname,age from person");
		rowSet.execute();
		
		int total=0;
		while(rowSet.next()) {//obtener todos los registros
			System.out.println("Id: "+ rowSet.getInt(1));
	    	System.out.println("Name: "+rowSet.getString(2));
	    	System.out.println("LastName: "+rowSet.getString(3));
	    	System.out.println("Age: "+ rowSet.getInt(4));
	    	total ++;
		}
		System.out.println("numero de filas: "+ total);//imprimir total
		
		//otra manera de imprimir el total
		  /*boolean ultimo = rowSet.last(); 
		    int total = 0;
		    if (ultimo) { 
		        total = rowSet.getRow();
		    }
		    System.out.println(total);*/
		
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
}
