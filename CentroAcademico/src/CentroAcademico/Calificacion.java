package CentroAcademico;

public class Calificacion {
	private double nota;
	Asignatura asig;
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Asignatura getAsig() {
		return asig;
	}

	public void setAsig(Asignatura asig) {
		this.asig = asig;
	}

	public void checkNota(double nota) {
		if (nota < 0 || nota > 10) {
			System.out.println("La nota no esta entre los rangos permititdos.");
		} else {
			this.nota = nota;
			System.out.println("La nota se encuentar en los parametros correctos");
		}
	}

	@Override
	public String toString() {
		return  " asignatura "+ this.asig+" calificacion= " + nota
				;
	}
}
