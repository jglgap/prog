package TarefaObrigatoria;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class App implements PodcastInterface {

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
		if(p.revisarPodcastExistenetes(rs)) {
			System.out.println("ya hay un podcast con ese ID");
			return false;
		}else {
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
			return true;
		}

	}

	@Override
	public boolean newGenPodcast(Genero g, RowSet rs) throws SQLException {
		if (g.revisarGenerosExistentes(rs)) {
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

	public List viewAllPodcast(RowSet rs, Podcast p) throws SQLException{
		rs.setCommand("select idPodcast,titulo,tipo,calidad,duracion,periocidad,formato_video,autor from Podcast");
		rs.execute();
		List <Podcast> viewAllPodcast= new ArrayList<>();
		while(rs.next()) {
			p.setIdPodcast(rs.getInt(1));
			p.setTitulo(rs.getString(2));
			p.setTipo(rs.getInt(3));
			p.setCalidad(rs.getString(4));
			p.setDuracion(rs.getInt(5));
			p.setPeriodicidad(rs.getString(6));
			p.setVideoFormat(rs.getString(7));
			//int cod_autor =rs.getInt(8);
			viewAllPodcast.add(p);
		}
		return viewAllPodcast;
		
	}
	
	@Override
	public boolean deletePodcast(Podcast p, RowSet rs) throws SQLException {
		rs.setCommand("select idPodcast,titulo,tipo,calidad,duracion,periocidad,formato_video,autor from Podcast where idPodcast = ?");
		rs.execute();
		rs.setInt(1, p.getIdPodcast());
		rs.deleteRow();
		return true;
	}

	@Override
	public Podcast findByPodcastId(int id, RowSet rs) throws SQLException {
		
		return null;
	}

}
