package Examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class AppExamen {
	HashSet<Slot> slotsViernes = new HashSet<>();
	HashSet<Slot> slotsSabado = new HashSet<>();
	HashSet<Grupo> grupos = new HashSet<>();
	private static String url = "jdbc:mariadb://dbalumnos.sanclemente.local:3314/RSR_festival";
	// private static String
	// url="jdbc:mariadb://dbalumnos.sanclemente.local:3314/RSR_festival";
	private static String nomeUsuario = "alumno";
	// private static String nomeUsuario="alumno";
	private static String contraseña = "abc123..";
	// private static String contraseña="abc123..";

	public JdbcRowSet openConnectionInSchool() throws SQLException {
		// conexion en clase
		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
			rowSet.setUrl(url);
			rowSet.setUsername(nomeUsuario);
			rowSet.setPassword(contraseña);

			return rowSet;
		}
	}

	public void rellenarSlots(RowSet rs) throws SQLException {
		rs.setCommand("select idSlot,dia,franja,idGrupo from slots");
		rs.execute();
		while (rs.next()) {
			Slot s = new Slot();
			s.setIdSlot(rs.getInt("idSlot"));
			s.setDia(rs.getString("dia"));
			s.setFranja(rs.getInt("franja"));
			s.setIdGrupo(rs.getInt("idGrupo"));
			if (s.getDia().compareTo("V") == 0) {
				slotsViernes.add(s);
			} else {
				slotsSabado.add(s);
			}
		}
	}

	public boolean insertFestival(Festival f, RowSet rs) throws SQLException {
		// if (revisarPodcastExistenetes(p.getIdPodcast()) {
		if (revisarFestivalExistenetes(f.getIdFest())) {
			System.out.println("ya hay un podcast con ese ID");
			return false;
		} else {
			rs.setCommand("select idFest, nombre, aforo, tipo, presupuesto from festival");
			rs.execute();
			rs.moveToInsertRow();
			rs.updateInt("idFest", f.getIdFest());
			rs.updateString("nombre", f.getNombre());
			rs.updateInt("aforo", f.getAforo());
			rs.updateByte("tipo", f.getTipo());
			rs.updateFloat("presupuesto", f.getPresupuesto());
			rs.insertRow();
			return true;
		}

	}

	public boolean revisarFestivalExistenetes(int idFestival) throws SQLException {
		JdbcRowSet rowSet = openConnectionInSchool();
		rowSet.setCommand("select idFest from festival where idFest = ?");
		rowSet.setInt(1, idFestival);
		rowSet.execute();
		return rowSet.next();

	}

	public boolean actualizarcache(String nombre, RowSet rs, float nuevoCache) throws SQLException {
		Grupo g = new Grupo();
		rs.setCommand("select idGrupo, nombre, cache, tipo from grupos where nombre = ?");
		rs.setString(1, nombre);
		rs.execute();
		rs.next();
		rs.updateFloat("cache", nuevoCache);
		rs.updateRow();

		return true;

	}

	public HashSet<Grupo> rellenarGrupos(RowSet rs) throws SQLException {
		rs.setCommand("select idGrupo, nombre, cache, tipo from grupos");
		rs.execute();
		while (rs.next()) {
			Grupo g = new Grupo();
			g.setIdGrupo(rs.getInt("idGrupo"));
			g.setNombre(rs.getString("nombre"));
			g.setCache(rs.getFloat("cache"));
			g.setTipo(rs.getString("tipo"));
			grupos.add(g);
		}
		return grupos;
	}

	public boolean eliminarGrupo() throws SQLException {
		System.out.println("Introduzca el id del grupo que desea eliminar");
		Grupo g = new Grupo();
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		try (Connection con = DriverManager.getConnection(url, nomeUsuario, contraseña)) {
			try (PreparedStatement stmt = con.prepareStatement("DELETE from grupos WHERE idGrupo = ?")) {
				stmt.setInt(1, id);
				int filasAfectadas = stmt.executeUpdate();
				if(filasAfectadas>0) {
					eliminar(id);
					return true;
				}else {
					System.out.println("no se encontro un grupo con ese id: "+id);
					return false;
				}
				
			}
		}

	}

	private Grupo eliminar(int id) {
		Grupo grupoEliminar= null;
		Iterator<Grupo> it = grupos.iterator();
		while (it.hasNext()) {
			Grupo g=it.next();
			if(g.getIdGrupo()==id) {
				grupoEliminar=g;
			it.remove();
			break;}
		}
		return grupoEliminar;

	}
}
