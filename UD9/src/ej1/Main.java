package ej1;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Main implements RowIterface {

	@Override
	public JdbcRowSet openConnection() throws SQLException {
		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
			rowSet.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASREmpresa");
			rowSet.setUsername("alumno");
			rowSet.setPassword("abc123..");
			return rowSet;
		}

	}

	@Override
	public void devolverRegistros(JdbcRowSet rs) throws SQLException {
		rs.setCommand("SELECT id,name,lastname,age from person");
		rs.execute();
		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1));
			System.out.println("Name: " + rs.getString(2));
			System.out.println("LastName: " + rs.getString(3));
			System.out.println("Age: " + rs.getInt(4));
		}

	}

	@Override
	public void numeroDeRegistros(JdbcRowSet rs) throws SQLException {
		rs.setCommand("select * from person");
		rs.execute();
		int tot = 0;
		while (rs.next()) {
			tot++;
		}
		System.out.println("El total de registros es :" + tot);
	}

	@Override
	public void mostrarRegistroConcreto(JdbcRowSet rs, int fila, boolean decison) throws SQLException {
		rs.setCommand("SELECT id,name,lastname,age from person");
		rs.execute();
		rs.absolute(fila);
		System.out.println("Id: " + rs.getInt(1));
		System.out.println("Name: " + rs.getString(2));
		System.out.println("LastName: " + rs.getString(3));
		System.out.println("Age: " + rs.getInt(4));
		if(decison==true) {
			System.out.println("Mostrando registro anterior");
			if(rs.previous()){
				System.out.println("Id: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
				System.out.println("LastName: " + rs.getString(3));
				System.out.println("Age: " + rs.getInt(4));
			}else {
				System.out.println("No hay un registro previo.");
			}
		}else {
			System.out.println("Mostrando registro posterior");
			if(rs.next()) {
				System.out.println("Id: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
				System.out.println("LastName: " + rs.getString(3));
				System.out.println("Age: " + rs.getInt(4));
			}else {
				System.out.println("No hay registro siguiente.");
			}
		}	
	}
	@Override
	public void actualizarEdad(JdbcRowSet rs, int posicion, int nuevaEdad) throws SQLException {
		rs.setCommand("select age from person where id= ?");
		rs.execute();
		rs.absolute(posicion);
		System.out.println("Age: " + rs.getInt(1));
		rs.setInt(1, posicion);
		rs.updateInt("age", nuevaEdad);
		rs.updateRow();
		System.out.println("Age: " + rs.getInt(1));
		
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		try (JdbcRowSet rowSet = m.openConnection()) {
			m.devolverRegistros(rowSet);
			m.numeroDeRegistros(rowSet);
			m.mostrarRegistroConcreto(rowSet, 3, true);
			m.actualizarEdad(rowSet, 5, 2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
