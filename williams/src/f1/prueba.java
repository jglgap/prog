package f1;
import java.util.Scanner;

public class prueba {
    // Atributos
    private String nombre;
    private String nacionalidad;
    private int presupuesto;
    private Piloto[] pilotos = new Piloto[2];

    // Scanner
    Scanner entrada = new Scanner(System.in);

    // Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    // Constructores
    public prueba() {
        // Inicializar el array de pilotos en el constructor
        for (int i = 0; i < pilotos.length; i++) {
            pilotos[i] = new Piloto();
        }
    }

    public prueba(String pNombre, String pNacionalidad, int pPresupuesto) {
        this.nombre = pNombre;
        this.nacionalidad = pNacionalidad;
        this.presupuesto = pPresupuesto;
    }

    // Método de alta
    public void alta() {
        System.out.println("Introducir nombre de la escudería");
        this.setNombre(entrada.nextLine());

        System.out.println("Introducir nacionalidad de la escudería");
        this.setNacionalidad(entrada.nextLine());

        // Introducir información del primer piloto
        System.out.println("Introduzca nombre del primer piloto");
        pilotos[0].setNombre(entrada.nextLine());
        System.out.println("Introduzca dorsal del primer piloto");
        pilotos[0].setDorsal(entrada.nextInt());
        System.out.println("Introducir salario del primer piloto");
        pilotos[0].setSalario(entrada.nextInt());
        System.out.println("Introducir índice de popularidad del primer piloto");
        pilotos[0].setRrss(entrada.nextInt());
        System.out.println("Introducir tiempo de clasificación del primer piloto");
        pilotos[0].setTiempoCalificacion(entrada.nextDouble());

        // Introducir información del segundo piloto (añadir más código según necesidad)
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre de la escudería: " + this.nombre + " Nacionalidad de la escudería: " + this.nacionalidad
                + "\n" + "Presupuesto de la escudería: " + this.presupuesto + " Primer piloto: " + pilotos[0]
                + " Segundo piloto: " + pilotos[1];
    }
}