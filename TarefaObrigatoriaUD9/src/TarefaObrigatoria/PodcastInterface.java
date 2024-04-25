package TarefaObrigatoria;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.RowSet;

public interface PodcastInterface {

	public boolean insertPodcast(Podcast p, RowSet rs) throws SQLException;// ALREADY FUNCTIONAL

	public boolean newGenPodcast(Genero g, RowSet rs) throws SQLException; // ALREADY FUNCTIONAL

	public boolean updatePodcast( int id,RowSet rs) throws SQLException;

	public boolean deletePodcast(Podcast p) throws SQLException;// ALREADY FUNCTIONAL

	public void findByPodcastId(int id) throws SQLException; // ALREADY FUNCTIONAL

}
