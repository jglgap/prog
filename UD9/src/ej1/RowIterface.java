package ej1;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

public interface RowIterface {
	public JdbcRowSet openConnection() throws SQLException;
	public void devolverRegistros(JdbcRowSet rs) throws SQLException;
	public void numeroDeRegistros(JdbcRowSet rs) throws SQLException;
	public void mostrarRegistroConcreto(JdbcRowSet rs, int x, boolean valor) throws SQLException;
	public void actualizarEdad(JdbcRowSet rs, int posicion, int nuevaEdad) throws SQLException;
}
