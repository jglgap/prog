package TarefaObrigatoria;

import java.sql.SQLException;
import java.util.HashSet;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Podcast {

	private int idPodcast;
	private String titulo;
	private int tipo;
	private String calidad;
	private int duracion;
	private String periocidad;
	private String videoFormat;
	private Autor autor;
	HashSet<Genero> gen = new HashSet<>();

	public Podcast(int idPodcast, String titulo, int tipo, String calidad, int duracion, String periodicidad,
			String videoFormat, Autor autor) {

		this.idPodcast = idPodcast;
		this.titulo = titulo;
		this.tipo = tipo;
		this.calidad = calidad;
		this.duracion = duracion;
		this.periocidad = periodicidad;
		this.videoFormat = videoFormat;
		this.autor= autor;
	}

	public Podcast() {
	}

	public int getIdPodcast() {
		return idPodcast;
	}

	public void setIdPodcast(int idPodcast) {
		this.idPodcast = idPodcast;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getPeriodicidad() {
		return periocidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periocidad = periodicidad;
	}

	public String getVideoFormat() {
		return videoFormat;
	}

	public void setVideoFormat(String videoFormat) {
		this.videoFormat = videoFormat;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public boolean revisarPodcastExistenetes() throws SQLException {
		try(JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()){
			rowSet.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/RASRpodcast_bd");
			rowSet.setUsername("alumno");
			rowSet.setPassword("abc123..");
			rowSet.setCommand("select idPodcast from Podcast where idPodcast = ?");
			rowSet.setInt(1, this.idPodcast);
			rowSet.execute();
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Podcast [idPodcast=" + idPodcast + ", titulo=" + titulo + ", tipo=" + tipo + ", calidad=" + calidad
				+ ", duracion=" + duracion + ", periocidad=" + periocidad + ", videoFormat=" + videoFormat + ", autor="
				+ autor.getIdAutor() + "]";
	}

	
}
