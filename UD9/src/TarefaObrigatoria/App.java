package TarefaObrigatoria;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;


public class App implements PodcastInterface{
	
	public App() {
		try {
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			rs.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASRpodcast_bd");
			rs.setUsername("Alumno");
			rs.setPassword("abc123..");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public boolean insertPodcast(Podcast p, RowSet rs) throws SQLException {
		rs.setCommand("select idPodcast,titulo,tipo,calidad,duracion,periocidad,formato_video,autor from Podcast");
		rs.execute();
		rs.moveToInsertRow();
		rs.updateInt("idPodcast", p.getIdPodcast());
		rs.updateString("titulo", p.getTitulo());
		rs.updateInt("tipo",p.getTipo());
		rs.updateString("calidad", p.getCalidad());
		rs.updateInt("duracion", p.getDuracion());
		rs.updateString("periocidad", p.getPeriodicidad());
		rs.updateString("formato_video",p.getVideoFormat());
		rs.updateInt("autor",p.getAutor().getIdAutor());
		rs.insertRow();
		return false;
	}

	@Override
	public boolean newGenPodcast(Genero g, RowSet rs) throws SQLException {
		rs.setCommand("select idGeneros, nombre from Generos");
		rs.execute();
		rs.moveToInsertRow();
		rs.updateString("nombre", g.getNombre());
		rs.updateInt("idGeneros", g.getIdGenero());
		rs.insertRow();
		return false;
	}

	@Override
	public boolean updatePodcast(Podcast p, RowSet rs) throws SQLException {
		return false;
	}

	@Override
	public boolean deletePodcast(Podcast p, RowSet rs) throws SQLException {
		
		return false;
	}

	@Override
	public Podcast findByPodcastId(int id, RowSet rs) throws SQLException {
		
		return null;
	}

	

}
