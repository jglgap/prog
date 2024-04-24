package TarefaObrigatoria;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Genero {

	private int idGenero;
	private String nombre;

	public Genero(int idGenero, String nombre) {
		this.idGenero = idGenero;
		this.nombre = nombre;
	}

	public Genero() {
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean revisarGenerosExistentes() throws SQLException {
		try(JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()){
			rowSet.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASRpodcast_bd");
			rowSet.setUsername("alumno");
			rowSet.setPassword("abc123..");
			rowSet.setCommand("select idGeneros from Generos where idGeneros = ?");
			rowSet.setInt(1, this.idGenero);
			rowSet.execute();
			return false;
		}
	}

}
