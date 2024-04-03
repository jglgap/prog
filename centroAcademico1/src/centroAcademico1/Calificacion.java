package centroAcademico1;



public class Calificacion {
	private double nota;
	Asignaturas asig;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Asignaturas getAsig() {
		return asig;
	}

	public void setAsig(Asignaturas asig) {
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
		return " calificaion= " + nota;
	}
}
