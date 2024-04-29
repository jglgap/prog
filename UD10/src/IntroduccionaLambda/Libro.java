package IntroduccionaLambda;

public class Libro {
String titulo;
String genero;
int paginas;
public Libro(String titulo, String genero, int paginas) {
	super();
	this.titulo = titulo;
	this.genero = genero;
	this.paginas = paginas;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public int getPaginas() {
	return paginas;
}
public void setPaginas(int paginas) {
	this.paginas = paginas;
}
}
