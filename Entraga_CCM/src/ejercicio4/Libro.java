package ejercicio4;

public class Libro {

	  int ISBN;
	 String titulo;
	 String autor;
	 int NumPag;
	
	//constructor
	
	public Libro(){
		this.ISBN=0;
		this.titulo="---";
		this.autor="---";
		this.NumPag=0;
	}
	
	Libro(int ISBN,String tit, String aut, int numPag){
		this.ISBN= ISBN;
		this.titulo= tit;
		this.autor= aut;
		this.NumPag= numPag;
	
	}
	
	//Setters&Getters
	
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPag() {
		return NumPag;
	}

	public void setNumPag(int numPag) {
		NumPag = numPag;
	}
	
	//ToString
	
	public String toString(){
		return  "ISBN:"+this.getISBN()+"\n"+"Titulo: "+this.getTitulo()+"\n"+
				"Autor: "+this.getAutor()+"\n"+"Numero de paginas: "+this.getNumPag();}
		
		//comparacion
		public void comparar(Libro a) {
			if(a.getNumPag()>getNumPag()) {
				System.out.println("El libro titulado "+a.getTitulo()+" tiene más páginas");
			}
			else {
				System.out.println("El libro titulado "+getTitulo()+" tiene más páginas");
			}
		}
		
	}
	
	

