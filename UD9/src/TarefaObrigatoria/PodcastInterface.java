package TarefaObrigatoria;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.RowSet;

public interface PodcastInterface {

	public boolean insertPodcast (Podcast p, RowSet rs) throws SQLException;
	public boolean newGenPodcast (Genero g,RowSet rs) throws SQLException;
	public boolean updatePodcast (Podcast p,RowSet rs) throws SQLException;
	public boolean deletePodcast (Podcast p,RowSet rs) throws SQLException;
	List <Podcast> viewAllPodcast= new ArrayList<>();
	public Podcast findByPodcastId (int id,RowSet rs) throws SQLException;
	
}
