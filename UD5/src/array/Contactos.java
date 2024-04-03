package array;

public class Contactos {

    /* Attributes */
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;

    /* Constructors */
    public Contactos() {
    }

    public Contactos(String pNombre, String pApellido, String pEmail, int pTelefono) {
        this.nombre = pNombre;
        this.apellido = pApellido;
		this.email=pEmail;
        this.telefono = pTelefono;
    }

    /* Getters & Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
		return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /* Methods */
    public void validadorEmail() {
      
		if (email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
            System.out.println("Email correcto");
        } else {
            System.out.println("Email incorrecto");
        }
    
}

    public String toString() {
        return "Nombre: " + this.getNombre() + "\nApellido: " + this.getApellido() + "\nEmail: " + this.getEmail()
                + "\nTelefono: " + this.getTelefono();
    }


}