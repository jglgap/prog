package CentroAcademico;

public interface Aplicables {
	public boolean crearAlumno(String Expediente, String nombre);

	public boolean crearAsignatura(String pCodigo, String pNombre, String pCreditos);

	public boolean matricular(String expediente, String codigo);

	public void imprimirAsignatura(String codigo) throws CentroAcaException;

	public void imprimirAlumno(String expediente);

	public void imprimirAlumnos();

	public boolean agreagarCalificacion(String expediente, String codigo, double calificacion);

	public void compararAlumno(String expediente1,String expediente2);

}
