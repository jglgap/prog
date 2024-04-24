package TarefaObrigatoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class App implements PodcastInterface {

	List<Podcast> viewAllPodcast = new ArrayList<>();
	
	public JdbcRowSet openConnectionInSchool() throws SQLException {
		// conexion en clase
		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
			rowSet.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASRpodcast_bd");
			rowSet.setUsername("alumno");
			rowSet.setPassword("abc123..");
			return rowSet;
		}
	}

	public JdbcRowSet openConnectionAtHome() throws SQLException {
		// conexion en casa
		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
			rowSet.setUrl("");
			rowSet.setUsername("");
			rowSet.setPassword("");
			return rowSet;
		}

	}

	@Override
	public boolean insertPodcast(Podcast p, RowSet rs) throws SQLException {
		if (p.revisarPodcastExistenetes()) {
			System.out.println("ya hay un podcast con ese ID");
			return false;
		} else {
			rs.setCommand("select idPodcast,titulo,tipo,calidad,duracion,periocidad,formato_video,autor from Podcast");
			rs.execute();
			rs.moveToInsertRow();
			rs.updateInt("idPodcast", p.getIdPodcast());
			rs.updateString("titulo", p.getTitulo());
			rs.updateInt("tipo", p.getTipo());
			rs.updateString("calidad", p.getCalidad());
			rs.updateInt("duracion", p.getDuracion());
			rs.updateString("periocidad", p.getPeriodicidad());
			rs.updateString("formato_video", p.getVideoFormat());
			rs.updateInt("autor", p.getAutor().getIdAutor());
			rs.insertRow();
			return true;
		}

	}

	@Override
	public boolean newGenPodcast(Genero g, RowSet rs) throws SQLException {
		if (g.revisarGenerosExistentes()) {
			System.out.println("Ya hay un genero con ese ID");
			return false;
		} else {
			rs.setCommand("select idGeneros, nombre from Generos");
			rs.execute();
			rs.moveToInsertRow();
			rs.updateString("nombre", g.getNombre());
			rs.updateInt("idGeneros", g.getIdGenero());
			rs.insertRow();
			return true;
		}
	}

	@Override
	public boolean updatePodcast(Podcast p, RowSet rs) throws SQLException {
		return false;
	}

	public List viewAllPodcast(RowSet rs) throws SQLException {
		rs.setCommand("select idPodcast,titulo,tipo,calidad,duracion,periocidad,formato_video,autor from Podcast");
		rs.execute();
		while (rs.next()) {
			Podcast p = new Podcast();
			p.setIdPodcast(rs.getInt(1));
			p.setTitulo(rs.getString("titulo"));
			p.setTipo(rs.getInt("tipo"));
			p.setCalidad(rs.getString("calidad"));
			p.setDuracion(rs.getInt("duracion"));
			p.setPeriodicidad(rs.getString("periocidad"));
			p.setVideoFormat(rs.getString("formato_video"));
			p.setAutor(checkAuthor( rs.getInt("autor")));
			viewAllPodcast.add(p);
		}
		return viewAllPodcast;

	}
	
	private Autor checkAuthor( int idAutor) throws SQLException{
		try(JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()){
			rowSet.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASRpodcast_bd");
			rowSet.setUsername("alumno");
			rowSet.setPassword("abc123..");
		rowSet.setCommand("select idAutor, dni, apellidos, nombre from Autor");
		rowSet.execute();
		while(rowSet.next()) {
			if(rowSet.getInt("idAutor") == idAutor ) {
				return new Autor(rowSet.getInt("idAutor"),rowSet.getString("dni"),rowSet.getString("apellidos"),rowSet.getString("nombre"));
			}
		}}
		return null;
		
	}
	
	@Override
	public boolean deletePodcast(Podcast p) throws SQLException {
		String sURL = "jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASRpodcast_bd";
		try(Connection con = DriverManager.getConnection(sURL, "alumno", "abc123..")){
		try (PreparedStatement stmt = con.prepareStatement("DELETE from Podcast WHERE idPodcast = ?")) {
			stmt.setInt(1, p.getIdPodcast());
			stmt.executeUpdate();
			return true;
		}}
	}

	@Override
	public Podcast findByPodcastId(int id, RowSet rs) throws SQLException {

		return null;
	}

	public static void main(String[] args) {
		App a = new App();
		Podcast p = new Podcast(80, "venezuela", 0, "alta", 4, "mucha","Mp4",new Autor(1,"","",""));
		//Genero g = new Genero(7,"Peleas");
		try (JdbcRowSet rowSet = a.openConnectionInSchool()) {
			//a.insertPodcast(p, rowSet);
			//a.newGenPodcast(g, rowSet);
			a.deletePodcast(p);
			a.viewAllPodcast(rowSet);
			System.out.println(a.viewAllPodcast);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}
