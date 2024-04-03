package object;

import java.util.Objects;

public class Deposito {
	String nome;
	int largo;
	int ancho;
	int alto;
	
	public Deposito(String nome, int Largo, int Ancho, int Alto) {
				this.nome=nome;
				this.largo=Largo;
				this.ancho=Ancho;
				this.alto=Alto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return Objects.hash(alto,ancho,largo,nome);
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}
}

