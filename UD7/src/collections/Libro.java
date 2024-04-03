package collections;

public class Libro {
String num;
String nome;
String autor;
public Libro(String num, String nome, String autor) {
	super();
	this.num = num;
	this.nome = nome;
	this.autor = autor;
}
@Override
public String toString() {
	return "Libro [num=" + num + ", nome=" + nome + ", autor=" + autor + "]";
}

}
